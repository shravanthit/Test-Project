package utils;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;

public class DriverFactory
{
    public static WebDriver driver;

    @Before
    public void setUp() throws MalformedURLException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sraav\\OneDrive\\Desktop\\QA Automation\\src\\test\\java\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown()
    {
        driver.close();
    }

}
