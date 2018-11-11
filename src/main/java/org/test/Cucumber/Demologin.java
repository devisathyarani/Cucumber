package org.test.Cucumber;




import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class Demologin {
 static WebDriver driver;
@Given("The user is in guru login page")
public void the_user_is_in_guru_login_page() {
   System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\selenium9\\Cucumber\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/V1/index.php");
}

@When("The user enters valid username and submit")
public void the_user_enters_valid_username_and_submit() {
	driver.findElement(By.name("uid")).sendKeys("mngr162602");
	driver.findElement(By.name("password")).sendKeys("yzudyvy");
   
}

@When("The user clicks the  submit button")
public void the_user_clicks_the_submit_button() {
	driver.findElement(By.name("btnLogin")).click();
   
}

@Then("The user should be in managers home page")
public void the_user_should_be_in_managers_home_page() {

	Assert.assertTrue(driver.getCurrentUrl().contains("Managerhomepage"));
    
}

@Given("The user Select New Customer option")
public void the_user_Select_New_Customer_option() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//a[text()='New Customer']")).click();
	//Actions acc=new Actions(driver);
	//acc.moveToElement(customer).click();
   
}

@When("The user Should enters all manatory fields")
public void the_user_Should_enters_all_manatory_fields(DataTable table) {
  
	Map<String,String> Map=table.asMap(String.class,String.class);
	driver.findElement(By.name("name")).sendKeys(Map.get("Customer name"));
	driver.findElement(By.xpath("(//input[@name='rad1'])[2]")).sendKeys(Map.get("Gender"));
	driver.findElement(By.id("dob")).sendKeys(Map.get("D.O.B"));
	driver.findElement(By.name("addr")).sendKeys(Map.get("Address"));
	driver.findElement(By.name("city")).sendKeys(Map.get("City"));
	driver.findElement(By.name("state")).sendKeys(Map.get("State"));
	driver.findElement(By.name("pinno")).sendKeys(Map.get("Pin"));
	driver.findElement(By.name("telephoneno")).sendKeys(Map.get("Telephono no"));
	driver.findElement(By.name("emailid")).sendKeys(Map.get("E-mail"));
	//driver.findElement(By.name("password")).sendKeys(Map.get("Password"));
		
}

@When("The user click submit button")
public void the_user_click_submit_button() {
	driver.findElement(By.xpath("//input[@name='sub']")).click();
    
}

@Then("The user should be done Registeration successfully")
public void the_user_should_be_done_Registeration_successfully() {
   
}

}
