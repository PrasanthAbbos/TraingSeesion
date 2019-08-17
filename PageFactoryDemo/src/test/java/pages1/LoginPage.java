package pages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(id = "email" ) WebElement userName;
	@FindBy(id = "passwd" ) WebElement password;
	@FindBy(id = "SubmitLogin" ) WebElement loignbutton;
/*	By userName = By.id("email");
    By password = By.id("passwd");
    By loignbutton = By.id("SubmitLogin");*/
	
	public LoginPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
    
  //Set password in username textbox
    public void setUserName(String strUserName){
       // driver.findElement(userName).sendKeys(strUserName);
    	userName.sendKeys(strUserName);
    }

    //Set password in password textbox
   public void setPassword(String strPassword){
        //driver.findElement(password).sendKeys(strPassword);
	   password.sendKeys(strPassword);
    }

    //Click on login button
    public void clickLogin(){
            //driver.findElement(loignbutton).click();
    	loignbutton.click();
    }

    
    public void loginTo(String strUserName,String strPasword){

        //Fill user name
        this.setUserName(strUserName);

        //Fill password
        this.setPassword(strPasword);

        //Click Login button
        this.clickLogin();        
    }

    

}
