package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





import pages.HomePage;
import pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition {
	
	WebDriver driver;
	
	HomePage obj = new HomePage();
	LoginPage obj1 = new LoginPage();
	
	@Given("^Launch the url$")
	public void launch_the_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\praskaru\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
	}

	@When("^Go to the login page$")
	public void go_to_the_login_page() throws Throwable {
	    driver.findElement(By.linkText("Sign in")).click();
	}

	@When("^Enter the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void enter_the_username_as_and_pasword_as(String arg1, String arg2) throws Throwable {
		/*driver.findElement(By.id("email")).sendKeys(arg1);
        driver.findElement(By.id("passwd")).sendKeys(arg2);
        driver.findElement(By.id("SubmitLogin")).click();*/ 
		
		obj1.loginTo(driver, arg1, arg2);
	}

	@Then("^Verify successful login$")
	public void verify_successful_login() throws Throwable {
		String exp_message = "Welcome to your account. Here you can manage all of your personal information and orders.";
    	//String actual = driver.findElement(By.cssSelector(".info-account")).getText();
		String actual = obj.getHomePageDashboardUserName(driver);
    	System.out.println(actual);
        Assert.assertEquals(exp_message, actual);
        driver.quit();
	}

}
