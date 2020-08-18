package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa1.fasttrackit.org:8008/my-account/")
public class RegisterPage extends PageObject {

    @FindBy(id = "reg_email")
    private WebElementFacade userRegisterUsernameTextbox;

    @FindBy(id = "reg_password")
    private WebElementFacade userRegisterPasswordTextbox;

    @FindBy(css = "#customer_login > div.u-column2.col-2 > form > p.woocommerce-FormRow.form-row > button")
    private WebElementFacade registerButton;

    public void setRegisterCredentials(String username, String password){
        setRegisterUsername(username);
        setRegisterPassword(password);
    }

    public void setRegisterUsername(String username){
        typeInto(userRegisterUsernameTextbox, username);
    }

    public void clickRegisterUsername(){
        clickOn(userRegisterUsernameTextbox);
    }

    public void setRegisterPassword(String password){
        typeInto(userRegisterPasswordTextbox, password);
    }

    public void clickRegisterPassword(){
        clickOn(userRegisterPasswordTextbox);
    }

    public void clickRegister(){
        clickOn(registerButton);
    }

    public Boolean checkRegisterButtonState(Boolean enabled){
//        if (enabled) {
//            return registerButton.isEnabled();
//        } else {
//            return registerButton.isDisabled();
//        }
        return enabled ? registerButton.isEnabled() : registerButton.isDisabled();
    }

}
