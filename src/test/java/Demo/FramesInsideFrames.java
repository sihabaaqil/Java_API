package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesInsideFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\SNS\\gr\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total Frames --" + size);
		// prints the total number of frames
		try {
			driver.switchTo().frame(0); // Switching the Outer Frame
		} catch (InvalidSelectorException e) {
			driver.switchTo().frame(1);
			System.out.println("Working on catch as frame 1");
		}
		System.out.println(driver.findElement(By.xpath("xpath of the outer element ")).getText());
		// Printing the text in outer frame
		size = driver.findElements(By.tagName("iframe")).size();
		// prints the total number of frames inside outer frame
		System.out.println("Total Frames --" + size);
		driver.switchTo().frame(0); // Switching to innerframe
		System.out.println(driver.findElement(By.xpath("xpath of the inner element ")).getText());
		// Printing the text in inner frame
		driver.switchTo().defaultContent();
	}

	public int second_least(int number) {
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		int[] numbers = { 10, number };

		for (int num : numbers) {
			if (num < smallest) {
				secondSmallest = smallest;
				smallest = num;
			} else if (num < secondSmallest && num != smallest) {
				secondSmallest = num;
			}
		}
		return secondSmallest;
	}

}
