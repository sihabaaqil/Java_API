package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame_ID {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\SNS\\gr\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		// navigates to the page consisting an iframe
		driver.manage().window().maximize();
		driver.switchTo().frame("a077aa5e"); // switching the frame by ID
		System.out.println("********We are switch to the iframe*******");
		driver.findElement(By.xpath("html/body/a/img")).click();
		// Clicks the iframe
		System.out.println("*********We are done***************");
		driver.close();
		System.out.println("*********Tabs closed***************");
		driver.quit();
	}

}
