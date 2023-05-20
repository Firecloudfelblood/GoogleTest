package steps_definitions;

import Actions.GoogleActions;
import Base.BaseUtil;
import com.aventstack.extentreports.GherkinKeyword;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSteps extends BaseUtil {

    private final GoogleActions actions = new GoogleActions();
    private BaseUtil base;

    public GoogleSteps(BaseUtil baseUtil) {
        BaseUtil.setDriver(actions.driver);
        this.base = baseUtil;
    }

    @Given("I'm on the google home page")
    public void ImOnGoogleHomePage() throws ClassNotFoundException {
        base.scenarioDef.createNode(new GherkinKeyword("Given"), "I'm on the google home page");
        actions.ImInTheHomePage();
    }

    @When("I search for wwe")
    public void iSearchForWwe() throws ClassNotFoundException {
        base.scenarioDef.createNode(new GherkinKeyword("When"),"I search for wwe");
        actions.SearchFor("WWE");
    }

    @Then("I see results relating to wwe")
    public void iSeeResultsRelatingToWwe() throws ClassNotFoundException {
        base.scenarioDef.createNode(new GherkinKeyword("Then"), "I see results relating to wwe");
        actions.ValidateResults();
    }
}
