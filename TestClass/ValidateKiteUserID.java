package TestClass;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseClass.KiteBase;
import KiteWithPOM.KiteHomePage;
import KiteWithPOM.KiteLogInPage;
import KiteWithPOM.KitePinPage;
import UtilityClass.KiteUtilityClass;
@Listeners(UtilityClass.ListenerClass.class)
public class ValidateKiteUserID extends  KiteBase {
	KiteHomePage home;
	KiteLogInPage login;
	KitePinPage pin;
	//String TCID="555";
	//@Parameters("browserName")
	@BeforeClass
	
	public void launchBrowser( ) throws IOException
	{
		//setUpCrossBrowser(name);
	   openBrowser();
	login= new KiteLogInPage(driver);
	pin= new KitePinPage(driver);
	home= new KiteHomePage(driver);
	}
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
	login.sendUserName(KiteUtilityClass.getDataFromPropertyFile("UN"));
	login.sendPassword(KiteUtilityClass.getDataFromPropertyFile("PWD"));
	login.clickOnLoginButton();
	pin.sendPin(KiteUtilityClass.getDataFromPropertyFile("PIN"));
	pin.clickOnContinueButton();
	}
	@Test
	 public void validateUserID() throws EncryptedDocumentException, IOException
	 {
		Assert.fail();
		Assert.assertEquals(home.getactualUserName(), 
	KiteUtilityClass.getDataFromPropertyFile("UN"));
	//KiteUtilityClass.captureScreenshot(driver, TCID);
	}
	@AfterMethod
	public void logOutFromKite() throws InterruptedException
	{
	home.logOut();
	}
	@AfterClass
	public void closeBrowser()
	{
	driver.close();
	
	}
}


