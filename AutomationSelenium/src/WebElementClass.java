import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementClass {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(1000);
	    List<WebElement> rows =	driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(rows.size());
		List <WebElement> headerCells = driver.findElements(By.xpath("//table[@id='customers']//tr/th"));
		List <WebElement> remeaningCells = driver.findElements(By.xpath("//table[@id='customers']//tr/td"));
		System.out.println(headerCells.size() + remeaningCells.size());
		
		for (WebElement cell : headerCells) {
			System.out.println(cell.getText());
		}
		for (WebElement cell : remeaningCells) {		System.out.println(cell.getText());
		}
		for (int i = 1;i <=rows.size(); i++) {
			
			
			
			List<WebElement> rowcells;
			if (i==1) {
			 rowcells = driver.findElements(By.xpath("//table[@id='customers']//tr["+i+"]/th"));
			}
			else {
			 rowcells = driver.findElements(By.xpath("//table[@id='customers']//tr["+i+"]/td"));
			}
			
		
			for (int j=0; j<rowcells.size(); j++) {
				System.out.println(rowcells.get(j).getText()+"   ");
			}
			System.out.println();
		}
	}
}
 