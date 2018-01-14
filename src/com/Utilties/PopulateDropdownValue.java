package com.Utilties;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseTest.BaseConfigurations;

public class PopulateDropdownValue extends BaseConfigurations {
	
	public void setDropdownValue(WebElement w, String value){
				
		Select dd = new Select(w);
		dd.selectByVisibleText(value);
	}
}
