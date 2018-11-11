package actionsAndKeypressEvents;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class KeypressDemo3 {
	private WebDriver driver;
	private String baseURL;

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "https://letskodeit.teachable.com/p/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseURL);
	}
	/* We are using actions class to do Key pressing events/here we
	 *  don't have to find any element.
	 */

	@Test
	void test() throws InterruptedException {
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

	}

	@AfterEach
	void tearDown() throws Exception {
	}

}
