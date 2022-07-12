package seleniumPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");  //"D:\\SELENIUM\\selenium location path

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	    driver.findElement(By.id("alertBox")).click();
		Thread.sleep(1000);
        Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
	    alt.accept();
         Thread.sleep(1000);
		alt.dismiss();

		driver.findElement(By.id("confirmBox")).click();
		Thread.sleep(1000);
	    Alert alt2=driver.switchTo().alert();
		System.out.println(alt2.getText());
	    alt2 .accept();
        Thread.sleep(1000);
        alt2.dismiss();

		WebElement pb=driver.findElement(By.id("promptBox"));
		pb.click();
	    Thread.sleep(1000);
	    pb.sendKeys("i am promptbox");
		Alert alt3=driver.switchTo().alert();	
	    System.out.println(alt3.getText());
     	alt3.accept();
		Thread.sleep(1000);
        alt3.dismiss();

		
	}

}
