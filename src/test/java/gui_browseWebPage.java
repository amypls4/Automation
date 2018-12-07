import dso.googleHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import settings.chromDriverSettings;
import org.junit.*;

import java.util.concurrent.TimeUnit;
public class gui_browseWebPage {
    /* public static void main(String[] args) {*/
   /*     WebDriver webDriver= chromDriverSettings.loadGoogleHomePage();*/
   /*     googleHomePage page= PageFactory.initElements(webDriver, googleHomePage.class);*/
   /*     page.search();*/
   /* }*/
   WebDriver webDriver;
   @Before
   public void setUp(){
         chromDriverSettings.initializeWebDriver();
         webDriver= chromDriverSettings.loadGoogleHomePage();
   }

   @Test
   public void loadGoogle(){
       googleHomePage page = PageFactory.initElements(webDriver,googleHomePage.class);
       page.search();
       webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   }

   @After
   public void closeBrowser(){
       webDriver.close();
   }


}
