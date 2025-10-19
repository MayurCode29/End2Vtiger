package stepdefinitions;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.LeadsPage;

public class LeadsSteps extends BaseClass{
	
	LeadsPage leads;
	
	
	@Given("the user is on leads page")
	public void the_user_is_on_leads_page() {
		leads=new LeadsPage(driver);
		leads.clickOnLeadsTab();
	    
	}

	@When("enters name in first name field")
	public void enters_name_in_first_name_field() {
	    leads.enterFirstName();
	}

	@When("clicks on search")
	public void clicks_on_search() {
	    leads.clickOnSearch();
	}

	@Then("user should see member with that name")
	public void user_should_see_member_with_that_name() {
		
		boolean isLeadDisplayed=leads.isLeadsNameDisplayed();
		Assert.assertTrue("Mary smith", isLeadDisplayed);
	    
	}


}
