package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrame2 
{

		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");  //"D:\\SELENIUM\\selenium location path

			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
					
			Thread.sleep(1000);
			driver.switchTo().frame(0);
			driver.findElement(By.tagName("input")).sendKeys("selenium");
			Thread.sleep(1000);
			//driver.switchTo().defaultContent();
			//driver.switchTo().frame(0);
			Thread.sleep(1000);

			driver.switchTo().frame("frame3");//.switchTo().frame("frame3");
			driver.findElement(By.id("a")).click();
			driver.switchTo().defaultContent();
			driver.switchTo().frame(1);
			WebElement s=driver.findElement(By.id("animals"));
			Select s1=new Select(s);
			s1.selectByIndex(0);

		}

}
