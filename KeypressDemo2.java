package actionsAndKeypressEvents;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

class KeypressDemo2 {
	private WebDriver driver;
	private String baseURL;

	@BeforeEach
	void setUp() throws Exception {
		driver= new InternetExplorerDriver();
		baseURL="https://letskodeit.teachable.com/p/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseURL);
	}

	@Test
	void test() {
		/*Here we are using three different ways to get 
		 * same functionality (using combination of keys on keyboard). 
		 */
		//first way:
		//driver.findElement(By.id("openwindow")).sendKeys(Keys.CONTROL + "a");
		//second way:
		//driver.findElement(By.id("openwindow")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
		//third way: using string 
		String selectAll=Keys.chord(Keys.CONTROL,"a");
		driver.findElement(By.id("openwindow")).sendKeys(selectAll);
		
		

	}

	@AfterEach
	void tearDown() throws Exception {
	}

}
