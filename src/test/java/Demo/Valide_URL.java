package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.time.Duration;

public class Valide_URL {

    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver",
//                "C:\\Users\\user\\eclipse-workspace\\SNS\\gr\\src\\main\\resources\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.setBinary("/bin/google-chrome-stable");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // WebDriverManager.chromedriver().setup();
       // ChromeDriver driver = new ChromeDriver();
        driver.get("http://autopract.com/selenium/alert5/");
        driver.manage().window().maximize();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "http://autopract.com/selenium/alert5/");
        System.out.println("Done");
        driver.quit();
    }

}
