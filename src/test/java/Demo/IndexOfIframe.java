package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndexOfIframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\SNS\\gr\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		int size = driver.findElements(By.tagName("iframe")).size();

		try {
			for (int i = 0; i <= size; i++) {
				driver.switchTo().frame(i);
				int total = driver.findElements(By.xpath("html/body/a/img")).size();
				System.out.println(total);
				driver.switchTo().defaultContent();
			}
		} catch (NoSuchFrameException e) {
			driver.quit();

		}
	}

}
