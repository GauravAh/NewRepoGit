package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.TestContextSetUp;

public class LandingPageStepDefinition {
    TestContextSetUp testContextSetUp;

   public LandingPageStepDefinition(TestContextSetUp testContextSetUp){
       this.testContextSetUp = testContextSetUp;
   }

    @Given("User should be on GreenCart Landing page")
    public void user_should_be_on_green_cart_landing_page() {
        boolean logoVisible = testContextSetUp.getPageObjectManager().getLandingPage().verifyLogo();
        Assert.assertTrue(logoVisible);
    }

    @When("User search with shortname {string} and extracted the actual name of product")
    public void user_search_with_shortname_and_extracted_the_actual_name_of_product(String shortName) {
        testContextSetUp.getPageObjectManager().getLandingPage().sentItem(shortName);
        String productText = testContextSetUp.getPageObjectManager().getLandingPage().getProductText();
        String[] splitText = productText.split("-");
        String getproductText = splitText[0];
        testContextSetUp.landingPageProductname =  getproductText.trim();
        System.out.println("Product Name is extracted from Home page" + testContextSetUp.landingPageProductname);
   }

}
