package seleniumPrograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");  //"D:\\SELENIUM\\selenium location path

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
     	Thread.sleep(2000);
     	//to handle one window opened window to handle main page.......
     	String mainpageid=driver.getWindowHandle();
     	System.out.println(mainpageid);
		driver.findElement(By.name("NewWindow")).click();
     	Thread.sleep(2000);
        //to handle multiple windows ....
     	Set<String> allwindowids=driver.getWindowHandles();
     	Iterator<String> it=allwindowids.iterator();
     	String mainpageid1=it.next();
     	System.out.println(mainpageid1);   	
     	String childwindowid=it.next();
     	System.out.println(childwindowid);
     	String child2=it.next();

     	//String mainpageid2=it.next();
     	//System.out.println(mainpageid2);   	
     	//String mainpageid2=it.next();
        //to change focus to child window......
     	driver.switchTo().window(childwindowid);
     	driver.manage().window().maximize();
     	driver.findElement(By.id("the7-search")).sendKeys("sonali");
     	Thread.sleep(2000);
     	driver.close();
     	driver.switchTo().window(mainpageid1);
        WebElement text=driver.findElement(By.xpath("//p[text()='Click below to open link in new browser window']"));
     	System.out.println(text.getText());
     	Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@class='btn'])[2]")).click();
		driver.manage().window().maximize();
     	//String child2=driver.getWindowHandle();

		//String child2=it.next();

        //WebElement text2 = driver.findElement(By.xpath("//p[text()='Click below to download a file']"));
     	//System.out.println(text2.getText());
     	driver.switchTo().window(child2);
		driver.manage().window().maximize();
     	driver.findElement(By.xpath("//h3[text()='QA tools & automation testing techniques']")).getText();


        //driver.findElement(By.xpath("/
       
        //driver.close;
        //driver.quit();   //to close all tabs.......    	
     	//driver.close();  //to close the current tab..
//     	driver.switchTo().window(mainpageid1);
//        driver.findElement(By.("NewWindow")).click();

        
}
   }
