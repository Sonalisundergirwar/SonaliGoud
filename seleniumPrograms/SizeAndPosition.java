package seleniumPrograms;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SizeAndPosition {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");  //"D:\\SELENIUM\\selenium location path

			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		System.out.println(driver.manage().window().getPosition());
		// to set position we need to create object of Point Class and pass X and Ycoordinate 
		Point p= new Point(200,10);
		// using SetPosition method we can set the browser position
		driver.manage().window().setPosition(p);
	}
		}


