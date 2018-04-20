package testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_004 {

	@Test
	public void testcase1() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://localhost:9000");
		driver.findElementById("username").sendKeys("hello");
		driver.findElementById("password").sendKeys("hello!");
		driver.findElementById("code").sendKeys("tPYBm");
		driver.quit();
	}
}
