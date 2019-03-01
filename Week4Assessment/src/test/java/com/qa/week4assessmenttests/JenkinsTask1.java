package com.qa.week4assessmenttests;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.week4assessments.CreateFile;
import com.qa.week4assessments.Password;
import com.qa.week4assessments.Username;

public class JenkinsTask1 {
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
	@Test
	public void test1() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("http://35.189.88.182:8080/");
		Username loginU = PageFactory.initElements(driver, Username.class);
		Password loginPass = PageFactory.initElements(driver, Password.class);
		loginU.inputUser("admin");
		loginPass.inputPass("admin");
		WebElement newItem = driver.findElement(By.xpath(
				"//*[@id=\"tasks\"]/div[1]/a[2]"));
		newItem.click();
		Thread.sleep(2000); // put implicit wait
		CreateFile create = PageFactory.initElements(driver, CreateFile.class);
		create.newFile("week4assessment");
		Thread.sleep(2000); //echo above
		WebElement saveFile = driver.findElement(By.id(
				"yui-gen38-button"));
		saveFile.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		WebElement backToDash = driver.findElement(By.xpath(
				"//*[@id=\"tasks\"]/div[1]/a[2]"));
		backToDash.click();
		WebElement fileCheck = driver.findElement(By.xpath(
				"//*[@id=\"job_week4assessment\"]/td[3]/a"));
		assertEquals("", "week4assessment", fileCheck.getText());
		Thread.sleep(3000);
	}
	
		
		
	}
	
	



