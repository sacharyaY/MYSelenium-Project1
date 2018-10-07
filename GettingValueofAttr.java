package mySeleniumPractise;

import java.util.concurrent.TimeUnit;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class GettingValueofAttr {
	WebDriver driver;
	String baseURL;

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL="https://letskodeit.teachable.com/p/practice";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	void testGettingValue() {
		driver.get(baseURL);
		
		WebElement element =driver.findElement(By.id("name"));
		String attrValue=element.getAttribute("class");
		
		System.out.println("Value of attribute is  :" + attrValue);
	}

	@AfterEach
	void tearDown() throws Exception {
		Thread.sleep(2000);
	}

	

}
