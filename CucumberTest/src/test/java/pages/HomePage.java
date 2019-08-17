package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

By homePageUserName = By.cssSelector(".info-account");
  

    //Get the User name from Home Page

        public String getHomePageDashboardUserName(WebDriver driver){

         return    driver.findElement(homePageUserName).getText();

        }
}
