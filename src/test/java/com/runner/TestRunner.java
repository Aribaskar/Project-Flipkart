package com.runner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ariba\\eclipse-workspace\\Flipkart\\src\\test\\resources\\com\\feature\\flipkart.feature", glue="com.stepdefination", dryRun=false)
public class TestRunner {
	
	
	}


