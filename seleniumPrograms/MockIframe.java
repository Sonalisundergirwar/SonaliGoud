package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MockIframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");  //"D:\\SELENIUM\\selenium location path

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://skpatro.github.io/demo/iframes/");
	
	String pav=driver.findElement(By.xpath("//a[text()='Pavilion']")).getText();
	System.out.println("i am present on main frame   "+pav);
	Thread.sleep(1000);
	driver.switchTo().frame(0);
	String inside=driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
	System.out.println("i am present on  frame1   "+inside);
	driver.switchTo().frame(1);
	String cat3=driver.findElement(By.xpath("//a[text()='Category3']")).getText();
	System.out.println("i am present on  frame2  "+cat3);


	}

}
