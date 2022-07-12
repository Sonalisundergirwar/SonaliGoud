package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webEmentMethod {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");  //"D:\\SELENIUM\\selenium location path

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.discoveryplus.in");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(1000);
        
		WebElement getOTPButton=driver.findElement(By.xpath("//button[text()='Get OTP']"));
        System.out.println(getOTPButton.isEnabled());
          driver.findElement(By.id("mobileNumber")).sendKeys("9423139646");
  		Thread.sleep(5000);
        System.out.println(getOTPButton.isEnabled());
         getOTPButton.click();
      	}}