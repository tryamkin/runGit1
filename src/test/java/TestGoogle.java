import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestGoogle {

    @Test
    public void homePage()  {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*", "--headless", "--window-size=1920,1080");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.google.com/");
        Assert.assertEquals(driver.getTitle(),"Google");
        driver.quit();
    }
    @Test
    public void homePage4()  {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*", "--headless", "--window-size=1920,1080");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.google.com/");
        Assert.assertEquals(driver.getTitle(),"Google");
        driver.quit();
    }
    @Test
    public void homePage3()  {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*", "--headless", "--window-size=1920,1080");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.google.com/");
        Assert.assertEquals(driver.getTitle(),"Google");
        driver.quit();
    }
    @Ignore
    @Test
    public void homePage2()  {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*", "--headless", "--window-size=1920,1080");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.google.com/");
        Assert.assertEquals(driver.getTitle(),"Googl");
        driver.quit();
    }
}
