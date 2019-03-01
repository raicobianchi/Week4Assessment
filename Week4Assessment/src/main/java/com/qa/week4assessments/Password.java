package com.qa.week4assessments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Password {
	@FindBy(xpath = "/html/body/div/div/form/div[2]/input")
	private WebElement passBar;
	
	public void inputPass(String text) {
		passBar.sendKeys(text);
		passBar.submit();
		
	}

}
