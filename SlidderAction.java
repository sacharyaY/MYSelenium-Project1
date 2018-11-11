package actionsAndKeypressEvents;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class SlidderAction {
	private WebDriver driver;
	private String baseURL;

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "https://jqueryui.com/slider/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseURL);
	}
	@Test
	void test() throws InterruptedException {
		driver.switchTo().frame(0);
		Thread.sleep(2000);

		// Using actions class
		WebElement element = driver.findElement(By.xpath("//div[@id='slider']/span"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(element, 150, 0).perform();

	}

	@AfterEach
	void tearDown() throws Exception {
	Thread.sleep(0);
	driver.quit();
	}
}
