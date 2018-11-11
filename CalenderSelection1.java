package mySeleniumPractise;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class CalenderSelection1 {
	WebDriver driver;
	String baseURL;

	@BeforeEach
	void setUp() throws Exception {
		driver=new ChromeDriver();
		baseURL="https://www.expedia.com/";
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	void test() throws InterruptedException {
		driver.get(baseURL);
		
		// Finding flight tab & click on it.
		driver.findElement(By.id("tab-flight-tab-hp")).click();
		Thread.sleep(3000);
		
		// Finding departure element and click on it.
		WebElement departureField= driver.findElement(By.xpath("//input[@id='flight-departing-hp-flight']"));
		departureField.click();
		
		// Finding date (of choice) element & Clicking it.
		WebElement dateElement=driver.findElement(By.cssSelector(".datepicker-cal .datepicker-cal-month:nth-child(4) tr:nth-of-type(2) .notranslate:nth-of-type(5) [type]"));
		dateElement.click();
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	
}
