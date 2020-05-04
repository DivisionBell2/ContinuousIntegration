package alltests.paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTest1 {

    WebDriver driver;

    @Test
    void logoTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/tools/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));

        Assert.assertEquals(logo.isDisplayed(), true);
        Thread.sleep(5000);
    }

    @Test
    void homePageTitle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/tools/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
        Thread.sleep(5000);
    }

    @AfterMethod
    void tearDown() {
        driver.quit();
    }
}
