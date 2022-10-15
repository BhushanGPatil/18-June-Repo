import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3 {
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.google.com");
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 Dimension D2= new Dimension(100,300);
		 driver.manage().window().setSize(D2);
		 Thread.sleep(2000);
		 
		 Point P1 = new Point(300,300);
		 driver.manage().window().setPosition(P1);
		 Thread.sleep(2000);
		 
		 driver.close();
		 }

}
