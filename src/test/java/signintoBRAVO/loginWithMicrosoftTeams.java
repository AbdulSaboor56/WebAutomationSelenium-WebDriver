package signintoBRAVO;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginWithMicrosoftTeams {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Coeus\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

    // Navigate to the page with 'Log in with Google' button
        
            driver.get("https://app.workhub.ai/admin/login");

            // Locate and click the 'Log in with Google' button
           WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement googleLoginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/a[1]")));
            googleLoginButton.click();
            
          driver.get("https://accounts.google.com/o/oauth2/auth/identifier?state=cDMzVjdkNHF6Lyt0d0RVK0ZxRGVKcklrN3lQUWtyOURKdm1qZHhrSmRhZXFmK1RLVVhnYk1BMDY4TGh1Wmw4Qw&client_id=861081059561-vg7o7ft7hk6dk0s6hk1hreocrpc5g2eg.apps.googleusercontent.com&redirect_uri=https%3A%2F%2Flogin.workhub.ai%2Foauth2%2Fv1%2Fauthorize%2Fcallback&response_type=code&prompt=login&display=popup&scope=email%20openid%20profile&service=lso&o2v=1&theme=glif&flowName=GeneralOAuthFlow");

          WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
          WebElement googleLoginButton1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='identifierId']")));
          googleLoginButton1.sendKeys("saboor975");
          
          driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
         
          ChromeOptions chromeOptions = new ChromeOptions();
          chromeOptions.addArguments("--disable-web-security", "--user-data-dir", "--allow-running-insecure-content");
         
          //driver.get("https://accounts.google.com/o/oauth2/auth/identifier?state=cDMzVjdkNHF6Lyt0d0RVK0ZxRGVKcklrN3lQUWtyOURKdm1qZHhrSmRhZXFmK1RLVVhnYk1BMDY4TGh1Wmw4Qw&client_id=861081059561-vg7o7ft7hk6dk0s6hk1hreocrpc5g2eg.apps.googleusercontent.com&redirect_uri=https%3A%2F%2Flogin.workhub.ai%2Foauth2%2Fv1%2Fauthorize%2Fcallback&response_type=code&prompt=login&display=popup&scope=email%20openid%20profile&service=lso&o2v=1&theme=glif&flowName=GeneralOAuthFlow");
       
   
//     WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
//          WebElement googleLoginButton2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")));
//          googleLoginButton2.sendKeys("saboorgms9200");
//          
//            // Switch back to the default content after interacting with elements inside the iframe
//            driver.switchTo().defaultContent();

    }
 }
