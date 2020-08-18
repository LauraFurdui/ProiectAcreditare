package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private CartSteps cartSteps;


    @Test
    public void addToCart() {
        loginSteps.login(Constants.USER_EMAIL,
                Constants.USER_PASSWORD,
                "Hello, Hai C' Am Schimbat La Loc (Merry Christams)!");
        cartSteps.hoverOverWomenTab();

    }
}
