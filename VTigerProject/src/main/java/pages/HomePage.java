package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WaitUtils;

public class HomePage {
	
	WebDriver driver;
	WaitUtils waitUtils;
	
	@FindBy(xpath="//*[text()='Logout']")
	WebElement Logout;
    
    

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public String isLogoutDisplayed() {
    	
    	/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(Logout));*/
    	
    	waitUtils.waitForVisibility(Logout, 10);

        return Logout.getText().trim();
    }
}


