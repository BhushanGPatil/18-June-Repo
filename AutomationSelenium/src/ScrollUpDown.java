import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://w3schools.com/js/js_popup.asp");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,3000)");//scroll down
	 js.executeScript("window.scrollBy(0,-2000)");//scroll up
     Thread.sleep(1000);
     js.executeScript("window.scrollBy(1000,0)");// scroll right
     Thread.sleep(1000);
     js.executeScript("window.scrollBy(-1000,0)");// scroll left
     Thread.sleep(1000);
     js.executeScript("window.scrollBy(1000,3000)");// scroll right + scroll down
     Thread.sleep(1000);
     js.executeScript("window.scrollBy(-1000,3000)");// scroll left + scroll down
     Thread.sleep(1000);
     js.executeScript("window.scrollBy(1000,-2000)");// scroll right + scroll up
     Thread.sleep(1000);
     js.executeScript("window.scrollBy(-1000,-2000)");//scroll left + scroll up

      
}
}
