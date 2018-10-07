package mySeleniumPractise;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddenelements {
	WebDriver driver;
	String baseURL1;
	String baseURL2;

	@BeforeEach
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL1 = "https://letskodeit.teachable.com/p/practice";
		baseURL2 = "https://www.expedia.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test
	public void testLetsKodeIt() throws InterruptedException {
		driver.get(baseURL1);
		WebElement textBox = driver.findElement(By.id("displayed-text"));
		System.out.println("Text Box Displayed: " + textBox.isDisplayed());

		Thread.sleep(3000);

		WebElement hideBtn = driver.findElement(By.id("hide-textbox"));
		hideBtn.click();
		System.out.println("Clicked on Hide button");
		System.out.println("Text Box Displayed: " + textBox.isDisplayed());

		Thread.sleep(3000);

		WebElement showBtn = driver.findElement(By.id("show-textbox"));
		showBtn.click();
		System.out.println("Clicked on Show button");
		System.out.println("Text Box Displayed: " + textBox.isDisplayed());

	}

	//@Test
	//public void testExpedia() {
	//	driver.get(baseURL2);
		//WebElement childDrpdown=driver.findElement(By.id(""));
		//System.out.println("Child Drop down Displayed: "+ childDrpdown.isDisplayed());
		//} Expedia has changed a lot than this!!

	@AfterEach
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
