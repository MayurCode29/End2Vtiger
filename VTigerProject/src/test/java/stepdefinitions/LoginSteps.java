package stepdefinitions;

import org.apache.logging.log4j.Logger;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.HomePage;
import pages.LoginPage;
import utils.LoggerHelper;

public class LoginSteps extends BaseClass {
	private static final Logger log = LoggerHelper.getLogger(LoginSteps.class);
	
	
	LoginPage login;
	HomePage homePage;
	@Given("the user is on login page")
	public void the_user_is_on_login_page() {
		
		launchBrowser();
		/* driver.get("http://localhost:100/"); */
	    
	}

	@When("user user enters username {string} and password {string}")
	public void user_user_enters_username_and_password(String user, String pass) {
		log.info("Start login step for user: {}", user);
		login = new LoginPage(driver);
        login.enterUsername(user);
        login.enterPassword(pass);
	    
	}

	@When("clicks on Login button")
	public void clicks_on_login_button() {
		login.clickLogin();
	    
	}

	@Then("user should be on homepage")
	public void user_should_be_on_homepage() {
		
		homePage = new HomePage(driver);
        boolean isLogoutButtonDisplayed = homePage.isLogoutDisplayed();
        Assert.assertTrue("Logout", isLogoutButtonDisplayed);
        

        // Optional: close browser after test
        
	}
	
	@Then("user should be see error message")
	public void user_should_be_see_error_message() {
		
		boolean isErroredMessageDisplayed = login.isErrorMessageDisplayed();
        Assert.assertTrue("a valid username and password", isErroredMessageDisplayed);
        
	    
	}



}
