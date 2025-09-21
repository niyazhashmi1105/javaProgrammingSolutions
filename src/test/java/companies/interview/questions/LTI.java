package companies.interview.questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLOutput;
import java.time.Duration;
import java.util.List;

public class LTI {


    @Test
    public void findBrokenLinks(){

        WebDriver wd = new ChromeDriver();
        wd.get("https://www.flipkart.com");
        By links = By.tagName("a");
        WebDriverWait wait = new WebDriverWait(wd,Duration.ofSeconds(60));
        List<WebElement> allLinks = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(links));
        System.out.println(allLinks.size());

        for(WebElement link : allLinks) {
            String url = link.getAttribute("href");
            isBrokenLink(url);
        }
        wd.quit();
    }

    private static void isBrokenLink(String url){

        try {
            URL urlLink = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) urlLink.openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();
            int responseCode = connection.getResponseCode();

            if (responseCode >= 400) {
                System.out.println("Broken Link : " + url+" with status code: "+ responseCode);

            } else if (responseCode == 200) {
                System.out.println("Valid URL: " + url+" with status code: "+ responseCode);
            }
            else{
                System.out.println("No Broken links found");
            }

        }catch(Exception e) {
            System.err.println("caught exception " + e.getMessage());
        }
    }
}
