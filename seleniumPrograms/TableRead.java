package seleniumPrograms;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableRead {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");  //"D:\\SELENIUM\\selenium location path

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		//to find no of rows...
		 List<WebElement> totalnorows = driver.findElements(By.xpath("//table//tr"));
		System.out.print("total no of rows-->"+ totalnorows.size());
		System.out.println("==================================================================");
		//to find total no of columns.....
		List<WebElement> totalnocolums = driver.findElements(By.xpath("//table//tr[1]//th"));
		System.out.println("total no of columns  "+ totalnocolums.size());
		System.out.println("==================================================================");

		for(WebElement headers:totalnocolums) 
		{
			System.out.print("name of each colums are-->"+ headers.getText());
			
		}
		//to read the data......
		List<WebElement> alldata = driver.findElements(By.xpath("//table//tr"));
		Iterator<WebElement> it = alldata.iterator();
		while(it.hasNext()){
			System.out.println("==================================================================");

			System.out.print(it.next().getText()+" ");
			System.out.println();
		}
	}
	

}
