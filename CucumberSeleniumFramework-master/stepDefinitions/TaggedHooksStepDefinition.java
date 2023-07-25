package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaggedHooksStepDefinition {
	
	@Before(order=0)
	public void setUP(){
		System.out.println("launch FF");
		System.out.println("Enter URL for Free CRM APP");
	}

}
