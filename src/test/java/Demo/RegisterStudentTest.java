package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class RegisterStudentTest {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	public static final String URL = "https://demoqa.com/automation-practice-form";
	public static final String Path_TestData = "C:\\Users\\user\\eclipse-workspace\\SNS\\gr\\Input_Output\\Test_Data\\";// "E:\\Projects\\src\\testData\\";
	public static final String File_TestData = "TestData.xls";

	static ExcelUtils excelUtils = new ExcelUtils();

	// using the Constants class values for excel file path
	static String excelFilePath = Path_TestData + File_TestData; // Constants.Path_TestData + Constants.File_TestData;

	public static void main(String args[]) throws IOException {
		// set the Chrome Driver path
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\SNS\\gr\\src\\main\\resources\\chromedriver.exe");
		// Creating an object of ChromeDriver
		WebDriver driver = new ChromeDriver();

		// launching the specified URL
		driver.get("https://demoqa.com/automation-practice-form");

		// Identify the WebElements for the student registration form
		WebElement firstName = driver.findElement(By.id("firstName"));
		WebElement lastName = driver.findElement(By.id("lastName"));
		WebElement email = driver.findElement(By.id("userEmail"));
		WebElement genderMale = driver.findElement(By.id("gender-radio-1"));
		WebElement mobile = driver.findElement(By.id("userNumber"));
		WebElement address = driver.findElement(By.id("currentAddress"));
		WebElement submitBtn = driver.findElement(By.id("submit"));

		// calling the ExcelUtils class method to initialise the workbook and sheet
		excelUtils.setExcelFile(excelFilePath, "STUDENT_DATA");

		// iterate over all the row to print the data present in each cell.
		for (int i = 1; i <= excelUtils.getRowCountInSheet(); i++) {
			// Enter the values read from Excel in firstname,lastname,mobile,email,address
			firstName.sendKeys(excelUtils.getCellData(i, 0));
			lastName.sendKeys(excelUtils.getCellData(i, 1));
			email.sendKeys(excelUtils.getCellData(i, 2));
			mobile.sendKeys(excelUtils.getCellData(i, 3));
			address.sendKeys(excelUtils.getCellData(i, 4));

			// Click on the gender radio button using javascript
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", genderMale);

			// Click on submit button
			submitBtn.click();

			// Verify the confirmation message
			WebElement confirmationMessage = driver
					.findElement(By.xpath("//div[text()='Thanks for submitting the form']"));

			// check if confirmation message is displayed
			if (confirmationMessage.isDisplayed()) {
				// if the message is displayed , write PASS in the excel sheet using the method
				// of ExcelUtils
				excelUtils.setCellValue(i, 6, "PASS", excelFilePath);
			} else {
				// if the message is not displayed , write FAIL in the excel sheet using the
				// method of ExcelUtils
				excelUtils.setCellValue(i, 6, "FAIL", excelFilePath);
			}

			// close the confirmation popup
			WebElement closebtn = driver.findElement(By.id("closeLargeModal"));
			closebtn.click();

			// wait for page to come back to registration page after close button is clicked
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		}
		// closing the driver
		driver.quit();
	}

}
