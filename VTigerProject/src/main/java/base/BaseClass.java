package base;


	
	import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfigReader;

	public class BaseClass {
	    public static WebDriver driver;
	    public static Properties prop;

	    public static void launchBrowser() {
	    	prop = ConfigReader.initProperties();
	        String browserName = prop.getProperty("browser").toLowerCase();

	        switch (browserName) {
	            case "chrome":
	            	WebDriverManager.chromedriver().setup();
	                driver = new ChromeDriver();
	                break;
	            case "firefox":
	            	WebDriverManager.firefoxdriver().setup();
	                driver = new FirefoxDriver();
	                break;
	            case "edge":
	            	WebDriverManager.edgedriver().setup();
	                driver = new EdgeDriver();
	                break;
	            default:
	                throw new IllegalArgumentException("Invalid browser name: " + browserName);
	        }
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	        String url = prop.getProperty("url");
	        if (url == null) {
	            throw new RuntimeException("URL not found in config file!");
	    }
	        driver.get(url);
	    }
	    public static WebDriver getDriver() {
	        return driver;
	    }

	    public static void closeBrowser() {
	        if (driver != null) {
	            driver.quit(); 
	        }
	        
	    }
	}
	
	    


