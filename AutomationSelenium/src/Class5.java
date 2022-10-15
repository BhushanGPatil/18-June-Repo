import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\patil\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
	
		driver.manage().window().maximize();
		
		driver.getTitle();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		driver.navigate().back();
		driver.navigate().to("https://www.google.com");
		Thread.sleep(3000);
		
		Dimension D1 = new Dimension(200,400);
		driver.manage().window().setSize(D1);
		Thread.sleep(2000);
		
		Point P1 = new Point(100,500);
		driver.manage().window().setPosition(P1);
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.navigate().to("https://facebook.com");
		
	    Navigation nv = driver.navigate();
	    nv.refresh();
	    Thread.sleep(2000);
	    
	    driver.close();
		
		
		
	}
	
}
