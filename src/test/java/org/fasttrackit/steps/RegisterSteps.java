package org.fasttrackit.steps;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;
import org.junit.Assert;
import org.openqa.selenium.Alert;

import static org.fasttrackit.utils.Constants.USER_NAME;

public class RegisterSteps {

    private HomePage homePage;
    private RegisterPage registerPage;
    private MyAccountPage myAccountPage;

    @Step
    public void navigateToRegisterPage(){
        homePage.open();
        homePage.clickMyAccount();
        homePage.waitOnPage();

        String url = homePage.getDriver().getCurrentUrl();
        Assert.assertEquals(url, myAccountPage.getClass().getAnnotation(DefaultUrl.class).value());
    }

    @Step
    public void setRegisterEmail(String email){
        registerPage.setRegisterUsername(email);
    }

    @Step
    public void setRegisterPassword(String password){
        registerPage.setRegisterPassword(password);
    }

    @Step
    public void clickRegisterPassword(){
        registerPage.clickRegisterPassword();
    }

    @Step
    public void checkUsedEmailErrorMessage(String message){
        Boolean foundMessage = myAccountPage.getErrorMessage().contains(message);
        Assert.assertTrue(foundMessage);
    }

    @Step
    public void clickRegister(){
        registerPage.clickRegister();
    }

    @Step
    public void checkRegisterButtonState(Boolean enabled){
        Assert.assertEquals(enabled, registerPage.checkRegisterButtonState(enabled));
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
    public void successfulRegister(String username){
        checkLoggedIn(username);
    }
}
