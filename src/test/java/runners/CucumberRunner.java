package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        glue = "step_definitions",
        features = "src/test/resources/login.feature",
        dryRun = false,
        strict = true,
        tags = "@login"

        //,
//        plugin = {
//                "html:target/default-report",
//                "json:target/cucumber1.json",
//                "rerun:target/rerun.txt"
//        }

)
public class CucumberRunner {


}
