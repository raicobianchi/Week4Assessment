package com.qa.week4assessmenttests;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.week4assessments.FormFiller;
import com.qa.week4assessments.Password;
import com.qa.week4assessments.Username;

public class JenkinsTask2 {
	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://35.189.88.182:8080/");
	}

	@After
	public void teardown() {
		driver.quit();
	}

	@Test
	public void testUser1() throws InterruptedException {

		Username loginU = PageFactory.initElements(driver, Username.class);
		Password loginPass = PageFactory.initElements(driver, Password.class);
		loginU.inputUser("admin");
		loginPass.inputPass("admin");
		WebElement manageJenkins = driver.findElement(By.xpath("//*[@id=\"tasks\"]/div[4]/a[2]"));
		manageJenkins.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement manageUsers = driver.findElement(By.xpath("//*[@id=\"main-panel\"]/div[16]/a/dl/dt"));
		manageUsers.click();
		WebElement createUser = driver.findElement(By.xpath("//*[@id=\"tasks\"]/div[3]/a[2]"));
		createUser.click();
		FormFiller newuser = PageFactory.initElements(driver, FormFiller.class);
		newuser.fillUserForm("matthunt", "password", "password", "Matthew Hunt", "matthew.hunt@qa.com");
		WebElement userIde = driver.findElement(By.xpath("//*[@id=\"people\"]/tbody/tr[3]/td[2]/a"));
		assertEquals("", "matthunt", userIde.getText());
		

	}

	@Test

	public void testUser2() throws InterruptedException {
		Username loginU = PageFactory.initElements(driver, Username.class);
		Password loginPass = PageFactory.initElements(driver, Password.class);
		loginU.inputUser("admin");
		loginPass.inputPass("admin");
		WebElement manageJenkins = driver.findElement(By.xpath("//*[@id=\"tasks\"]/div[4]/a[2]"));
		manageJenkins.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement manageUsers = driver.findElement(By.xpath("//*[@id=\"main-panel\"]/div[16]/a/dl/dt"));
		manageUsers.click();
		WebElement createUser = driver.findElement(By.xpath("//*[@id=\"tasks\"]/div[3]/a[2]"));
		createUser.click();
		FormFiller newuser2 = PageFactory.initElements(driver, FormFiller.class);
		newuser2.fillUserForm("chrisp", "guest", "guest", "Christopher Perrins", "christopher.perrins@qa.com");
		WebElement userIde2 = driver.findElement(By.xpath("//*[@id=\"people\"]/tbody/tr[3]/td[2]/a"));
		assertEquals("", "chrisp", userIde2.getText());

	}

	@Test

	public void testUser3() throws InterruptedException {
		Username loginU = PageFactory.initElements(driver, Username.class);
		Password loginPass = PageFactory.initElements(driver, Password.class);
		loginU.inputUser("admin");
		loginPass.inputPass("admin");
		WebElement manageJenkins = driver.findElement(By.xpath("//*[@id=\"tasks\"]/div[4]/a[2]"));
		manageJenkins.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement manageUsers = driver.findElement(By.xpath("//*[@id=\"main-panel\"]/div[16]/a/dl/dt"));
		manageUsers.click();
		WebElement createUser = driver.findElement(By.xpath("//*[@id=\"tasks\"]/div[3]/a[2]"));
		createUser.click();
		FormFiller newuser3 = PageFactory.initElements(driver, FormFiller.class);
		newuser3.fillUserForm("chez", "secure", "secure", "Chester Gardener", "chester.gardiner@qa.com");
		WebElement userIde3 = driver.findElement(By.xpath("//*[@id=\"people\"]/tbody/tr[3]/td[2]/a"));
		assertEquals("", "chez", userIde3.getText());

		// Thread.sleep(5000);
	}

}