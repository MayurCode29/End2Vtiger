package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperActions {

    private WebDriver driver;


    public HelperActions(WebDriver driver) {
        this.driver = driver;
    }


    public void SetInput(WebElement elm, String value)
    {
        try
        {
            elm.clear();
            elm.sendKeys(value);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void ClickElement(WebElement elm)
    {
        try
        {

            elm.click();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public String ElementExist(WebElement elm)
    {
        try
        {

            elm.isDisplayed();
            return elm.getText().trim();
        }
        catch(Exception e)
        {
            System.out.println("element not visible"+e.getMessage());
        }
        return null;

    }
}


