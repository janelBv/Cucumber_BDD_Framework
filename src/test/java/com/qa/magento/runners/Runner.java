package com.qa.magento.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)// run cucumber test scenario with Junit
@CucumberOptions(//annotation that has some special keywords
        features = "src/test/resources/features",//location of feature file(provide feature folder)(Content)
        glue = "com/qa/magento/stepdefinitions",//location of step definition(source)
        dryRun = false,  //get snips without executing the steps (true)
        tags = "@regression", //filter test cases or scenario
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
)
public class Runner {
}