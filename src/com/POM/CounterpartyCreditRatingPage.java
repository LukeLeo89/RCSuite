package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utilties.PopulateDropdownValue;
import com.Utilties.PopulateGridValues;

public class CounterpartyCreditRatingPage {
	
	PopulateDropdownValue pdv;
	
	WebDriver driver;
	
	public CounterpartyCreditRatingPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@id='tabCreditRating' and @class='FormMenuButtonLayout FormMenuButtonAppearance ng-binding ng-scope']")
	WebElement creditratingtab;
	
	@FindBys({
		@FindBy(how=How.TAG_NAME, using="select"),
		@FindBy(xpath="//select[@id='inpDefaultProbabilityRule']")
	})
	WebElement crdefaultprobruledd;
	
	@FindBy(xpath="//button[@id='btnGridCommand' and contains(text(), '+')]")
	WebElement craddnewbtn;
	
	@FindBy(xpath="//button[@id='btnGridCommand' and contains(text(), 'X')]")
	WebElement cradeletebtn;
	
	@FindBy(xpath="//table[@id='tblFieldCreditRating']")
	WebElement crgridtble;
	
	@FindBy(xpath="//tr[@class='gridRowColor ng-scope']")
	WebElement crgridtblerow;
	
	@FindBy(xpath="//select[contains(@ng-model, 'lRatingTypeId')]")
	WebElement crratingagencydd;
	
	@FindBy(xpath="//select[contains(@ng-model, 'lRatingId')]")
	WebElement crratingdd;
	
	@FindBy(xpath="//select[contains(@ng-model, 'Outlook')]")
	WebElement croutlookdd;
		
	public void selectProbabilityRule(String rule) throws InterruptedException{
		
		pdv = new PopulateDropdownValue();
		creditratingtab.click();
		
		Thread.sleep(500);
		crdefaultprobruledd.click();
		pdv.setDropdownValue(crdefaultprobruledd, rule);
			
	}
	
	public void addNewCreditRating(String ratingagency, String rating, String outlook, String ratingdate) throws Exception{
		creditratingtab.click();
		
		craddnewbtn.click();
		PopulateGridValues pgv = new PopulateGridValues();
		crgridtblerow.click();
		
		pgv.setGridValues(crratingagencydd, "Dropdown", ratingagency, 1, crgridtble);
		pgv.setGridValues(crratingdd, "Dropdown", rating, 2, crgridtble);
		pgv.setGridValues(croutlookdd, "Dropdown", outlook, 3, crgridtble);
		
		
	}
}
