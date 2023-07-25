package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "CucumberSeleniumFramework-master/Features/login.feature", //the path of the feature files
			glue={"stepDefinitions"},
			dryRun = false ,//to check the mapping is proper between feature file and step def file//the path of the step definition files
			//to generate different types of reporting
			monochrome = false//display the console output in a proper readable format
			//strict = true //it will check if any step is not defined in step definition file

			//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
			)
	 
	public class TestRunner {
	 
	}
	
	//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
	//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest
	

