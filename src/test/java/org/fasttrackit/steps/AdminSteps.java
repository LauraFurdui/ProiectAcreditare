package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;

public class AdminSteps {

    private HomePage homePage;

    @Step
    public void navigateToAdminLoginPage(){
        homePage.open();
        homePage.clickAdminLogin();
    }

//    public void
}
