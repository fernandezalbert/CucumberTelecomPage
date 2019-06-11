package org.test.Cucu.telecom;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Cucumberfrst\\AddCustomer.feature", glue="org.cucumberfst", plugin="html:target",tags= {"@us1,@us2"})
public class TestRunner {

}
