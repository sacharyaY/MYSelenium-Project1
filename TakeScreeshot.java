package mySeleniumPractise;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class TakeScreeshot {
	private WebDriver driver;
	private String baseURL;
	

	@BeforeEach
	void setUp() throws Exception {
		driver= new ChromeDriver();
		baseURL="https://www.expedia.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	void testScreenshots() {
		driver.get(baseURL);
		driver.findElement(By.id("tab-flight-tab-hp")).click();
		
		//Find Elements
		WebElement flightOrgin=driver.findElement(By.xpath("//input[@id='flight-origin-hp-flight']"));
		WebElement flightDestination=driver.findElement(By.xpath("//input[@id='flight-destination-hp-flight']"));
		//WebElement departureDate=driver.findElement(By.xpath("//input[@id='flight-departing-hp-flight']"));
		//WebElement returnDate=driver.findElement(By.xpath("//input[@id='flight-returning-hp-flight']"));
		WebElement search=driver.findElement(By.xpath("//form[@id='gcw-flights-form-hp-flight']//button[@type='submit']"));
		
		//Send data to elements
		flightOrgin.sendKeys("New York");
		//departureDate.sendKeys("10/13/2018");
		//returnDate.clear();
		//returnDate.sendKeys("10/13/2018");
		flightDestination.sendKeys("New york");
		search.click();
	}
	
	public static String getRandomString(int length) {
		StringBuilder sb=new StringBuilder();
		String characters="abcdefgijklmnopqrstuvwxyzABCDEFGIJKLMNOPQRSTUVWXYZ1234567890";
		for(int i=0; i<length; i++) {
			int index=(int) Math.random()*characters.length();
			sb.append(characters.charAt(index));
		}
		return sb.toString();
	}

	@AfterEach
	void tearDown() throws Exception {
		String fileName=getRandomString(10) + ".png";
		String directory ="C:\\Users\\HARI\\Desktop\\";
		File sourceFile=((TakesScreenshot)driver). getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory+ fileName));
	}

	

}
