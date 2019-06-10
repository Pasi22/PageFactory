package PageClasses;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class HomePage {
	
	WebDriver driver;

    @FindBy(xpath="//table//tr[@class='heading3']")

    WebElement homePageUserName;

    

    public HomePage(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }

    

    //Get the User name from Home Page

        public String getHomePageDashboardUserName(){

         return    homePageUserName.getText();

        }


}
