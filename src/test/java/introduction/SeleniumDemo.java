package introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.Test;

public class SeleniumDemo {
    @Test
    public void testWebDriver() {
        WebDriverManager.operadriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.vilniuscoding.lt/");
        try {
        driver.manage().window().maximize();
            Thread.sleep(3000);
            driver.manage().window().fullscreen();
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();

    }

}
