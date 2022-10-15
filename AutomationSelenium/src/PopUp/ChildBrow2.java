package PopUp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrow2 {



	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']")).click();
		Thread.sleep(2000);
		String mainWindowId = driver.getWindowHandle();
		String expUrl="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
		String expID= "";
	    Set <String> allAdd = driver.getWindowHandles();
	    
	    ArrayList <String> ar = new ArrayList<String>(driver.getWindowHandles());
	    String id= ar.get(1);
		driver.switchTo().window(id);
	    
	   // Main Window id = Index 0
	   // Last Opened Child id = Index 1
	   // First Opened Child = Last
	  
	for(String s: allAdd) {
	    	System.out.println(s);
	   	driver.switchTo().window(s);
	    	String actURL = driver.getCurrentUrl();
	    	
	    	if(expUrl.equals(actURL)) {
	    		System.out.println("correct Window");
		  	expID = s;
		    	//break;
		    	
		    } else{
		    	System.out.println("Wrong Window");
		    	
		    }
			
			 }
	   driver.switchTo().window(expID);
	    
	}   		
}
