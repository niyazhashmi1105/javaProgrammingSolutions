package companies.interview.questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FastAutomation {

    public static void main(String[] args) {


        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver wd = new ChromeDriver(chromeOptions);
        wd.get("https://fast.com/");
        WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(30));

        By speedValueLocator = By.id("speed-value");
        By speedUnitsLocator = By.id("speed-units");
        WebElement speedValueElement;
        WebElement speedUnitsElement;
        String className;

        while(true) {
            speedValueElement = wait.until(ExpectedConditions.visibilityOfElementLocated(speedValueLocator));
            speedUnitsElement = wait.until(ExpectedConditions.visibilityOfElementLocated(speedUnitsLocator));
            assert speedValueElement != null;
            assert speedUnitsElement != null;
            System.out.println(speedValueElement.getText() + " " + speedUnitsElement.getText());
            className = speedValueElement.getAttribute("class");
            if(className != null && className.contains("succeeded")){
                break;
            }
        }

        speedValueElement = wait.until(ExpectedConditions.visibilityOfElementLocated(speedValueLocator));
        speedUnitsElement = wait.until(ExpectedConditions.visibilityOfElementLocated(speedUnitsLocator));
        System.out.println("-------------Final Speed----------------");
        assert speedValueElement != null;
        assert speedUnitsElement != null;
        System.out.println(speedValueElement.getText() + " " + speedUnitsElement.getText());
        wd.quit();
    }
}
