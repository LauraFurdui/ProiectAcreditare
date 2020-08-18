package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.fasttrackit.utils.Constants.*;

@DefaultUrl("http://qa1.fasttrackit.org:8008/my-account/edit-address/billing/")
public class BillingAddressPage extends PageObject {

    @FindBy(id = "billing_first_name")
    private WebElementFacade billingFirstNameTextbox;

    @FindBy(id = "billing_last_name")
    private WebElementFacade billingLastNameTextbox;

    @FindBy(id = "billing_company")
    private WebElementFacade billingCompanyNameTextbox;

    @FindBy(id = "select2-billing_country-container")
    private WebElementFacade billingCountryDropdownMenu;

    @FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
    private WebElementFacade billingCountryTextbox;

    @FindBy(id = "billing_address_1")
    private WebElementFacade billingHouseNumberAndStreetNameTextbox;

    @FindBy(id = "billing_address_2")
    private WebElementFacade billingApartmentSuiteUnitTextbox;

    @FindBy(id = "billing_city")
    private WebElementFacade billingCityTextbox;

    @FindBy(id = "select2-billing_state-container")
    private WebElementFacade billingCountyDropdownMenu;

    @FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
    private WebElementFacade billingCountyTextbox;

    @FindBy(id = "billing_postcode")
    private WebElementFacade billingPostcodeZipTextbox;

    @FindBy(id = "billing_phone")
    private WebElementFacade billingPhoneTextbox;

    @FindBy(id = "billing_email_field")
    private WebElementFacade billingEmailTextbox;

    @FindBy(css = "#post-7 > div > div > div > form > div > p > button")
    private WebElementFacade billingSaveAddressButton;

    @FindBy (id = "Billing address")
    private WebElementFacade successfullNavigateToBillingAddress;

    @FindBy (id = "Shipping address")
    private WebElementFacade successfulNavigateToShippingAddress;

    @FindBy (css = "#select2-billing_country-result-nyaj-RO")
    private WebElementFacade selectRomaniaCountry;

    @FindBy (css = "body > span > span > span.select2-results")
    private WebElementFacade dropdownContainer;

    public void clickDropdownValue(String value){
        List<WebElement> countriesList = dropdownContainer.findElements(By.tagName("li"));
        for (WebElement li : countriesList) {
            if (li.getText().equals(value)) {
                li.click();
            }
        }
    }

    public WebElementFacade getSuccessfullNavigateToBillingAddress(){
        return successfullNavigateToBillingAddress;
    }

    public void clickBillingFirstName(){
        clickOn(billingFirstNameTextbox);
        typeInto(billingFirstNameTextbox, USER_FIRST_NAME);
    }

    public void clickBillingLastName(){
        clickOn(billingLastNameTextbox);
        typeInto(billingLastNameTextbox, USER_LAST_NAME);
    }

    public void clickBillingCompanyNameTextbox(){
        clickOn(billingCompanyNameTextbox);
        typeInto(billingCompanyNameTextbox, USER_COMPANY_NAME);
    }

    public void searchBillingCountry(String country){
        clickOn(billingCountryDropdownMenu);
        clickOn(billingCountryTextbox);
        typeInto(billingCountryTextbox, country);
    }

    public void clickBillingHouseNumberAndStreetName(){
        clickOn(billingHouseNumberAndStreetNameTextbox);
        typeInto(billingHouseNumberAndStreetNameTextbox, USER_STREET_ADDRESS);
    }

    public void clickBillingApartment(){
        clickOn(billingApartmentSuiteUnitTextbox);
        typeInto(billingHouseNumberAndStreetNameTextbox, USER_APARTMENT);
    }

    public void clickBillingSuite(){
        clickOn(billingHouseNumberAndStreetNameTextbox);
        typeInto(billingHouseNumberAndStreetNameTextbox, USER_SUITE);
    }

    public void clickBillingUnit(){
        clickOn(billingHouseNumberAndStreetNameTextbox);
        typeInto(billingHouseNumberAndStreetNameTextbox, USER_UNIT);
    }

    public void clickBillingCity(){
        clickOn(billingCityTextbox);
        typeInto(billingCityTextbox, USER_TOWN);
    }

    public void searchBillingCounty(String county){
        clickOn(billingCountyDropdownMenu);
        clickOn(billingCountyTextbox);
        typeInto(billingCountyTextbox, county);
    }

    public void clickPostcodeZip(){
        clickOn(billingPostcodeZipTextbox);
        typeInto(billingPostcodeZipTextbox, USER_POSTCODE_ZIP);
    }

    public void clickBillingPhone(){
        clickOn(billingPhoneTextbox);
        typeInto(billingPhoneTextbox, USER_PHONE);
    }

    public void clickBillingEmail(){
        clickOn(billingEmailTextbox);
        typeInto(billingEmailTextbox, USER_EMAIL);
    }

    public void clickBillingSaveAddress(){
        clickOn(billingSaveAddressButton);
    }
}
