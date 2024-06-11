package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\pravi\\eclipse-workspace\\MukeshCucu\\MavenwithCucumber\\FeaturesFile",
glue="stepDefenition",
plugin={"html:target","json:report/jsonreport.json","junit:report/xmlreport.xml"},dryRun=false,monochrome=true)
public class TestRunner {

}
