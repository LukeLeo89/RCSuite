package com.Utilties;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseTest.BaseConfigurations;

public class PopulateGridValues extends BaseConfigurations {
	
	public void setGridValues(WebElement w, String fieldtype, String fieldvalue, int index, WebElement gridtable) throws Exception {
		
		DatePicker dp = new DatePicker();
		switch (fieldtype) {
			case "Dropdown":
				setGridElements(index, "Dropdown", gridtable);
				Select dd = new Select(w);
				dd.selectByVisibleText(fieldvalue);
				break;
	
			case "Textbox":
				setGridElements(index, "Textbox", gridtable);
				w.sendKeys(fieldvalue);
				break;
				
			case "Checkbox":
				setGridElements(index, "Checkbox", gridtable);
				if(fieldvalue.equals("Yes") || fieldvalue.equals("Y"))
					gridtable.findElement(By.tagName("input")).click();
				break;
				
			case "Date":
				setGridElements(index, "Date", gridtable);
				w.click();
				dp.setDate(w, fieldvalue, "grid");
				break;
		}

	}

	private void setGridElements(int index, String fieldtype, WebElement grdtbl) throws Exception {
		
		WebElement gw = grdtbl.findElement(By.xpath("//tr[@class='gridRowColor ng-scope gridRowSelected']/td[" + index + "]"));
		
		if (fieldtype.equals("Dropdown")) {
			gw.click();
			Thread.sleep(500);
			gw.click();
			Thread.sleep(500);
		} else if (fieldtype.equals("Textbox")) {
			gw.click();
			Thread.sleep(500);
			gw.click();
			Thread.sleep(500);
		} else if(fieldtype.equals("Checkbox")){
			gw.click();
			Thread.sleep(500);
			gw.click();
		} else if(fieldtype.equals("Date")){
			gw.click();
			Thread.sleep(500);
			gw.click();
			Thread.sleep(500);
		}
	}
	
	public boolean deleteGridRows(WebElement gridtable, int keyindex, String value){
		List<WebElement> rowtodelete = gridtable.findElements(By.xpath("//tr[contains(@class, 'gridRowColor ng-scope')]/td[" + keyindex + "]"));
		for(WebElement e : rowtodelete){
			if(e.getText().equals(value)){
				e.click();
				return true;
			}
		}
		return false;
	}
}
