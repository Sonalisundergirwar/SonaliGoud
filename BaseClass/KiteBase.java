package BaseClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import UtilityClass.KiteUtilityClass;

public class KiteBase {
	
        protected static WebDriver driver;
		public void openBrowser() throws IOException
		{
		System.setProperty("webdriver.chrome.driver", "D:\\\\SELENIUM\\\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("incognito");
		driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
	   //	driver.get(KiteUtilityClass.getDataFromPropertyFile  ("URL"));
	   driver.get("https://kite.zerodha.com/");
	    Reporter.log("Launching browser",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		}
		public static void captureScreenshot( String TCID) throws
		IOException
		{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("D:\\SELENIUM\\screenshot\\MyScreenshot"+TCID+".png");
		FileHandler.copy(src, dest);
		}
}