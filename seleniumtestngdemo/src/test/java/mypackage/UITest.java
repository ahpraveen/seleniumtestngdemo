package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This test is executed from maven for which details related to testng sutie is
 * configured in pom.xml
 * 
 * @author SP
 *
 */
public class UITest {
	/**
	 * Test using chrome browser
	 */

	@Test(groups = "chrome")
	public void test_chrome() {
		System.out.println("demo test in chrome");
		System.out.println(Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.apple.com");
		Assert.assertEquals(driver.getTitle(), "Apple");
		driver.close();
	}
}
