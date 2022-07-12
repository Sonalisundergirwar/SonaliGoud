import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");  //"D:\\SELENIUM\\selenium location path
       WebDriver driver = new ChromeDriver();
			
			driver.get("https://vctcpune.com/selenium/practice.html");
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			WebElement hide = driver.findElement(By.id("displayed-text"));
			JavascriptExecutor js=((JavascriptExecutor)driver);
			Thread.sleep(3000);
			js.executeScript("arguments[0].scrollIntoView(true);",hide);

			hide.sendKeys("Hello Aman");
			
			WebElement name = driver.findElement(By.id("name"));
			
			JavascriptExecutor jn= ((JavascriptExecutor)driver);
			Thread.sleep(2000);
			jn.executeScript("arguments[0].scrollIntoView(true);",name);
			
			name.sendKeys("Hello Harsha");
			Thread.sleep(2000);
			
			WebElement countries = driver.findElement(By.id("autocomplete"));
			
			JavascriptExecutor jc= ((JavascriptExecutor)driver);
			
			//jc.executeScript("arguments[0].scrollIntoView(true);",countries);
			
					
					js.executeScript("arguments[0].value='Hello Mrunali';",countries );
					
					//countries.sendKeys("Hello Mrunali");
					 Thread.sleep(3000);
			
					 
					 
					 
					 
		}
	}


