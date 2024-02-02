
package signintoBRAVO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BravoLaunch {
    protected WebDriver driver;

  public void launchBrowserAndLogin() {
    // Load environment variables
    String email = System.getenv("email");
    String password = System.getenv("password");


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Coeus\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        
         driver.get("https://app.workhub.ai/admin/login");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(email, password);
    }
}
  
 

