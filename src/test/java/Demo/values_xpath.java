package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class values_xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\SNS\\gr\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();

		String email = "//input[@id='philadelphia-field-email']";
		String valie = "Test's Data@gmail.com";

		try {

			driver.findElement(By.xpath(valie)).sendKeys(valie);

		} catch (IllegalArgumentException e) {
			driver.quit();

		}
	}

}
