package mySeleniumPractise;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitIntro {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Executed before anything in this class...");
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Executed after anything in this class...");
	}
	
	@BeforeEach
	public void setUp() throws Exception {
		System.out.println("Executed before every test in this class...");
	}

	@AfterEach
	public void tearDown() throws Exception {
		System.out.println("Executed after every test in this class...");
	}
 
	@Test
	void test1() {
		System.out.println("Test1  executed....");
	}
	void test2() {
		System.out.println("Test2  executed....");
	}
	
	
	

}
