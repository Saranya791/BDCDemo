package bdcstepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DemoWebshop_Addtocart {
	WebDriver driver;
	@Given("launching the website")
	public void launching_the_website() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver=Driver.configureDriver("chrome");
		  driver.manage().window().maximize();
		  driver.get("http://demowebshop.tricentis.com/");
		  
	}

	@Given("User login with valid creds in demo webshop")
	public void user_login_with_valid_creds_in_demo_webshop() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		  driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("nanthini@gmail.com");
		  driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("nanthusaran@06");
	}

	@Then("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Given("User searches for the item")
	public void user_searches_for_the_item() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("laptop");
		//driver.findElement(By.xpath("//a[@id='ui-id-5']")).click();
		//Actions action=new Actions(driver);
		//WebElement cart=driver.findElement(By.xpath("//input[@id='myInput']"));
		//cart.sendKeys("l");cart.sendKeys("a");cart.sendKeys("p");cart.sendKeys("t");cart.sendKeys("o");cart.sendKeys("p");
		//Thread.sleep(3000); 
		//action.sendKeys(Keys.ARROW_DOWN).click();
		driver.findElement(By.xpath("//a[@href='/books']")).click();
		driver.findElement(By.xpath("//a[@href='/fiction']")).click();
		
		
		
	}

	@Given("clicks on add to cart")
	public void clicks_on_add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	}

	@Then("click on log out")
	public void click_on_log_out() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		
	}

	@Given("User searches for the other item")
	public void user_searches_for_the_other_item() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("camera");
		//driver.findElement(By.xpath("//a[@id='ui-id-4']")).click();
		//driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.findElement(By.xpath("//a[@href='/apparel-shoes']")).click();
		driver.findElement(By.xpath("//a[@href='/50s-rockabilly-polka-dot-top-jr-plus-size']")).click();
	}

	@Given("User clicks again on add to cart")
	public void user_clicks_again_on_add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	}

	@Then("User again logout the browser")
	public void user_again_logout_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
	}

}
