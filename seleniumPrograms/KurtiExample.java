package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KurtiExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");  //"D:\\SELENIUM\\selenium location path

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kurties");
		driver.findElement(By.tagName("svg")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("container")).click();
		String text = driver.findElement(By.xpath("(//div[@ class='_1YokD2 _3Mn1Gg col-8-12']//span)[10]")).getText();
        System.out.println(text);

	}
}
