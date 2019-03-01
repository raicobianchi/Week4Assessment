package com.qa.week4assessmenttests;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JenkinsTask3Step {
WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void teardown() {
		driver.quit();
	}
	@Given("^the correct web address$")
	public void the_correct_web_address() throws Throwable {

		driver.manage().window().maximize();
		driver.get("http://35.189.88.182:8080/");
		WebElement users = driver.findElement(By.xpath("//*[@id=\"people\"]/tbody/tr[3]/td[2]/a"));
		assertEquals("", "chez", users.getText());
	} 

	@When("^I navigate to the 'Menu' page$")
	public void i_navigate_to_the_Menu_page() throws Throwable {
		WebElement userChris = driver.findElement(By.xpath("//*[@id=\"people\"]/tbody/tr[4]/td[2]/a"));
		userChris.click();
		WebElement configure = driver.findElement(By.xpath("//*[@id=\"tasks\"]/div[4]/a[2]"));
		configure.click();
		WebElement fullNameBar = driver.findElement(By.xpath("//*[@id=\"main-panel\"]/form/table/tbody/tr[1]/td[3]/input"));
		fullNameBar.sendKeys("ChrisPy");
		WebElement update = driver.findElement(By.id("yui-gen2-button"));
		update.submit();
	}

	@Then("^I can browse a list of the available products\\.$")
	public void i_can_browse_a_list_of_the_available_products() throws Throwable {
		WebElement update = driver.findElement(By.xpath("//*[@id=\"main-panel\"]/h1"));
		assertEquals("", "ChrisPy", update.isDisplayed());	}

	@When("^I click the checkout button$")
	public void i_click_the_checkout_button() throws Throwable {
		
	}

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page() throws Throwable {
		
	}


	
}
