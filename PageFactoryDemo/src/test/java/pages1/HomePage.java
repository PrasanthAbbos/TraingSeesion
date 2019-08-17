package pages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	//@FindBy (cssSelector = ".info-account" ) WebElement homePageUserName;
	@FindBy (xpath = "//*[@id='center_column']/p" ) WebElement homePageUserName;
	
//By homePageUserName = By.cssSelector(".info-account");
  

    //Get the User name from Home Page
	public HomePage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

        public String getHomePageDashboardUserName(){

        // return    driver.findElement(homePageUserName).getText();
        	return homePageUserName.getText();
        }
}
