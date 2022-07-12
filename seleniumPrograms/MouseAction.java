package seleniumPrograms;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");  //"D:\\SELENIUM\\selenium location path

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement seleniumButton =driver.findElement(By.linkText("Selenium"));
				// seleniumButton.click();--> using WebElement method
				// How to click using Actions class
				// Create object of Actions class and pass driver object
               Actions act=new Actions(driver);
               act.moveToElement(seleniumButton).click().build().perform();
            // act.click(seleniumButton).perform();
            // How to right click(contextClick)using actions class
             WebElement rightclickbutton = driver.findElement(By.xpath("//span[text()='right click me']"));
               //act.moveToElement(rightclickbutton).contextClick().build().perform();
               act.contextClick(rightclickbutton).perform();
               Thread.sleep(1000);

             WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
              // act.moveToElement(doubleclick).doubleClick().build().perform();
               act.doubleClick(doubleclick).perform();
               Thread.sleep(1000);
               Alert alt=driver.switchTo().alert();
               alt.dismiss();
               
	}

}
