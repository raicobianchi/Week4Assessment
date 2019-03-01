package com.qa.week4assessments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormFiller {

	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(xpath = "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[2]/td[2]/input")
	private WebElement password;
	
	@FindBy(xpath = "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[3]/td[2]/input")
	private WebElement confPass;
	
	@FindBy(xpath = "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[4]/td[2]/input")
	private WebElement fullName;
	
	@FindBy(xpath = "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[5]/td[2]/input")
	private WebElement email;
	
	@FindBy(id = "yui-gen1-button")
	private WebElement createUserButton;
	
	public void fillUserForm(String text, String text1, String text2, String text3, String text4) {
		username.sendKeys(text);
		password.sendKeys(text1);
		confPass.sendKeys(text2);
		fullName.sendKeys(text3);
		email.sendKeys(text4);
		createUserButton.submit();
		
		
		
}
}