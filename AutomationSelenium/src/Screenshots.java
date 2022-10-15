

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots{
	


	

	private static final String Date = null;

	public static void main(String[] args)  throws InterruptedException, IOException {
		Date date = new Date();
		SimpleDateFormat d = new SimpleDateFormat ("");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com"); 
		
		
		Thread.sleep(2000);
		
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		
		File Dest = new File("C:\\Users\\patil\\OneDrive\\Pictures\\Screenshots\\"+ Date +".jpg");
		FileHandler.copy(source,Dest);
		
}
}