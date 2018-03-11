package browser_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class browserTest {

	WebDriver driver;

	@Test
	public void gettest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tarun\\workspace\\SamleTest2_4_2018\\lib\\chromedriver1.exe");
		driver=new ChromeDriver();
		
		driver.get("http://www.flipkart.com");
		
		System.out.println("sample1");
	}
	
}
