package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;

public class CartSteps {

    private HomePage homePage;

    @Step
    public void hoverOverWomenTab(){
        homePage.mouseOverElement("women");

        homePage.mouseOverElement("men");
        homePage.mouseOverElement("home");
        homePage.mouseOverElement("acce");
        homePage.mouseOverElement("vip");
    }
}
