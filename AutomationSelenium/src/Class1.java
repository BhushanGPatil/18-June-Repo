import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {
 public static void main(String[] args) throws InterruptedException {
	
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.google.in");
	 
	 driver.navigate().to("https://www.google.in");
	
	    
	     String url= driver.getCurrentUrl();
	     System.out.println(url);
	     System.out.println(driver.getTitle());
	     
	     Navigation nv= driver.navigate();
	     nv.back();
	     
	     nv.forward();
	     Thread.sleep(2000);
	     
	     nv.refresh();
	     Thread.sleep(2000);
	     
	     
	   
	     driver.close();
	     driver.quit();
	   
	     
	     
}
}