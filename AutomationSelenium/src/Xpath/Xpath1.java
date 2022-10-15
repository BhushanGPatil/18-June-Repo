package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {
    public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8623847372");
	//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("122436Bp");
	//driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	}
}
