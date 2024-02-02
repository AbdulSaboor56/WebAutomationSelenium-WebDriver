package signintoBRAVO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BravoLaunch {
    protected WebDriver driver;

  public void launchBrowserAndLogin() {
    // Load environment variables
    String email = System.getenv("email");
    String password = System.getenv("password");

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Coeus\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
       ChromeOptions options = new ChromeOptions();
       options.addArguments("--headless");
        driver = new ChromeDriver(options);
//         driver = new ChromeDriver();
        
           driver.manage().window().maximize();
  
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(email, password);
    }
}