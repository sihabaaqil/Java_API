package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exception_Selenium {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\user\\eclipse-workspace\\SNS\\gr\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://artoftesting.com");
        try {
            driver.findElement(By.id("button1")).click();
        } catch (Exception e3) {
            driver.findElement(By.xpath("//img[contains(@alt,'software testing tutorial')]")).click();
        } finally {
            driver.quit();
            System.out.println("Completed");
        }

    }

}
