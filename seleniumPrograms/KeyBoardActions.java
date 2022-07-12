package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");  //"D:\\SELENIUM\\selenium location path

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://vctcpune.com/selenium/practice.html");
        WebElement text = driver.findElement(By.id("autocomplete"));
        Actions act=new Actions(driver);
		act.sendKeys(text, "sonali").perform();
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
	    act.click(dropdown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	
	
	}

}

