package introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumDemo {
    @BeforeMethod
    @BeforeTest
    public void setUp() {
        WebDriverManager.operadriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.vilniuscoding.lt/");
    }

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

    @Test
    public void testVlickKontaktaiOfVCsPage() {
        WebDriverManager.operadriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=2000,3000");
        options.addArguments("--start-in-incognito");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.vilniuscoding.lt/");

        try {

            Thread.sleep(2000);
            WebElement linkKontaktai = driver.findElement(By.id("menu-item-3969"));
            linkKontaktai.click();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    @AfterMethod
    public void close() {
    }
}
