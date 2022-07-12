package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownFB {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");  //"D:\\SELENIUM\\selenium location path
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(1000);
		WebElement day= driver.findElement(By.id("day"));
		Actions act= new Actions(driver);
		act.click(day).perform();
		for(int i=1;i<=9;i++)
		{
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(100);                     
		}
		act.sendKeys(Keys.ENTER).perform();
		WebElement firstname = driver.findElement(By.name("firstname"));
		act.keyDown(firstname,Keys.SHIFT).sendKeys("sonali").keyUp(Keys.SHIFT).build().perform();//sendKeys("sonali").keyUp(Keys.SHIFT).build().perform();//sendKeys("onali").build().perform();
		 Thread.sleep(5000);
		WebElement surname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		act.keyDown(surname,Keys.SHIFT).sendKeys("s").keyUp(Keys.SHIFT).sendKeys("undergirwar").build().perform();
		 Thread.sleep(100);

		WebElement email = driver.findElement(By.name("reg_email__"));
        act.sendKeys(email, "Sonalisundergirwar@gmail.com").perform();
		 Thread.sleep(100);
      //    act.keyDown( email,Keys.CONTROL).sendKeys(email, "c").keyUp(Keys.CONTROL).build().perform();
        WebElement remail = driver.findElement(By.name("reg_email_confirmation__"));
        act.keyDown( email,Keys.CONTROL).sendKeys(email, "a","c").build().perform();

        act.keyDown(remail,Keys.CONTROL).sendKeys(remail, "v").keyUp(Keys.CONTROL).build().perform();;
     
        WebElement month= driver.findElement(By.id("month"));
		Actions act1= new Actions(driver);
		act1.click(month).perform();
		for(int i=1;i<=10;i++)
		{
		act1.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(100);
		}
		WebElement year= driver.findElement(By.name("birthday_year"));
		Actions act2= new Actions(driver);
		act2.click(year).perform();
		for(int i=1;i<=10;i++)
		{
		act2.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(100);
		}
		act2.sendKeys(Keys.ENTER).perform();

		
	}
	}


