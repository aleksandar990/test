package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/aleksandarpetrovski/eclipse-workspace/SixthProject/src/test/resources/Features", glue= {"stepDefinitions"})

public class TestRunner {

}
