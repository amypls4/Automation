package dso;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class googleHomePage {

    @FindBy(how = How.XPATH, using ="//a[contains(text(),'Gmail')]" )
    private WebElement gmailLink;

    @FindBy(how = How.NAME, using = "q")
    private WebElement searchBar;

    @FindBy(how = How.XPATH, using = "//input[@value = 'Google Search']")
    private WebElement searchButton;

    public void clickOngmailLink(){
        gmailLink.click();
    }
    public void clickSearchButton(){

    }


    public void search(){
        searchBar.sendKeys("test");
        searchBar.sendKeys(Keys.RETURN);
    }


}
