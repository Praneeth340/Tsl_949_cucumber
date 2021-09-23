package runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/frontAcc.feature",
          glue="StepDefinition",
         monochrome=true,//Formatting console
          dryRun=false, //if true then it will check whether every step has matching step definition or not
          plugin= {"pretty","html:target/tsl949.html","json:target/JsonReport/report.json"})
public class FrontRunner {

	

}
