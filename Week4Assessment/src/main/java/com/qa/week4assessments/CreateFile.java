package com.qa.week4assessments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateFile {
	@FindBy(id = "name")
	private WebElement newFileBar;
	@FindBy(xpath = "//*[@id=\"j-add-item-type-standalone-projects\"]/ul/li[1]/label/span")
	private WebElement projectType;
	@FindBy(id = "ok-button")
	private WebElement okButton;
	
	public void newFile(String text) {
		newFileBar.sendKeys(text);
		projectType.click();
		okButton.click();
		
	}
	
}
