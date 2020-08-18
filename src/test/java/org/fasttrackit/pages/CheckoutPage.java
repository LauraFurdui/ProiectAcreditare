package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.fasttrackit.utils.Constants.*;

@DefaultUrl("http://qa1.fasttrackit.org:8008/checkout/")
public class CheckoutPage extends PageObject {

    @FindBy(css = "#post-6 > div > div > div:nth-child(1) > a")
    private WebElementFacade checkoutLoginLink;

    @FindBy(css = "#post-6 > div > div > div > a")
    private WebElementFacade couponLink;

    @FindBy(id = "order_comments")
    private WebElementFacade orderCommentsTextbox;

    @FindBy(id = "billing_first_name")
    private WebElementFacade billingFirstNameTextbox;

    @FindBy(id = "billing_last_name")
    private WebElementFacade billingLastNameTextbox;

    @FindBy(id = "billing_company")
    private WebElementFacade billingCompanyNameTextbox;

    @FindBy(css = "#select2-billing_country-container")
    private WebElementFacade billingCountrySelected;

    @FindBy(id = "select2-billing_country-result-i620-RO")
    private WebElementFacade billingCountryRomania;

    @FindBy(id = "billing_address_1")
    private WebElementFacade billingHouseNumberAndStreetNameTextbox;

    @FindBy(id = "billing_address_2")
    private WebElementFacade billingApartmentSuiteUnitTextbox;

    @FindBy(id = "billing_city")
    private WebElementFacade billingCityTextbox;

    @FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
    private WebElementFacade billingCountyTextbox;

    @FindBy(css = "#select2-billing_state-container")
    private WebElementFacade billingCountySelected;

    @FindBy(xpath = "//*[@id=\"select2-billing_state-result-2aa6-CJ\"]")
    private WebElementFacade billingCountyCluj;

    @FindBy(id = "billing_postcode")
    private WebElementFacade billingPostcodeZipTextbox;

    @FindBy(id = "billing_phone")
    private WebElementFacade billingPhoneTextbox;

    @FindBy(id = "billing_email")
    private WebElementFacade billingEmailTextbox;

    @FindBy(id = "createaccount")
    private WebElementFacade createAccountTickbox;

    @FindBy(id = "account_password")
    private WebElementFacade createPasswordTextbox;

    @FindBy(id = "place_order")
    private WebElementFacade placeOrderButton;

    @FindBy(xpath = "//*[@id=\"post-6\"]/div/div/div[2]/text()")
    private WebElementFacade expiredSession;

    @FindBy(css = "#post-6 > div > div > div.woocommerce-error > a")
    private WebElementFacade returnToShopLink;

    @FindBy(xpath = "//*[@id=\"post-6\"]/div/div/div[1]")
    private WebElementFacade returningCustomer;

    @FindBy (css = "body > span > span > span.select2-results")
    private WebElementFacade dropdownContainer;

    @FindBy(id = "select2-billing_country-container")
    private WebElementFacade billingCountryDropdownMenu;

    @FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
    private WebElementFacade billingCountryTextbox;

    @FindBy(id = "select2-billing_state-container")
    private WebElementFacade billingCountyDropdownMenu;

//    @FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
//    private WebElementFacade billingCountyTextbox;

    public void clickDropdownValue(String value){
        List<WebElement> countriesList = dropdownContainer.findElements(By.tagName("li"));
        for (WebElement li : countriesList) {
            if (li.getText().equals(value)) {
                li.click();
            }
        }
    }

    public void searchBillingCountry(String country){
        clickOn(billingCountryDropdownMenu);
        clickOn(billingCountryTextbox);
        typeInto(billingCountryTextbox, country);
    }

    public void clickBillingCountyTextbox(){
        clickOn((billingCountyTextbox));
    }

    public void selectBillingCountyCluj(){
        clickOn(billingCountyCluj);
    }

    public void searchBillingCounty(String county){
        clickOn(billingCountyDropdownMenu);
        clickOn(billingCountryTextbox);
        typeInto(billingCountryTextbox, county);
    }

    public boolean getReturningCustomer(){
        return returningCustomer.getText().equals("Returning customer? Click here to login");
    }

    public boolean getExpiredSession(){
        return expiredSession.getText().equals("Sorry, your session has expired. ");
    }

    public void checkAutocomplete(){
        Assert.assertTrue(billingFirstNameTextbox.getAttribute("value").equals(USER_FIRST_NAME));
        Assert.assertTrue(billingLastNameTextbox.getAttribute("value").equals(USER_LAST_NAME));
        Assert.assertTrue(billingCountrySelected.getText().equals("Romania"));
        Assert.assertTrue(billingHouseNumberAndStreetNameTextbox.getAttribute("value").equals(USER_STREET_ADDRESS));
        Assert.assertTrue(billingCityTextbox.getAttribute("value").equals(USER_TOWN));
        Assert.assertTrue(billingCountySelected.getText().equals("Cluj"));
        Assert.assertTrue(billingCityTextbox.getAttribute("value").equals(USER_TOWN));
        Assert.assertTrue(billingPostcodeZipTextbox.getAttribute("value").equals(USER_POSTCODE_ZIP));
        Assert.assertTrue(billingPhoneTextbox.getAttribute("value").equals(USER_PHONE));
        Assert.assertTrue(billingEmailTextbox.getAttribute("value").equals(USER_EMAIL));
    }

    private void clickCheckoutLogin(){
        clickOn(checkoutLoginLink);
    }

    private void clickHereToEnterYourCode(){
        clickOn(couponLink);
    }

    public void clickOrderComments(){
        clickOn(orderCommentsTextbox);
        typeInto(orderCommentsTextbox, "Am o casuta mica");
    }

    public void clickBillingFirstName(){
        clickOn(billingFirstNameTextbox);
        typeInto(billingFirstNameTextbox, "ini");
    }

    public void clickBillingLastName(){
        clickOn(billingLastNameTextbox);
        typeInto(billingLastNameTextbox, "mini");
    }

    public void clickCompanyNameTextbox(){
        clickOn(billingCompanyNameTextbox);
        typeInto(billingCompanyNameTextbox, "mani");
    }

    public void clickBillingHouseNumberAndStreetName(){
        clickOn(billingHouseNumberAndStreetNameTextbox);
        typeInto(billingHouseNumberAndStreetNameTextbox, "mo 2");
    }

    public void clickBillingApartment(){
        clickOn(billingApartmentSuiteUnitTextbox);
        typeInto(billingHouseNumberAndStreetNameTextbox, "1");
    }

    public void clickBillingSuite(){
        clickOn(billingHouseNumberAndStreetNameTextbox);
        typeInto(billingHouseNumberAndStreetNameTextbox, "2");
    }

    public void clickBillingUnit(){
        clickOn(billingHouseNumberAndStreetNameTextbox);
        typeInto(billingHouseNumberAndStreetNameTextbox, "3");
    }

    public void clickBillingCity(){
        clickOn(billingCityTextbox);
        typeInto(billingCityTextbox, "am");
    }

    public void clickPostcodeZip(){
        clickOn(billingPostcodeZipTextbox);
        typeInto(billingPostcodeZipTextbox, "123456");
    }

    public void clickBillingPhone(){
        clickOn(billingPhoneTextbox);
        typeInto(billingPhoneTextbox, "0722222222");
    }

    public void clickBillingEmail(){
        clickOn(billingEmailTextbox);
        typeInto(billingEmailTextbox, "amvazutuncalmaro@mailinator.com");
    }

    public void clickCreateAccount(){
        clickOn(createAccountTickbox);
    }

    public void clickCreatePassword(){
        clickOn(createPasswordTextbox);
        typeInto(createPasswordTextbox, "owtjnv8.op");
    }

    public void clickPlaceOrder(){
        clickOn(placeOrderButton);
    }


}
