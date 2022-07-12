package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");  //"D:\\SELENIUM\\selenium location path

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement source = driver.findElement(By.xpath("//a[text()=' 5000' ]"));
       // WebElement destination = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		WebElement destination = driver.findElement(By.id("amt8"));

		Thread.sleep(1000);
        Actions act=new Actions(driver);
        //act.moveToElement(source).clickAndHold().moveToElement(destination).release().build().perform();
        act.dragAndDrop(source, destination).perform();
	}
}
