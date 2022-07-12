package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstSel {

	public static void main(String[] args) 
			throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");  //"D:\\SELENIUM\\selenium location path

		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");// enter url....
     	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("sonali");//sending text
	    driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();//clicking on checkbox button
	    driver.findElement(By.xpath("//input[@value='Radio2']")).click();//clicking checkbox   of radio button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='name']")).clear();//sending text

	}

}

