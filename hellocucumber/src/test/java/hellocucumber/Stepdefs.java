package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class Stepdefs {

	private String hoy;
	private String respuesta;

	@Given("today is Sunday")
	public void today_is_Sunday() {
		hoy = "Sunday";
	}

	@When("I ask whether it's Friday yet")
	public void i_ask_whether_it_s_Friday_yet() {
		respuesta = IsFriday.isItFriday(hoy);
	}

	@Then("I should be told {string}")
	public void i_should_be_told(String string) {
		assertEquals(string, respuesta);
	}

}
