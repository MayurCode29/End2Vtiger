package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;
import utils.LoggerHelper;
import org.apache.logging.log4j.Logger;

public class LoginPage {
	
    WebDriver driver= BaseClass.getDriver();;
    private static final Logger log = LoggerHelper.getLogger(LoginPage.class);

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//input[@name='user_name']")
    WebElement username;
    @FindBy(xpath="//input[@name='user_password']")
    WebElement password;
    @FindBy(xpath="//input[@name='Login']")
    WebElement loginButton;
    @FindBy(xpath="//*[contains(text(),' a valid username and password. ')]")
    WebElement errorMessage;

    public void enterUsername(String user) {
    	log.info("Entering username: {}", user);
        username.sendKeys(user);
    }

    public void enterPassword(String pass) {
    	log.info("Entering password");
        password.sendKeys(pass);
    }

    public void clickLogin() {
    	log.info("Clicking login button");
        loginButton.click();
    }
    
    public boolean isErrorMessageDisplayed() {
        return errorMessage.isDisplayed();
}

	
	}

