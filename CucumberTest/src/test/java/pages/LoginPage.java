package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	By userName = By.id("email");
    By password = By.id("passwd");
    By loignbutton = By.id("SubmitLogin");
    
  //Set password in username textbox
    public void setUserName(WebDriver driver,String strUserName){
        driver.findElement(userName).sendKeys(strUserName);
    }

    //Set password in password textbox
   public void setPassword(WebDriver driver,String strPassword){
        driver.findElement(password).sendKeys(strPassword);
    }

    //Click on login button
    public void clickLogin(WebDriver driver){
            driver.findElement(loignbutton).click();
    }

    
    public void loginTo(WebDriver driver,String strUserName,String strPasword){

        //Fill user name
        this.setUserName(driver,strUserName);

        //Fill password
        this.setPassword(driver, strPasword);

        //Click Login button
        this.clickLogin(driver);        
    }

    

}
