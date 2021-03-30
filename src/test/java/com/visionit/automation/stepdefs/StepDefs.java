package com.visionit.automation.stepdefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefs {

	WebDriver driver;
    String LandingPgaeURL = "http://automationpractice.com/index.php";
    int implicit_wait_timeout_in_sec = 20;
    String TitleofLandingpage="My Store";

    
    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(implicit_wait_timeout_in_sec, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/");
    }
	
	
	  @Given("User login to base url")
	  
	  @Deprecated 
	  public void user_login_to_base_url()
	  { 
		  
	   }
	 


	@Given("check the title of home page")
	public void check_the_title_of_home_page() {
		String TitleHomepage=driver.getTitle();
		   System.out.println(TitleHomepage);
	}
	@Then("check user successfully navigate to LandingPage url")
	public void check_user_successfully_navigate_to_landing_page_url() {
		Assert.assertEquals("URL redirection is fail",LandingPgaeURL , driver.getCurrentUrl());
		System.out.println("successfully  redirected");
	}



	
}
