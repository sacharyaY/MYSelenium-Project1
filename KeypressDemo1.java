package actionsAndKeypressEvents;

import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class KeypressDemo1 {
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

	@Test
	void test() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='navbar-link fedora-navbar-link']")).click();
		driver.findElement(By.id("user_email")).sendKeys("tester@gmail");
		driver.findElement(By.id("user_password")).sendKeys("test");
		Thread.sleep(2000);
		//Using key in keyboard(ENTER) to click enter.
		driver.findElement(By.name("commit")).sendKeys(Keys.ENTER);
		

	}

	@AfterEach
	void tearDown() throws Exception {
	}

}
