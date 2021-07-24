package storeTests;

import org.junit.Test;

public class LogInTests extends BaseTests{

    @Test
    public void shouldSuccessfullyLogIn()
    {
        homePage.clickSignInBtn();
        authPage.enterEmailAddr("xavier@gmail.com");
        authPage.enterPass("xavier");
        authPage.clickSignInBtn();
        myAccPage.verifyWelcomMsg("Welcome to your account. Here you can manage all of your personal information and orders.");
        myAccPage.loggingOut();
    }




}
