package companies.interview.questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v148.network.Network;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

public class WaitForElementVisibleTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        DevTools devTools = ((ChromeDriver)driver).getDevTools();
        devTools.createSession();

        // ── Enable network monitoring ──
        devTools.send(Network.enable(Optional.empty(),
                Optional.empty(),
                Optional.empty(),
                Optional.empty(),
                Optional.empty()));

        // ── Flag to track API response ──
        AtomicBoolean apiResponseReceived = new AtomicBoolean(false);

        // ── Listen for API response ──
        devTools.addListener(Network.responseReceived(), response -> {
            String url = response.getResponse().getUrl();

            // ── Check if it's the specific API call we're waiting for ──
            if (url.contains("/api/user/config")) {
                int statusCode = response.getResponse().getStatus();
                if (statusCode == 200) {
                    apiResponseReceived.set(true);
                    System.out.println("✅ API call completed: " + url);
                }
            }
        });

        driver.get("https://example.com/login");

        // ── Wait until API flag is set ──
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(d -> apiResponseReceived.get());

        // ── Now wait for button to be clickable ──
        Objects.requireNonNull(wait.until(ExpectedConditions
                .elementToBeClickable(By.id("loginBtn")))).click();

        System.out.println("✅ Login button clicked after API confirmed");
    }
}


