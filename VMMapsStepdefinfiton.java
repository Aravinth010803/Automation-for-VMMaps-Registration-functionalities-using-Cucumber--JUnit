package ogr.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VMMapsStepdefinfiton {
	WebDriver driver;
	@Given("user Launch the VMmaps web application")
	public void userLaunchTheVMmapsWebApplication() {
		driver.get("https://accounts.vmmaps.com/");
	    driver.manage().window().maximize();

	}

	@When("user click on Sign Up link")
	public void userClickOnSignUpLink() {
	   driver.findElement(By.className("Sign-Up-Pop")).click();
	}

	@Then("Sign Up page should be diaplayed")
	public void signUpPageShouldBeDiaplayed() {
	    System.out.println("Sign up page should be displayed");
	}

	@When("user enter valid full name, valid Email Address,valid Mobile number, valid password and valid confirm password")
	public void userEnterValidFullNameValidEmailAddressValidMobileNumberValidPasswordAndValidConfirmPassword() {
	    driver.findElement(By.id("signup-username")).sendKeys("Aravinth K");
	    driver.findElement(By.id("signup-email")).sendKeys("akaravinthkrish07@gmail.com");
	    driver.findElement(By.id("signup-mobile")).sendKeys("9344414647");
	    driver.findElement(By.id("signup-password")).sendKeys("Aravinth@123");
	    driver.findElement(By.id("signup-confirmPassword")).sendKeys("Aravinth@123");
	}

	@When("click on two cheak box and click on Register here link")
	public void clickOnTwoCheakBoxAndClickOnRegisterHereLink() {
	   driver.findElement(By.id("terms-vms-policy")).click();
	   driver.findElement(By.id("newsLetter")).click();
	}

	@Then("user able two view the Email id page and enter valid OTP")
	public void userAbleTwoViewTheEmailIdPageAndEnterValidOTP() {
	   System.out.println("EmailId OTP page should be displayed and enter OTP");
	}
	

	@Then("user able to view the home page")
	public void userAbleToViewTheHomePage() {
	    System.out.println("Home page should be displayed");
	}

	@When("user enter valid full name, Invalid Email Address,valid Mobile number, valid password and valid confirm password")
	public void userEnterValidFullNameInvalidEmailAddressValidMobileNumberValidPasswordAndValidConfirmPassword() {
		driver.findElement(By.id("signup-username")).sendKeys("Aravinth K");
	    driver.findElement(By.id("signup-email")).sendKeys("akaravinthkrish07@gmail.com");
	    driver.findElement(By.id("signup-mobile")).sendKeys("9344414647");
	    driver.findElement(By.id("signup-password")).sendKeys("Aravinth@123");
	    driver.findElement(By.id("signup-confirmPassword")).sendKeys("Aravinth@123");
	}

	@Then("user able two view the Email id page")
	public void userAbleTwoViewTheEmailIdPage() {
	    System.out.println("EmailId page should be diaplayed ");
	}

	@Then("user unable to getting for OTP")
	public void userUnableToGettingForOTP() {
	    System.out.println("user not getting for OTP");
	}

	

}
