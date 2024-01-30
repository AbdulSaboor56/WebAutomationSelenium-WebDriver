package signintoBRAVO;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class testingClass {

	WebDriver driver;

	@Test
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Coeus\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.workhub.ai/admin/login");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement emailInput = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
		emailInput.sendKeys("seaz975@gmail.com");

		WebElement passwordInput = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));
		passwordInput.sendKeys("Admin1@3");

		WebElement loginButton = driver.findElement(By.xpath(
				"//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]"));
		loginButton.click();

		WebElement recognizeColleague = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//body/div[1]/main[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[2]/div[1]/timeline[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]/i[1]")));
		recognizeColleague.click();

		WebElement tagCollegue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//body/div[6]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/tags-input[1]/div[1]/div[1]/input[1]")));
		tagCollegue.sendKeys("Ehsan");

		WebElement confirmTagCollegue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//body/div[6]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/tags-input[1]/div[1]/auto-complete[1]/div[1]")));
		confirmTagCollegue.click();

		WebElement bravoPoints = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//body/div[6]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]")));
		bravoPoints.sendKeys("2");

		WebElement selectCopetateValue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//body/div[6]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/tags-input[1]/div[1]/div[1]/input[1]")));
		selectCopetateValue.sendKeys("TeamWork");

		WebElement selectCopetateValue1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//body/div[6]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/tags-input[1]/div[1]/auto-complete[1]/div[1]")));
		selectCopetateValue1.click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[6]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]"))
				.click();
		
		driver.findElement(By.xpath("//body/div[6]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[5]/button[2]")).click();
		driver.findElement(By.xpath("//body/div[6]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/textarea[1]")).sendKeys("I dont want to say Anything");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//body/div[6]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//body/div[6]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/button[1]")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Post')]")).click();
		Thread.sleep(5000);
		
	}
}
