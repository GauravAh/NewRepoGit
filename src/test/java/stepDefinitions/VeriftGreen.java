package stepDefinitions;

import io.cucumber.java.en.Given;
import org.testng.Assert;
import utils.TestContextSetUp;

public class VeriftGreen {
    TestContextSetUp testContextSetUp;

    public VeriftGreen(TestContextSetUp testContextSetUp){
        this.testContextSetUp = testContextSetUp;
    }

    @Given("User should be on GreenCart Landing page for different scenario")
    public void VerifyL(){
        String logoVisible = testContextSetUp.getPageObjectManager().getLandingPage().getTextLogo();
        Assert.assertEquals(logoVisible,"KART");
    }

}
