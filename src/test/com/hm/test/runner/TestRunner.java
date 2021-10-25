package com.hm.test.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;


// @RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/com/hm/test/features/"},glue = {"src/test/com/hm/test/steps"},  plugin = {"pretty"})
public class TestRunner extends AbstractTestNGCucumberTests  {




}
