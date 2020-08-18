package org.fasttrackit.steps;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.*;

import static org.fasttrackit.utils.Constants.*;

import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
import org.junit.Assert;

public class ProductSteps {
    private ProductPage productPage;

    @Step
    public void addToCart(){
        productPage.addToCart();
    }

    @Step
    public void enterQuantity(String quantity){
        productPage.clickQuantity(quantity);
    }
}
