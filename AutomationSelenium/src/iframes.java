import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/js/js_popup.asp");
	
		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']")).click();
		Thread.sleep(2000);
		String mainWindowId = driver.getWindowHandle();
		String expUrl="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
		String expID= "";
	    Set <String> allAdd = driver.getWindowHandles();
	    
	    ArrayList <String> ar = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(ar.get(1));
	    Thread.sleep(2000);
	   
	    driver.findElement(By.xpath("//a[@title='Change Theme']")).click();
	    
	    WebElement tryItIframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
	    driver.switchTo().frame(tryItIframe);
	    Thread.sleep(2000);
	    
	    driver.switchTo().defaultContent();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//a[@title='Change Theme']")).click();
	    
	    driver.switchTo().frame("iframeResult");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[text()='Try it']")).click();
	    
}
}