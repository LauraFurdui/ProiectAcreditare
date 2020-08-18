package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import static org.fasttrackit.utils.Constants.*;

@DefaultUrl("http://qa1.fasttrackit.org:8008/my-account/")
public class LoginPage extends PageObject {

/*    @FindBy(id = "username")
    private WebElementFacade emailField;

    @FindBy(id = "password")
    private WebElementFacade passField;

    @FindBy(css = "#customer_login > div.u-column1.col-1 > form > p:nth-child(3) > button")
    private WebElementFacade loginButton;

    public void setEmailField(String email){
        waitFor(emailField);
        typeInto(emailField, email);
    }

    public void setPassField(String pass){
        typeInto(passField, pass);
    }

    public void clickLogin(){
        clickOn(loginButton);
    }
*/
    @FindBy(id = "username")
    private WebElementFacade userUsernameTextbox;

    @FindBy(id = "password")
    private WebElementFacade userPasswordTextbox;

    @FindBy(css = "#customer_login > div.u-column1.col-1 > form > p:nth-child(3) > button")
    public WebElementFacade userLoginButton;

    @FindBy(id = "rememberme")
    private WebElementFacade rememberMeCheckbox;

    @FindBy(css = "#customer_login > div.u-column1.col-1 > form > p.woocommerce-LostPassword.lost_password > a")
    private WebElementFacade lostPasswordLink;

    public void setCredentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public void setUsername(String username) {
//        if (null != username && !username.isEmpty()) {
            typeInto(userUsernameTextbox, username);
//        }
    }
    public void setPassword(String password) {
//        if (null != password && !password.isEmpty()) {
            typeInto(userPasswordTextbox, password);
//        }
    }

    public void clickLogin(){
        clickOn(userLoginButton);
    }

    public void clickRememberMe(){
        clickOn(rememberMeCheckbox);
    }

    public void clickLostPassword(){
        clickOn(lostPasswordLink);
    }

}
