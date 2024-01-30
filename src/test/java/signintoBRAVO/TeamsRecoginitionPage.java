package signintoBRAVO;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TeamsRecoginitionPage  {
	private final WebDriver driver;
	private final WebDriverWait wait;

	public TeamsRecoginitionPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
}
	
	public void recognizeAndTagColleague(String teamName, String points, String corporateValue)
			throws InterruptedException {
		WebElement recognizeColleague = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//body/div[1]/main[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[2]/div[1]/timeline[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]/i[1]")));
		recognizeColleague.click();
}
}