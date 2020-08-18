package org.fasttrackit.steps;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.MyAccountPage;
import static org.fasttrackit.utils.Constants.*;

import org.fasttrackit.utils.Constants;
import org.junit.Assert;

public class LoginSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;

    @Step
    public void navigateToLoginPage(){
        homePage.open();
        homePage.clickMyAccount();
        homePage.waitOnPage();

        String url = homePage.getDriver().getCurrentUrl();
        Assert.assertEquals(url, myAccountPage.getClass().getAnnotation(DefaultUrl.class).value());
//        Assert.assertTrue(loginPage.userLoginButton.isPresent());
    }

    @Step
    public void setUsername(String username){
        loginPage.setUsername(username);
    }

    @Step
    public void setPassword(String password){
        loginPage.setPassword(password);
    }

   @Step
   public void clickRememberMe(){
       loginPage.clickRememberMe();
   }

   @Step
    public void clickLogin(){
        loginPage.clickLogin();
    }

    @Step
    public void clickLogout(){
        myAccountPage.clickLogout();
    }

    @Step
    public void clickLostPassword(){
       loginPage.clickLostPassword();
    }

    @Step
    public void successfulLogin(){
       checkLoggedIn(USER_NAME);
    }

    @Step
    public void checkErrorMessage(String message){
        Boolean foundMessage = myAccountPage.getErrorMessage().contains(message);
        Assert.assertTrue(foundMessage);
    }

    @Step
    public void checkLoggedIn(String username){
        String url = homePage.getDriver().getCurrentUrl();
        Assert.assertEquals(url, myAccountPage.getClass().getAnnotation(DefaultUrl.class).value());

        String expected = "Hello "+ username;
        String message = myAccountPage.getWelcomeMessage();
        Boolean isLoggedIn = message.contains(expected);
        Assert.assertTrue(isLoggedIn);
    }

    @Step
    public void openMyAccountPage(){
        myAccountPage.open();
    }

    /*
    @Step
    public void login(String email, String pass, String username){
        navigateToLoginPage();
        setCredentials(email, pass);
        clickLogin();
        checkLoggedIn(username);
    }
     */
}
