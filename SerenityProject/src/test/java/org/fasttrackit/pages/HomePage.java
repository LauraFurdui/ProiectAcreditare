package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends PageObject {

    @FindBy(css = ".skip-account")
    private WebElementFacade accountLink;

    @FindBy(css = "a[title='Log In']")
    private WebElementFacade loginLink;

    @FindBy(id = "billing:country_id")
    private WebElementFacade countryDropdown;

    public void clickAccount(){
        clickOn(accountLink);
    }

    public void clickLogin(){
        clickOn(loginLink);
    }

    public void mouseOverElement(String elementText){
        Actions action = new Actions(getDriver());
        WebElement element = getDriver().findElement(By.cssSelector(".level0 > a[href*='/"+elementText+"']"));
        action.moveToElement(element).perform();
    }

    public void selectFromDrop(){
        countryDropdown.selectByValue("US");
    }


}
