package introduction;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestSelenium {

    WebDriver driver;

    @BeforeMethod
    private void setUp() {
        WebDriverManager.operadriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("windows-size=2000,3000");
        options.addArguments("--force-device-scale-factor=0.75");
        options.addArguments("headless");

    }

    @Test
    private void testInputFullName() {
        String expectedFullName = "jevgenij";
        String actualFullName;
        WebElement inputFullName = driver.findElement(By.xpath("//input[@id='userName']"));
        inputFullName.sendKeys(expectedFullName);
        WebElement buttonSubmint = driver.findElement(By.xpath("//*[@id='submit']"));
        buttonSubmint.click();
        WebElement textName = driver.findElement(By.xpath("//*[@id='name']"));
        actualFullName = textName.getText();
        //  Assert.assertEquals(actualFullName, expectedFullName); netinka nes tekstas skiriasi
        Assert.assertTrue(actualFullName.contains(expectedFullName));
        String.format("Actual result [%s] contains expected result [%s]", actualFullName, expectedFullName);

    }

    @AfterMethod
    private void close() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
