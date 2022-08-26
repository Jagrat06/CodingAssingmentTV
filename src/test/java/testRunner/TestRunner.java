package testRunner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C://Users//Hp//eclipse-workspace//Assingment//src//test//resources//Assignment.feature",
        glue = {"stepDefination"} ,monochrome = true 
              )

public class TestRunner {

}
