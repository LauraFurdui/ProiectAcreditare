package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.fasttrackit.utils.Constants.*;

@DefaultUrl("http://qa1.fasttrackit.org:8008/my-account/edit-address/shipping/")
public class ShippingAddressPage extends PageObject {

    @FindBy(id = "Shipping address")
    private WebElementFacade successfulNavigateToShippingAddress;

    @FindBy(id = "shipping_first_name")
    private WebElementFacade shippingFirstNameTextbox;

    @FindBy(id = "shipping_last_name")
    private WebElementFacade shippingLastNameTextbox;

    @FindBy(id = "shipping_company")
    private WebElementFacade shippingCompanyNameTextbox;

    @FindBy(id = "select2-shipping_country-container")
    private WebElementFacade shippingCountryDropdownMenu;

    @FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
    private WebElementFacade shippingCountryTextbox;

    @FindBy(id = "select2-shipping_country-result-bugs-RO")
    private WebElementFacade shippingCountryRomania;

    @FindBy (css = "body > span > span > span.select2-results")
    private WebElementFacade dropdownContainer;

    @FindBy(id = "shipping_address_1")
    private WebElementFacade shippingHouseNumberAndStreetNameTextbox;

    @FindBy(id = "shipping_address_2")
    private WebElementFacade shippingApartmentSuiteUnitTextbox;

    @FindBy(id = "shipping_city")
    private WebElementFacade shippingCityTextbox;

    @FindBy(id = "select2-shipping_state-container")
    private WebElementFacade shippingCountyDropdownMenu;

    @FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
    private WebElementFacade shippingCountyTextbox;

    @FindBy(id = "select2-shipping_state-result-zx50-CJ")
    private WebElementFacade shippingCountyCluj;

    @FindBy(id = "shipping_postcode")
    private WebElementFacade shippingPostcodeZipTextbox;

    @FindBy(css = "#post-7 > div > div > div > form > div > p > button")
    private WebElementFacade shippingSaveAddressButton;

    public void clickDropdownValue(String value){
        List<WebElement> countriesList = dropdownContainer.findElements(By.tagName("li"));
        for (WebElement li : countriesList) {
            if (li.getText().equals(value)) {
                li.click();
            }
        }
    }

    public WebElementFacade getSuccessfulNavigateToShippingAddress(){
        return successfulNavigateToShippingAddress;
    }

    public void clickShippingFirstName(){
        clickOn(shippingFirstNameTextbox);
        typeInto(shippingFirstNameTextbox, USER_FIRST_NAME);
    }

    public void clickShippingLastName(){
        clickOn(shippingLastNameTextbox);
        typeInto(shippingLastNameTextbox, USER_LAST_NAME);
    }

    public void clickShippingCompanyName(){
        clickOn(shippingCompanyNameTextbox);
        typeInto(shippingCompanyNameTextbox, USER_COMPANY_NAME);
    }

    public void searchShippingCountry(String country){
        clickOn(shippingCountryDropdownMenu);
        clickOn(shippingCountryTextbox);
        typeInto(shippingCountryTextbox, country);
    }

    public void clickShippingHouseNumberAndStreetName(){
        clickOn(shippingHouseNumberAndStreetNameTextbox);
        typeInto(shippingHouseNumberAndStreetNameTextbox, USER_STREET_ADDRESS);
    }

    public void clickShippingApartment(){
        clickOn(shippingApartmentSuiteUnitTextbox);
        typeInto(shippingHouseNumberAndStreetNameTextbox, USER_APARTMENT);
    }

    public void clickShippingSuite(){
        clickOn(shippingHouseNumberAndStreetNameTextbox);
        typeInto(shippingHouseNumberAndStreetNameTextbox, USER_SUITE);
    }

    public void clickShippingUnit(){
        clickOn(shippingHouseNumberAndStreetNameTextbox);
        typeInto(shippingHouseNumberAndStreetNameTextbox, USER_UNIT);
    }

    public void clickShippingCity(){
        clickOn(shippingCityTextbox);
        typeInto(shippingCityTextbox, USER_TOWN);
    }

    public void searchShippingCounty(String county){
        clickOn(shippingCountyDropdownMenu);
        clickOn(shippingCountyTextbox);
        typeInto(shippingCountyTextbox, county);
    }

    public void clickShippingPostcodeZip(){
        clickOn(shippingPostcodeZipTextbox);
        typeInto(shippingPostcodeZipTextbox, USER_POSTCODE_ZIP);
    }

    public void clickShippingSaveAddress(){
        clickOn(shippingSaveAddressButton);
    }
}
