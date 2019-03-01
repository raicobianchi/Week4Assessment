package com.qa.week4assessments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Username {
	@FindBy(id = "j_username")
	private WebElement userBar;
	
	public void inputUser(String text) {
		userBar.sendKeys(text);
		
	}

}
