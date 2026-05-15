package companies.interview.questions;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class AuthenticationPopup {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        //driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        ((HasAuthentication) driver).register(UsernameAndPassword.of("admin", "admin"));
        driver.get("https://the-internet.herokuapp.com/basic_auth");

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#content p")));
        System.out.println(text.getText().trim());
        Assert.assertEquals("Congratulations! You must have the proper credentials.",text.getText().trim());

        driver.quit();

    }
}
