package signintoBRAVO;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataofAllTestRun extends BravoLaunch {
    
    @BeforeClass
    public void launchBrowserAndLoginOnce() {
        launchBrowserAndLogin();
    }

    @AfterClass
    public void closeBrowserOnce() {
      //closeBrowserOnce();
    }

    @Test
    public void recognizeColleague() throws InterruptedException {
        ColleagueRecognitionPage colleagueRecognitionPage = new ColleagueRecognitionPage(driver);
        colleagueRecognitionPage.recognizeAndTagColleague("Ehsan", "2", "teamwork", "I don't want to say Anything");
    } 

    @Test
    public void tagColleagues() throws InterruptedException {
        SimplePost simplePost = new SimplePost(driver);
        simplePost.tagColleaguesByPost("I'm Just Automating how to Post", "Testing");
    }
}
