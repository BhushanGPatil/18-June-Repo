package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	  public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			Thread.sleep(2000);
		WebElement Languages = driver.findElement(By.xpath("//select[@name='Languages']"));
		
		Select s = new Select (Languages);
		Thread.sleep(2000);
		s.selectByValue("java");
		Thread.sleep(2000);
		s.selectByValue("js");
		Thread.sleep(2000);
		s.selectByValue("c#");
		Thread.sleep(2000);
		
		WebElement FirstSelected=s.getFirstSelectedOption();
		System.out.println(FirstSelected);
		System.out.println(FirstSelected.getText());
		System.out.println(s.getFirstSelectedOption().getText());
		System.out.println(s.isMultiple());
		
		List<WebElement> M1 = s.getAllSelectedOptions();
		List<WebElement> M = s.getOptions();
		System.out.println(M.size());
		System.out.println(M1.size());
		
		for (int i= 0; i< M.size(); i++) {
			System.out.println(M.get(i).getText());
			
		}
		
	//	s.deselectByValue("java");
	//	Thread.sleep(2000);
		//s.deselectByIndex(1);
	//	Thread.sleep(2000);
		//s.deselectByVisibleText("c#");
		s.deselectAll();
		
		
		
}
}