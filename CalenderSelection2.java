package mySeleniumPractise;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class CalenderSelection2 {

	/*
	 * This scripts will use different approach to select date element from DOM than
	 * earlier method.
	 */
	WebDriver driver;
	String baseURL;

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "https://www.expedia.com/";

		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	void test() throws Exception {
		driver.get(baseURL);

		// Finding flight tab & click on it.
		driver.findElement(By.id("tab-flight-tab-hp")).click();
		Thread.sleep(3000);

		// Finding departure element and click on it.
		WebElement departureField = driver.findElement(By.xpath("//input[@id='flight-departing-hp-flight']"));
		departureField.click();

		/*
		 * Finding the whole calendar element & from there selecting date (This approach
		 * can be useful to create generic method)
		 */
		WebElement calMonth = driver.findElement(By.xpath("(//div[@class = 'datepicker-cal-month'])[1]"));

		List <WebElement> allvalidDates = calMonth.findElements(By.tagName("button"));
		Thread.sleep(3000);

		for (WebElement date : allvalidDates) {
			if (date.getText().contains("10")) {
				date.click();
				break;
			}
		}
	}

	@AfterEach
	void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
