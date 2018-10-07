package mySeleniumPractise;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAction1 {
	WebDriver driver;
	String baseURL;

	@BeforeEach
	public void setUp() throws Exception {
		driver=new ChromeDriver();
		baseURL="https://letskodeit.teachable.com/p/practice";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
			
	}
	
	@Test
	public void test() {
		driver.get(baseURL);
		driver.findElement(By.xpath("//a[@class='navbar-link fedora-navbar-link']")).click();
		System.out.println("Clicking login button");
		
		driver.findElement(By.id("user_email")).sendKeys("test@email.com");
		System.out.println("Clicking on user email & sending keys as email address");
		
		driver.findElement(By.id("user_password")).sendKeys("tester");
		System.out.println("Clicking password & sending keys or typing password");
		
		driver.findElement(By.id("user_email")).clear();
		System.out.println("Clicking user email & clearing"); 
		
	    // Here, user name/password are not valid so nothing will happen!!
	
	}
	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}
}
