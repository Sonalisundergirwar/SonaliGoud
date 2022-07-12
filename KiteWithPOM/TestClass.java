package KiteWithPOM;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass
{
	public class ValidateKiteUserID extends BaseClass{
		//@Parameters("browserName")
		//@BeforeClass
		KiteHomePage home;
		KiteLogInPage login;
		KitePinPage pin;
		@Parameters("browserName")
		@BeforeClass		
		public void launchBrowser(@Optional String name) throws InterruptedException, IOException

		{
			if(name.equals("firefox"))
			{
			
				openfirefoxBrowser();
			}
			else if (name.equals("chrome"))
			{
			
				openchromeBrowser();

			}
		
		      login= new KiteLogInPage(driver);
			  pin= new KitePinPage(driver);
		      home= new KiteHomePage(driver);
		}
		@BeforeMethod
		public void loginToKiteApp() throws EncryptedDocumentException, IOException
		{
		login.sendUserName(UtilityClass.readDataFromExcel(0, 0));
		Reporter.log("LOGIN SUCCESSFULLY......",true);
        login.sendPassword(UtilityClass.readDataFromExcel(0, 1));
		login.clickOnLoginButton();
		Reporter.log("LOGIN SUCCESSFULLY......",true);
       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pin.sendPin(UtilityClass.readDataFromExcel(0, 2));
		pin.clickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		}
		@Test
		 public void validateUserID() throws EncryptedDocumentException, IOException
		{
			Assert.assertEquals(home.getactualUserName(), UtilityClass.readDataFromExcel(0, 0),"Actual and Expected are not matching TC is failed");
			Reporter.log("VALIDATED  USERID  SUCCESSFULLY......",true);

		}
		@AfterMethod
		public void logOutFromKite() throws InterruptedException
		{
		home.logOut();
		Reporter.log("LOGOUT SUCCESSFULLY......",true);

	  }
		@AfterClass
		public void closeBrowser()
     {
		driver.close();
		Reporter.log("BROWSER CLOSED SUCCESSFULLY......",true);

		}

  }

	
}
