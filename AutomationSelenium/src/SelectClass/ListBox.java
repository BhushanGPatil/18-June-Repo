package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			Thread.sleep(3000);			
			driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
			Thread.sleep(3000);	
			WebElement Month = driver.findElement(By.xpath("//select[@title='Month']"));
			
			Select s = new Select (Month);
			Thread.sleep(3000);	
			s.selectByIndex(2);
			Thread.sleep(3000);	
			s.selectByValue("4");
			Thread.sleep(3000);	
			s.selectByVisibleText("Jun");
		
}
}
