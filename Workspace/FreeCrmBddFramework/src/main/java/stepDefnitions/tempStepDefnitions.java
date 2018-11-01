package stepDefnitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class tempStepDefnitions {
	
	@Given("^temp one given$")
	public void temp_one_given(){
		System.out.println("Running of temp one method");
	}

	@Given("^temp two given$")
	public void temp_two_given(){
		System.out.println("Running of temp two method");
	}
	
	
}






