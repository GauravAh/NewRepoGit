
package stepDefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import utils.TestContextSetUp;
import java.util.Set;

public class OfferPageStepDefinition {

    public String offerPageProductname;
    TestContextSetUp testContextSetUp;

    public OfferPageStepDefinition(TestContextSetUp testContextSetUp){
        this.testContextSetUp = testContextSetUp;
    }

    @Then("User search for the same shortname {string} in offers page to check if product exist")
    public void user_search_for_the_same_shortname_in_offers_page_to_check_if_product_exist(String shortName) {
        testContextSetUp.getPageObjectManager()
                .getOfferPage()
                .clickTopDealLink();

        // Switch to Child Window
        testContextSetUp.genericClass.switchToChildWindow();

        // Search product in Offer Page
        testContextSetUp.getPageObjectManager()
                .getOfferPage()
                .sentItem(shortName);

        // Get product name from Offer Page
        offerPageProductname = testContextSetUp.getPageObjectManager()
                .getOfferPage()
                .verifyProductName();

        // Validate Parent vs Child product
        Assert.assertEquals(
                testContextSetUp.landingPageProductname,
                offerPageProductname,
                "Product name is different between Landing Page and Offer Page"
        );
    }
}

