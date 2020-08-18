package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import static org.fasttrackit.utils.Constants.*;

import javax.print.attribute.standard.Fidelity;

@DefaultUrl("http://qa1.fasttrackit.org:8008/my-account/edit-account/")
public class EditAccountPage extends PageObject {

    @FindBy(id = "Account details")
    private WebElementFacade successfulNavigateToEditAccountPage;

    @FindBy(id = "account_first_name")
    private WebElementFacade firstNameTextbox;

    @FindBy(id = "account_last_name")
    private WebElementFacade lastNameTextbox;

    @FindBy(id = "account_email")
    private WebElementFacade emailTextbox;

    @FindBy(id = "password_current")
    private WebElementFacade currentPasswordTextbox;

    @FindBy(id = "password_1")
    private WebElementFacade newPasswordTextbox;

    @FindBy(id = "password_2")
    private WebElementFacade confirmNewPasswordTextbox;

    @FindBy(css = "#post-7 > div > div > div > form > p:nth-child(7) > button")
    private WebElementFacade saveChangesButton;


    public WebElementFacade getSuccessfulNavigateToEditAccountPage(){
        return successfulNavigateToEditAccountPage;
    }

    public void clickFirstName(){
        clickOn(firstNameTextbox);
        typeInto(firstNameTextbox, USER_FIRST_NAME);
    }

    public void clickLastName(){
        clickOn(lastNameTextbox);
        typeInto(lastNameTextbox, USER_LAST_NAME);
    }

    public void clickEmail(){
        clickOn(emailTextbox);
        typeInto(emailTextbox, USER_EMAIL);
    }

    public void clickCurrentPassword(){
        clickOn(currentPasswordTextbox);
        typeInto(currentPasswordTextbox, USER_PASSWORD);
    }

    public void clickNewPassword(){
        clickOn(newPasswordTextbox);
        typeInto(newPasswordTextbox, USER_PASSWORD);
    }

    public void clickConfirmNewPassword(){
        clickOn(confirmNewPasswordTextbox);
        typeInto(confirmNewPasswordTextbox, USER_PASSWORD);
    }

    public void clickSaveChanges(){
        clickOn(saveChangesButton);
    }

}
