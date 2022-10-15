import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 
	 WebDriver driver = new ChromeDriver ();
	driver.get("https://www.google.com");
	 driver.navigate().to("https://www.google.com");
   
	 String url= driver.getCurrentUrl();
     System.out.println(url);
     System.out.println(driver.getTitle());
     
     Navigation nv= driver.navigate();
     nv.back();
     
     nv.forward();
     Thread.sleep(2000);
     
     nv.refresh();
     Thread.sleep(2000);

	 
	 driver.manage().window().maximize();
	 Thread.sleep(4000);
	 
	 driver.manage().window().minimize();
	 Thread.sleep(4000);
	 
	Options op= driver.manage();
	Window w= op.window();
	w.maximize();
	
	Dimension D1= new Dimension(100,400);
	driver.manage().window().setSize(D1);
	Thread.sleep(4000);
	
	Point P= new Point(400,400);
	driver.manage().window().setPosition(P);
	Thread.sleep(4000);
	
	//driver.close();
	driver.quit();	
	
 

}
}