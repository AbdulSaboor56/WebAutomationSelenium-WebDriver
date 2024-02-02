package signintoBRAVO;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ColleagueRecognitionPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    public ColleagueRecognitionPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void recognizeAndTagColleague(String colleagueName, String points, String corporateValue, String toMakePostAIGenerated) {
        clickElement(By.xpath("//body/div[1]/main[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[2]/div[1]/timeline[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]/i[1]"));
        sendKeysToElement(By.xpath("//input[@placeholder='Who are you recognizing? Add as many people as you want.']"), colleagueName);
        clickElement(By.xpath("//li[@class='suggestion-item ng-scope selected']"));
        sendKeysToElement(By.xpath("//input[@name='bravosInput']"), points);
        sendKeysToElement(By.xpath("//input[@placeholder='What behavior or company value would you like to highlight?']"), corporateValue);
        clickElement(By.xpath("//li[@class='suggestion-item ng-scope selected']"));
        clickElement(By.xpath("//input[@name='bravosInput']"));
        clickElement(By.xpath("//button[@ng-show='sourceData.modalSource !== SOURCE_BRAVO_ASSIST']"));
        sendKeysToElement(By.xpath("//textarea[@placeholder='What would you like to say?']"), toMakePostAIGenerated );
        clickElement(By.xpath("//button[contains(@class, 'btn-secondary') and contains(@class, 'ng-binding') and contains(@class, 'ng-scope') and normalize-space(.)='Make Formal']"));
        waitForSeconds(10);
        clickElement(By.xpath("//*[@id=\"new_post_modal\"]/div[2]/div[2]/button[1]"));
        waitForSeconds(10);
        clickElement(By.xpath("//button[contains(text(),'Post')]"));
        waitForSeconds(3);
    }

    private void clickElement(By locator) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.click();
        waitForSeconds(1);
    }

    private void sendKeysToElement(By locator, String keys) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.sendKeys(keys);
        waitForSeconds(1);
    }
    
    private void waitForSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000); // Convert seconds to milliseconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
	public WebDriver getDriver() {
		return driver;
	}
}
