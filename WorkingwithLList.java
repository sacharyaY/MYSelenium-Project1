package mySeleniumPractise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithLList {
	WebDriver driver;
	String baseURL;

	@BeforeEach
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "https://letskodeit.teachable.com/p/practice";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseURL);

	}

	@Test
	public void testListOfElements() throws InterruptedException {
		boolean isChecked = false;
		List<WebElement> radioBtnList = driver
				.findElements(By.xpath("//input[contains(@type,'radio')and contains(@name,'cars')] "));
		int size = radioBtnList.size();
		System.out.println("Size of list or total radio btn = " + size);

		for (int i = 0; i < size; i++) {
			isChecked = radioBtnList.get(i).isSelected();

			if (!isChecked) {
				radioBtnList.get(i).click();
				Thread.sleep(2000);
			}

		}
	}

	@AfterEach
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
