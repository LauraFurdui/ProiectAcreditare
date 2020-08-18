package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.MyAccountPage;
import org.junit.Assert;

public class LoginSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;

    @Step
    public void navigateToLoginPage(){
        homePage.open(); //navigheaza la url-ul din page
        homePage.clickAccount();
        homePage.clickLogin();
    }

    @Step
    public void setCredentials(String email, String password){
        loginPage.setEmailField(email);
        loginPage.setPassField(password);
    }

    @Step
    public void clickLogin(){
        loginPage.clickLogin();
    }

    @Step
    public void checkLoggedIn(String expected){
        String message = myAccountPage.getWelcomeMessage();
        Assert.assertEquals(expected, message);
    }

    @Step
    public void login(String email, String pass, String username){
        navigateToLoginPage();
        setCredentials(email, pass);
        clickLogin();
        checkLoggedIn(username);
    }
}
