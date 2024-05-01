package com.qa.magento.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/uiFailedTests.txt",//location of feature file(provide feature folder)(Content)
        glue = "com/qa/magento/stepdefinitions", //location of step definition(source)
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
)
public class ReRunner {

}


