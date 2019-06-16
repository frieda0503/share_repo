package frieda.share;

import static org.junit.Assert.assertEquals;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Glue code for FizzBuzz.feature
 */
public class FizzBuzzStep {
	private FizzBuzzServiceImpl service;
	String result;

	@Given("^Create a FizzBuzz game play$")
	public void create_A_FizzBuzz() {
		service = new FizzBuzzServiceImpl();

	}

	@When("^I play with number (\\d+)$")
	public void play_With_Number(int number) {
		result = service.getFizzBuzz(number);

	}

	@Then("^The result is Fizz$")
	public void result_Is_Fizz() {
		assertEquals("Fizz", result);
	}

}
