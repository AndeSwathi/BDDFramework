package runnerFile;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:\\Users\\ande.swathi\\WorkSpaceEclipse\\cucumberBDDFramework\\src\\main\\java\\featureFiles\\login.feature"
 ,glue={"stepDefFiles"}
 )
 


public class Runner {

}
