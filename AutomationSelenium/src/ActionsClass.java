import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);

		WebElement changelanguage = driver.findElement(By.xpath("//a[@aria-label='Choose a language for shopping.']"));
		Actions act = new Actions (driver);
		// act.moveToElement(changelanguage).perform();
		//act.contextClick().perform();
		//act.contextClick(changelanguage).perform();
	//act.moveToElement(changelanguage).perform();
		//act.click().perform();
	//act.click(changelanguage).perform();
		
		//act.doubleClick().perform();
		//act.doubleClick(changelanguage).perform();
		
		
		act.moveToElement(changelanguage).click().build().perform();

		
		
}
}