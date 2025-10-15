package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage {
	
    WebDriver driver= BaseClass.getDriver();;

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
        username.sendKeys(user);
    }

    public void enterPassword(String pass) {
        password.sendKeys(pass);
    }

    public void clickLogin() {
        loginButton.click();
    }
    
    public boolean isErrorMessageDisplayed() {
        return errorMessage.isDisplayed();
}

	
	}

