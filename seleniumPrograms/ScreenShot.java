package seleniumPrograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");  //"D:\\SELENIUM\\selenium location path

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com");
		Thread.sleep(1000);
     File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     System.out.println(source);
     String str=RandomString.make(3);
     File destination=new File("D:\\SELENIUM\\screenshot\\zerodaimage"+str+".png");
     FileHandler.copy(source, destination);
     
	}
	

}
