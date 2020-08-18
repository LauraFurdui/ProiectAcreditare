package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class LoginTest  extends BaseTest {

    @Steps
    private LoginSteps loginSteps;

    @Test
    public void testValidLogin(){
        loginSteps.navigateToLoginPage();
        loginSteps.setCredentials(Constants.USER_EMAIL,Constants.USER_PASSWORD);
        loginSteps.clickLogin();
        loginSteps.checkLoggedIn("Hello, Hai C' Am Schimbat La Loc (Merry Christams)!");
    }


}
