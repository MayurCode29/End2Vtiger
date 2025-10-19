package stepdefinitions;

import org.apache.logging.log4j.Logger;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.LoggerHelper;

public class Hooks {
	private static final Logger log = LoggerHelper.getLogger(Hooks.class);
	
	@Before
    public void setUp() {
        BaseClass.launchBrowser();
    }
	public void beforeScenario(Scenario scenario) {
        log.info("----- Starting scenario: {} -----", scenario.getName());
    }

    @After
    public void tearDown() {
        if (BaseClass.getDriver() != null) {
            BaseClass.getDriver().quit();
        }
    }
    
    public void afterScenario(Scenario scenario) {
        log.info("----- Finished scenario: {} - status: {} -----", scenario.getName(), scenario.getStatus());
    }

}
