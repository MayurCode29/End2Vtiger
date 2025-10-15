package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.WaitUtils;

import java.time.Duration;

public class AccountsPage {
	
	WebDriver driver;
	Alert alert;
	WaitUtils waitUtils;
	
	public AccountsPage(WebDriver driver)
	{
		this.driver=driver;
		this.waitUtils=new WaitUtils(driver);
		PageFactory.initElements(driver, this);
		
	}

	
	@FindBy(xpath="//*[text()='Accounts']")
	WebElement AccountsTab;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	WebElement SaveButton;
	
	 
	public void clickOnAccounts()
	{
		AccountsTab.click();
	}
	
	
	
	public void clickOnSave()
	 {
		 SaveButton.click();
	 }
	
	
	public String getAlertMessage()
	{
		
		waitUtils.waitForAlertIsPresent(10);
		
		/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());*/
	 
		alert=driver.switchTo().alert();
		String getText=alert.getText();
		alert.accept();
		return getText;
	}
	/*public void clickOnAlert()
	
	{
	 driver.switchTo().alert().accept();
	 
	} */



	
	
	
}
