package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Utilties.PopulateGridValues;

public class CounterpartyRestrictionPage {
	
	WebDriver driver;
	
	public CounterpartyRestrictionPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@id='tabRestriction' and @class='FormMenuButtonLayout FormMenuButtonAppearance ng-binding ng-scope']")
	WebElement restrictiontab;
	
	@FindBy(xpath="//input[@id='inpBlocked' and @type='checkbox']")
	WebElement restrictionblockedchk;
	
	@FindBy(xpath="//input[@id='inpReverseBlocked' and @type='checkbox']")
	WebElement restrictionreverseblockedchk;
	
	@FindBy(xpath="//table[@id='tblfldOurEntity']")
	WebElement restritionourentitytbl;
	
	@FindBy(how=How.TAG_NAME, using="select")
	WebElement restrictionourentitydd;
	
	@FindBy(xpath="//select[@id='inpDefaultTradeTerms']")
	WebElement restrictiondefaulttradetermsdd;
	
	@FindBy(xpath="//button[@id='btnGridCommand' and contains(text(), '+')]")
	WebElement traderestrictionaddnewbtn;
	
	@FindBy(xpath="//button[@id='btnGridCommand' and contains(text(), 'X')]")
	WebElement traderestrictiondeletebtn;
	
	@FindBy(xpath="//table[@id='tblFieldTradeRestriction']")
	WebElement traderestrictiongridtbl;
	
	@FindBy(xpath="//tr[@class='gridRowColor ng-scope']")
	WebElement traderestrictiongridtblrow;
	
	@FindBy(xpath="//select[contains(@ng-model,'lTradeRestrictionCategoryId')]")
	WebElement traderestrictiongridcategorydd;
	
	@FindBy(xpath="//select[contains(@ng-model,'lTradeRestrictionTypeId')]")
	WebElement traderestrictiongridrestrictiontypedd;
	
	@FindBy(xpath="//input[contains(@ng-model,'Buy')]")
	WebElement traderestrictiongridbuytxt;
	
	@FindBy(xpath="//input[contains(@ng-model,'Sell')]")
	WebElement traderestrictiongridselltxt;
	
	@FindBy(xpath="//input[contains(@ng-model,'Comments')]")
	WebElement traderestrictiongridcommentstxt;
	
	
	public void setOurEntityDetails(String ourentity, boolean blocked, boolean reverseblocked, String tradeterms) throws InterruptedException{
		restrictiontab.click();
		
		Thread.sleep(1000);
		restrictionourentitydd.click();
		Select oe = new Select(restrictionourentitydd);
		oe.selectByVisibleText(ourentity);
		
		
		if(!restrictionblockedchk.isSelected() && blocked == true){
			restrictionblockedchk.click();
		}
		
		if(!restrictionreverseblockedchk.isSelected() && reverseblocked == true){
			restrictionreverseblockedchk.click();
		}
		
		restrictiondefaulttradetermsdd.click();
		Select tt = new Select(restrictiondefaulttradetermsdd);
		tt.selectByVisibleText(tradeterms);
	}
	
	
	public void addTradeRestrictions(String category, String restrictiontype, String buy, String sell, String comments) throws Exception{
		restrictiontab.click();
		
		traderestrictionaddnewbtn.click();
		PopulateGridValues pgv = new PopulateGridValues();
		traderestrictiongridtblrow.click();
		
		pgv.setGridValues(traderestrictiongridcategorydd, "Dropdown", category, 2, traderestrictiongridtbl);
		pgv.setGridValues(traderestrictiongridrestrictiontypedd, "Dropdown", restrictiontype, 3, traderestrictiongridtbl);
		if(restrictiontype.equals("n Calendar Seasons") || restrictiontype.equals("Range") || restrictiontype.equals("Tenor")){
			pgv.setGridValues(traderestrictiongridbuytxt, "Textbox", buy, 4, traderestrictiongridtbl);
			pgv.setGridValues(traderestrictiongridselltxt, "Textbox", sell, 5, traderestrictiongridtbl);
		}		
		pgv.setGridValues(traderestrictiongridcommentstxt, "Textbox", comments, 6, traderestrictiongridtbl);
		
		
	}
	
	
	public void deleteTradeRestrictions(String keyvalue){
		
		PopulateGridValues pgv = new PopulateGridValues();
		
		boolean gridstatus = pgv.deleteGridRows(traderestrictiongridtbl, 2, keyvalue);
		if(gridstatus == true){
			traderestrictiondeletebtn.click();
		}
	}
}
