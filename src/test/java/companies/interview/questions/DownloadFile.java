package companies.interview.questions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class DownloadFile {

    public static void main(String[] args) throws InterruptedException {

        String jenkinsDownloadFolderPath = System.getProperty("user.dir")+ File.separator+"JenkinsDownloads";
        File jenkinsDownloadFileDir = new File(jenkinsDownloadFolderPath);

        if(!jenkinsDownloadFileDir.exists()){
            System.out.println("Jenkins folder not present");
            if(jenkinsDownloadFileDir.mkdir()) {
                System.out.println("Created Jenkins Directory");
            }
            }

            Map<String,Object> prefs = new HashMap<>();
            prefs.put("download.default_directory",jenkinsDownloadFolderPath);
            prefs.put("download.prompt_for_download",false);
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setExperimentalOption("prefs",prefs);

            WebDriver wd = new ChromeDriver(chromeOptions);
            wd.get("https://get.jenkins.io/war-stable/2.528.1/jenkins.war");

            File jenkinsFile = new File(jenkinsDownloadFolderPath,"jenkins.war");
            int maxTimeOut = 30;
            int elapseTime = 0;

            while(elapseTime < maxTimeOut && !jenkinsFile.exists()){
                Thread.sleep(1000);
                elapseTime++;
                System.out.println("Waiting for file to be downloaded...");
            }

            if(jenkinsFile.exists()){
                System.out.println("File downloaded successfully");
            }
            else{
                System.err.println("File couldn't be downloaded, Timeout error!!");
            }
            wd.quit();
    }

}
