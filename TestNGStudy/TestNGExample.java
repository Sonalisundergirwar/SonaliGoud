package TestNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGExample {
  @Test
  public void loginpage() throws InterruptedException
  {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");  //"D:\\SELENIUM\\selenium location path
		 WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();		
			driver.get("https://kite.zerodha.com/");
			Thread.sleep(2000);
	  System.out.println("hii this is first testNG Example");
	  Reporter.log("hii this is first testNG Example2");
	  Reporter.log("hii this is first testNG Example3",true);
 
  }
  @Test
  public void loginpage2() throws InterruptedException
  {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");  //"D:\\SELENIUM\\selenium location path
		 WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();		
			driver.get("https://kite.zerodha.com/");
			Thread.sleep(2000);
	  
  }
}
