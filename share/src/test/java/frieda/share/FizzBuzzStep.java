package frieda.share;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Glue code for FizzBuzz.feature
 */
//@RunWith(Cucumber.class)
//@CucumberOptions(strict = true,  features = {
//        "src/test/java/resources/",
//    },monochrome=true)
@CucumberOptions(features = "Feature")
public class FizzBuzzStep {

	@Given("^Create a FizzBuzz game play$")
	public void createAFizzBuzzGamePlay() {

	}

	@When("^I play with number (\\d+)$")
	public void iPlayWithNumber(int number) {

	}

	@Then("^The result is Fizz$")
	public void theResultIsFizz() {

	}

}
