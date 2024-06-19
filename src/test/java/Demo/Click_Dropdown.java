package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Dropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\SNS\\gr\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com");
		//driver.findElement(By.id("button1")).click();
		//// img[contains(@alt,'software testing tutorial')]
		driver.findElement(By.xpath("//img[contains(@alt,'software testing tutorial')]")).click();

		driver.quit();
		System.out.println("Completed");

	}

}
