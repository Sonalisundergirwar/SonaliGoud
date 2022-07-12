package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");  //"D:\\SELENIUM\\selenium location path

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		Thread.sleep(1000);
       driver.findElement(By.name("mytext1")).sendKeys("sonali");
		Thread.sleep(1000);
        driver.switchTo().defaultContent();
         driver.switchTo().frame(1);
         driver.findElement(By.name("mytext2")).sendKeys("my frame 1");
         driver.switchTo().defaultContent();
         driver.switchTo().frame(2);
         driver.findElement(By.name("mytext3")).sendKeys("my frame 2");
         driver.switchTo().defaultContent();
         driver.switchTo().frame(3);
         driver.findElement(By.name("mytext4")).sendKeys("my frame 3");
         driver.switchTo().defaultContent();
         driver.switchTo().frame(4);
         driver.findElement(By.name("mytext5")).sendKeys("my frame 4");
         driver.switchTo().defaultContent();
         driver.switchTo().frame(2);
         String text=driver.findElement(By.xpath("//p[text()='iframe inside frame:']")).getText();
         System.out.println(text);
         driver.switchTo().defaultContent();
        driver.switchTo().frame("frame3");

          WebElement frame=driver.findElement(By.id("mG61Hd"));
         System.out.println(frame);
        String text1=driver.findElement(By.xpath("//div[text()='Form Filling Demo Page'")).getText();
        System.out.println(text1);
	     driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[1]")).click();

	}

}