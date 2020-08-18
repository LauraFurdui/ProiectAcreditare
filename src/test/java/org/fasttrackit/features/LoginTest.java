package org.fasttrackit.features;

import io.vavr.collection.List;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.*;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest  extends BaseTest {

    private LoginPage loginPage;

    @Steps
    private LoginSteps loginSteps;

    @Test
    public void lgn1(){
        loginSteps.navigateToLoginPage();
    }

    @Test
    public void lgn2(){
        lgn1();
        loginSteps.setUsername(Constants.USER_EMAIL);
        loginSteps.setPassword(Constants.USER_PASSWORD);
        loginSteps.clickLogin();
        loginSteps.successfulLogin();
    }

    @Test
    public void lgn3(){
        lgn1();
        loginSteps.setUsername(Constants.USER_EMAIL);
        loginSteps.setPassword("yufc");
        loginSteps.clickLogin();
        loginSteps.checkErrorMessage("ERROR: The password you entered for the email address");
    }

    @Test
    public void lgn4(){
        lgn3();
        loginSteps.clickLostPassword();
    }

    @Test
    public void lgn5(){
        lgn1();
        loginSteps.setUsername(Constants.USER_EMAIL.toUpperCase());
        loginSteps.setPassword(Constants.USER_PASSWORD);
        loginSteps.clickLogin();
        loginSteps.successfulLogin();
    }

    @Test
    public void lgn6(){
        lgn1();
        loginSteps.setUsername("fghdgjkk");
        loginSteps.setPassword("yufc");
        loginSteps.clickLogin();
        loginSteps.checkErrorMessage("ERROR: Invalid username.");
    }

    @Test
    public void lgn7(){
        lgn1();
        loginSteps.setUsername("fghdgjkk@gmail.com");
        loginSteps.setPassword("yufc");
        loginSteps.clickLogin();
        loginSteps.checkErrorMessage("ERROR: Invalid email address.");
    }

    @Test
    public void lgn8(){
        lgn1();
        loginSteps.setUsername(Constants.USER_NAME);
        loginSteps.setPassword(Constants.USER_PASSWORD);
        loginSteps.clickLogin();
        loginSteps.successfulLogin();
    }

    @Test
    public void lgn9(){
        lgn1();
        loginSteps.setUsername("");
        loginSteps.setPassword(Constants.USER_PASSWORD);
        loginSteps.clickLogin();
        loginSteps.checkErrorMessage("Error: Username is required.");
    }

    @Test
    public void lgn10(){
        lgn1();
        loginSteps.setUsername(" ");
        loginSteps.setPassword(Constants.USER_EMAIL);
        loginSteps.clickLogin();
        loginSteps.checkErrorMessage("Error: Username is required.");
    }

    @Test
    public void lgn11() {
        lgn1();
        loginSteps.setUsername(Constants.USER_EMAIL);
        loginSteps.setPassword("");
        loginSteps.clickLogin();
        loginSteps.checkErrorMessage("ERROR: The password field is empty.");
    }

    @Test
    public void lgn12() {
        lgn1();
        loginSteps.setUsername(Constants.USER_EMAIL);
        loginSteps.setPassword(" ");
        loginSteps.clickLogin();
        loginSteps.checkErrorMessage("ERROR: The password field is empty.");
    }

    @Test
    public void lgn13() {
        lgn1();
        loginSteps.setUsername("");
        loginSteps.setPassword("");
        loginSteps.clickLogin();
        loginSteps.checkErrorMessage("Error: Username is required.");
    }

    @Test
    public void lgn14(){
        lgn2();
        loginSteps.clickLogout();
    }

//    @Test
//    public void lgn9() {
//        lgn1();
//        loginSteps.setCredentials("", Constants.USER_PASSWORD);
//        loginSteps.clickLogin();
//        loginSteps.checkLoggedIn("Error: Username is required.");
//    }
}
