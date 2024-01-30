package signintoBRAVO;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimplePost {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public SimplePost(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void tagColleaguesByPost(String typePost, String titleOfGIF) {
        clickElement(By.xpath("//div[@id='user-post-editor-timeline']"));
        clickElement(By.xpath("//i[@class='fa fa-user recipient']"));
        clickElement(By.xpath("//div[@id='at-view-64']"));
        sendKeysToElement(By.xpath("//div[@id='user-post-editor-timeline']"), typePost);
        clickElement(By.xpath("//giphy-box[@select-giphy='selectGiphy']"));
        sendKeysToElement(By.xpath("//body/div[1]/main[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[2]/div[1]/timeline[1]/div[1]/div[3]/div[2]/div[2]/ul[1]/li[1]/giphy-box[1]/ul[1]/li[1]/input[1]"), titleOfGIF);
        clickElement(By.xpath("//body/div[1]/main[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[2]/div[1]/timeline[1]/div[1]/div[3]/div[2]/div[2]/ul[1]/li[1]/giphy-box[1]/ul[1]/div[1]/a[1]/img[1]"));
        clickElement(By.xpath("//button[contains(text(),'Post')]"));
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
    
    private void waitForSeconds(double seconds) {
        try {
            Thread.sleep((long) (seconds * 1000)); // Convert seconds to milliseconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    
    public WebDriver getDriver() {
        return driver;
    }
}
