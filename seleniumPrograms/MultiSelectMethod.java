package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectMethod {

		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
            driver.get("https://demoqa.com/select-menu");
            Thread.sleep(1000);

      
      WebElement  multiselect=driver.findElement(By.name("cars"));
    Select s=new Select(multiselect);
          System.out.println("multiselect value is"+s.isMultiple());
        // System.out.println(" first select option  is....."+s.getFirstSelectedOption().getText());
        // s.getAllSelectedOptions();

s.selectByVisibleText("Volvo");
Thread.sleep(1000);
s.getAllSelectedOptions();
System.out.println(" first select option  is....."+s.getFirstSelectedOption().getText());

s.selectByValue("saab");
Thread.sleep(1000);
s.selectByIndex(2);
Thread.sleep(1000);
s.selectByIndex(3);
Thread.sleep(5000);

//s.deselectAll();
//System.out.println(s.getFirstSelectedOption().getText());

//to deselect all....
s.deselectAll();
//to deselect one by one..args.clone().clone().
//s.deselectByIndex(3);
//Thread.sleep(1000);
//s.deselectByValue("saab");
//Thread.sleep(1000);
//s.deselectByVisibleText("Volvo");
//Thread.sleep(1000);
//s.deselectByIndex(2);
s.getAllSelectedOptions();

}
}