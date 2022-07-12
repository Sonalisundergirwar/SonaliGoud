package seleniumPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");  //"D:\\SELENIUM\\selenium location path

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.findElement( By.xpath("(//button[text()='Click me'])[1]")).click();
		Alert alt=driver.switchTo().alert();
		alt.getText();
		System.out.println(alt.getText());
		alt.accept();
		Thread.sleep(1000);
         //alt.dismiss();
         
	}

}
