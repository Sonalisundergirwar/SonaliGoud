package seleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverStudy {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");  //"D:\\SELENIUM\\selenium location path

     	WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com");// to enter url in browser or to open an application....
//		driver.close();//to close the current tab
//		driver.quit();//to close the all tab present in browsers by selenium
//		driver.manage().window().maximize();
//		driver.manage().window().minimize();
		driver.navigate().to("https://mail.google.com/");

	}

}
