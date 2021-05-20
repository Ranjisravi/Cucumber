package stepsforpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginClass extends Baseclassforlogin 
{
	@Given("user on application landing page" )
	public void user_on_application_landing_page()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://studio.cucumber.io/users/sign_in");
	}
	
	@When("user enter username")
	public void userEnterUsername() {
		driver.findElement(By.id("user_email")).sendKeys("ranjisravi143@gmail.com");
	    //throw new io.cucumber.java.PendingException();
	}
	
	@When("user enter password")
	public void user_enter_password()
	{
		driver.findElement(By.id("user_password")).sendKeys("CucumberStudio");
	}
	
	@When("user click on login button")
	public void user_click_on_login_button()
	{
		driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[2]/input[2]")).click();
	}
	
	@Then("user navigates to application home page.")
	public void userNavigatesToApplicationHomePage() {
		driver.getTitle();
		System.out.println("Home page title displayed");
		throw new io.cucumber.java.PendingException();
	}
	
	@Then("user validate contents of home page")
	public void user_validate_contents_of_home_page()
	{
		System.out.println(driver.findElement(By.id("ember96")));
	}
	
	@After
	public void terminate()
	{
		driver.close();
	}

}
