package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationPage {

    public WebDriver driver;

    public AuthenticationPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id="email")
    private WebElement emailAddr;

    public void enterEmailAddr(String email)
    {
        emailAddr.sendKeys(email);
    }

    @FindBy(id="passwd")
    private WebElement password;

    public void enterPass(String pass)
    {
        password.sendKeys(pass);
    }

    @FindBy(xpath="//*[@class='icon-lock left']")
    private WebElement signInBtn;

    public void clickSignInBtn()
    {
        signInBtn.click();
    }



}
