package frieda.share;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Bdd Test
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:resources/FizzBuzz.feature")
public class FizzBuzzStepTest {

}
