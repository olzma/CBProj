package Runner;

import io.cucumber.junit.Cucumber;
import stepDefinitions.*;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"html:target/cucumber_html_report","pretty"},
		//pretty used for featurefile displayed colored in console
		features ={"features"},
		glue ={"stepDefinitions"},
		tags ="@register"
				//@RunOnlyForSmokeTest   @Books  @login @average
				//there are standard default tags  @dev @wip @ignore
		//@All and not @login and not @ignore and not @dev
		//monochrome = true
		)
public class Runner {


	
}
