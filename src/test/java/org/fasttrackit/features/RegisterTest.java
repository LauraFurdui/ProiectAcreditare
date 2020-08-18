package org.fasttrackit.features;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.MyAccountPage;
import static org.fasttrackit.utils.Constants.*;

import org.fasttrackit.pages.RegisterPage;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.steps.RegisterSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
import org.fasttrackit.utils.Utils;
import org.junit.Assert;
import org.junit.Test;

public class RegisterTest extends BaseTest {

    private RegisterPage registerPage;

    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void reg1(){
        registerSteps.navigateToRegisterPage();
    }
    @Test
    public void reg2(){
        reg1();
        String randomPassword = Utils.randomString(12);
        registerSteps.setRegisterEmail(USER_EMAIL);
        registerSteps.setRegisterPassword(randomPassword);
        registerSteps.clickRegister();
        registerSteps.checkUsedEmailErrorMessage("Error: An account is already registered with your email address");
    }

    @Test
    public void reg3(){
        reg1();
        String randomUser = Utils.randomString(5);
        String randomPassword = Utils.randomString(12);
        registerSteps.setRegisterEmail(randomUser + ".vicer.com");
        registerSteps.setRegisterPassword(randomPassword);
        registerSteps.clickRegister();
        registerSteps.checkUsedEmailErrorMessage("Error: Please provide a valid email address.");
    }

    @Test
    public void reg4(){
        reg1();
        String randomUser = Utils.randomString(321);
        String randomPassword = Utils.randomString(12);
        registerSteps.setRegisterEmail(randomUser + "@email.com");
        registerSteps.setRegisterPassword(randomPassword);
        registerSteps.clickRegister();
        registerSteps.checkUsedEmailErrorMessage("Error: Error: Couldn’t register you… please contact us if you continue to have problems.");
    }

    @Test
    public void reg5(){
        reg1();
        String randomPassword = Utils.randomString(12);
        registerSteps.setRegisterEmail("e@l.i");
        registerSteps.setRegisterPassword(randomPassword);
        registerSteps.clickRegister();
        registerSteps.checkUsedEmailErrorMessage("Error: Please provide a valid email address.");
    }

    @Test
    public void reg6(){
        reg1();
        String randomPassword = Utils.randomString(12);
        registerSteps.setRegisterEmail("iyrt^&*(%$#@ij.com");
        registerSteps.setRegisterPassword(randomPassword);
        registerSteps.clickRegister();
        registerSteps.checkUsedEmailErrorMessage("Error: Please provide a valid email address.");
    }

    @Test
    public void reg7(){
        reg1();
        String randomUser = Utils.randomString(5);
        String randomPassword = Utils.randomString(10);
        registerSteps.setRegisterEmail(randomUser + "@mailinator.com");
        registerSteps.setRegisterPassword(randomPassword);
        registerSteps.checkRegisterButtonState(false);
    }

    @Test
    public void reg8(){
        reg1();
        registerSteps.setRegisterEmail("");
        registerSteps.setRegisterPassword("iwurbviwne9");
        registerSteps.clickRegister();
        registerSteps.checkUsedEmailErrorMessage("Error: Please provide a valid email address.");
    }

    @Test
    public void reg9(){
        reg1();
        String randomUsername = Utils.randomString(6);
        registerSteps.setRegisterEmail(randomUsername + "@mailinator.com");
        registerSteps.setRegisterPassword("");
        registerSteps.clickRegister();
        registerSteps.checkUsedEmailErrorMessage("Error: Please enter an account password.");
    }

    @Test
    public void reg10(){
        reg1();
        String randomUser = Utils.randomString(5);
        String randomPassword = Utils.randomString(12);
        registerSteps.setRegisterEmail(randomUser + "@mailinator.com");
        registerSteps.setRegisterPassword(randomPassword);
        registerSteps.clickRegister();
        registerSteps.successfulRegister(randomUser);
    }

    @Test
    public void reg11(){
        reg1();
        String randomUsername = Utils.randomString(6);
        String randomPassword = Utils.randomString(11);
        registerSteps.setRegisterEmail(randomUsername + "@mailinator.com");
        registerSteps.setRegisterPassword(randomPassword);
        registerSteps.checkRegisterButtonState(false);
    }

    @Test
    public void reg12(){
        reg1();
        String randomUsername = Utils.randomString(6);
        registerSteps.setRegisterEmail(randomUsername + "@mailinator.com");
        registerSteps.setRegisterPassword("cccccccccccc");
        registerSteps.checkRegisterButtonState(false);
    }
}
