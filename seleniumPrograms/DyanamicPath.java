package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicPath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");  //"D:\\SELENIUM\\selenium location path

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("realme 9");
		driver.findElement(By.tagName("svg")).click();
		Thread.sleep(5000);
		String totalreviews = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[2]")).getText();
		System.out.println(totalreviews);
	}

}
