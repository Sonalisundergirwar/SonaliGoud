package seleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class webmethod2 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
Thread.sleep(1000);

System.out.println("enter your mail id");
driver.findElement( By.id("email")).sendKeys("sonalisundergirwar@gmail.com");
System.out.println("enter your password");
driver.findElement( By.id("pass")).sendKeys("saibaba94");
//create new account
driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
Thread.sleep(1000);

driver.findElement( By.name("firstname")).sendKeys("sonali");
driver.findElement( By.name("lastname")).sendKeys("komatwar");
driver.findElement( By.name("reg_email__")).sendKeys("sonalisundergirwar@gmail.com");
driver.findElement( By.name("reg_email_confirmation__")).sendKeys("sonalisundergirwar@gmail.com");
driver.findElement( By.id("password_step_input")).sendKeys("12365489");

WebElement bday= driver.findElement(By.name("birthday_day"));  
Select s=new Select(bday);
s.selectByValue("8");
Thread.sleep(1000);
WebElement month= driver.findElement(By.name("birthday_month"));  
Select s1=new Select(month);
s1.selectByVisibleText("Sep");
WebElement year= driver.findElement(By.name("birthday_year"));  
Select s2=new Select(year);
s2.selectByValue("1995");
}
}