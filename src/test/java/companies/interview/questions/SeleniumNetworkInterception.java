package companies.interview.questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v142.fetch.Fetch;
import org.openqa.selenium.devtools.v142.fetch.model.RequestPattern;
import org.openqa.selenium.devtools.v142.fetch.model.RequestStage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public class SeleniumNetworkInterception {

    public static void main(String[] args) {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver wd = new ChromeDriver(chromeOptions);

        DevTools devTools = ((ChromeDriver)wd).getDevTools();
        devTools.createSession();
        devTools.send(Fetch.enable(Optional.of(List.of(new RequestPattern(Optional.of("*"),
                Optional.empty(),Optional.of(RequestStage.REQUEST)))), Optional.empty()));

        devTools.addListener(Fetch.requestPaused(),request->{
            System.out.println("Intercepted");
            System.out.println(request.getRequest().getMethod());
            System.out.println(request.getRequest().getUrl());

            String url = request.getRequest().getUrl();
            if(url.contains("verify")){
                String jsonResponse = """
                        {
                            "status": "SUCCESS",
                            "message": "Citizen registration verified successfully.",
                            "transaction_id": "MOCK-TXN-YYL43VD9",
                            "amount_deducted": "₹00.00 (~$0.00 USD)",
                            "username": "niyaz",
                            "timestamp": "2026-03-13T19:04:11.805Z"
                        }
                        """;

                String jsonResponseBase64 = Base64.getEncoder().encodeToString(jsonResponse.getBytes(StandardCharsets.UTF_8));
                devTools.send(Fetch.fulfillRequest(request.getRequestId(),200,Optional.empty(),
                        Optional.empty(),Optional.of(jsonResponseBase64),Optional.empty()));
            }
            else{
                devTools.send(Fetch.continueRequest(request.getRequestId(),Optional.empty(),
                        Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty()));
            }
        });

        wd.get("http://mock-api.techwithjatin.com/");
        WebDriverWait wait = new WebDriverWait(wd,Duration.ofSeconds(20));

        WebElement usernameTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        usernameTextBox.sendKeys("niyaz123");

        WebElement passwordTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        passwordTextBox.sendKeys("niyaz123");

        WebElement registerBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("registerBtn")));
        registerBtn.click();

        System.out.println("Register button click successfully" );


    }
}
