package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WaitUtils;

public class LeadsPage {
	
	WebDriver driver;
	WaitUtils waitUtils;
	
	public LeadsPage(WebDriver driver)
	{
		this.driver=driver;
		this.waitUtils=new WaitUtils(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//*[text()='Leads']")
	WebElement LeadsTab;
	@FindBy(xpath="//input[@name='firstname']")
	WebElement FirstNameField;
	@FindBy(xpath="//input[@title=\'Search [Alt+Q]\']")
	WebElement SearchButton;
	@FindBy(xpath="//a[text()='Mary Smith']")
	WebElement LeadName;
	
	
	
	
	public void clickOnLeadsTab()
	{
		LeadsTab.click();
	}

	
	
	public void enterFirstName()
	{
		FirstNameField.sendKeys("Mary");
	}
	
	public void clickOnSearch()
	{
		SearchButton.click();
	}
	
	 public boolean isLeadsNameDisplayed() {
	    	
	    	
	    	
	    	waitUtils.waitForVisibility(LeadName, 10);

	        return LeadName.isDisplayed();
	    }
	
	
}
