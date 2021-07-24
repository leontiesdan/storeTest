package storeTests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pageObject.AuthenticationPage;
import pageObject.HomePage;
import pageObject.MyAccountPage;

import java.util.concurrent.TimeUnit;

public class BaseTests {

    public WebDriver driver;
    public HomePage homePage;
    public AuthenticationPage authPage;
    public MyAccountPage myAccPage;

    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        homePage = PageFactory.initElements(driver, HomePage.class);
        authPage = PageFactory.initElements(driver, AuthenticationPage.class);
        myAccPage = PageFactory.initElements(driver, MyAccountPage.class);
    }

    /*
    @After
    public void after()
    {
        driver.quit();
    }
    */




}
