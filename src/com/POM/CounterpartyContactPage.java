package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utilties.PopulateGridValues;

public class CounterpartyContactPage {
	WebDriver driver;
	
	public CounterpartyContactPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@id='tabContact' and @class='FormMenuButtonLayout FormMenuButtonAppearance ng-binding ng-scope']")
	WebElement contacttab;
	
	@FindBy(xpath="//button[@id='btnGridCommand' and contains(text(), '+')]")
	WebElement contactgridaddnewbtn;
	
	@FindBy(xpath="//button[@id='btnGridCommand' and contains(text(), 'X')]")
	WebElement contactgriddeletebtn;
	
	@FindBy(xpath="//table[@id='tblFieldContacts']")
	WebElement contactgridtbl;
	
	@FindBy(xpath="//tr[@class='gridRowColor ng-scope']")
	WebElement contactgridtblrow;
	
	@FindBy(xpath="//input[@type='text' and contains(@ng-model, 'ContactName')]")
	WebElement contactgridnametxt;
	
	@FindBy(xpath="//input[@type='text' and contains(@ng-model, 'LastName')]")
	WebElement contactgridlastnametxt;
	
	@FindBy(xpath="//input[@type='text' and contains(@ng-model, 'Title')]")
	WebElement contactgridtitletxt;
	
	@FindBy(xpath="//input[@type='text' and contains(@ng-model, 'Department')]")
	WebElement contactgriddepartmenttxt;
	
	@FindBy(xpath="//input[@type='text' and contains(@ng-model, 'Phone')]")
	WebElement contactgridphonetxt;
	
	@FindBy(xpath="//input[@type='text' and contains(@ng-model, 'Mobile')]")
	WebElement contactgridmobiletxt;
	
	@FindBy(xpath="//select[contains(@ng-model, 'ContactForMargining')]")
	WebElement contactgridcontactformarginingdd;
		
	@FindBy(xpath = "//select[@class='tableCellEdit form-control ng-pristine ng-untouched ng-valid ng-scope ng-empty' and contains(@ng-model, 'lCountryId') ]")
	WebElement contactgridcountrydd;
	
	@FindBy(xpath = "//select[@class='tableCellEdit form-control ng-pristine ng-untouched ng-valid ng-scope ng-empty' and contains(@ng-model, 'lStateId') ]")
	WebElement contactgridstatedd;
	
	public void addNewContact(String name, String lname, String title, String department, String phone, String mobile, String contactformargining, String country, String state) throws Exception{
		contacttab.click();
		Thread.sleep(500);
		contactgridaddnewbtn.click();
		PopulateGridValues pgv = new PopulateGridValues();
		contactgridtblrow.click();
		
		
		pgv.setGridValues(contactgridnametxt, "Textbox", name, 2, contactgridtbl);
		pgv.setGridValues(contactgridlastnametxt, "Textbox", lname, 3, contactgridtbl);
		pgv.setGridValues(contactgridtitletxt, "Textbox", title, 4, contactgridtbl);
		pgv.setGridValues(contactgriddepartmenttxt, "Textbox", department, 5, contactgridtbl);
		pgv.setGridValues(contactgridphonetxt, "Textbox", phone, 6, contactgridtbl);
		pgv.setGridValues(contactgridmobiletxt, "Textbox", mobile, 7, contactgridtbl);
		pgv.setGridValues(contactgridcontactformarginingdd, "Dropdown", contactformargining, 10, contactgridtbl);
		pgv.setGridValues(contactgridcountrydd, "Dropdown", country, 14, contactgridtbl);
		//contacttab.click();
		//Thread.sleep(500);
		//pgv.setGridValues(contactgridstatedd, "Dropdown", state, 15, contactgridtbl);
		
		
		
	}
}
