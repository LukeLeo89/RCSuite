package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utilties.DatePicker;
import com.Utilties.PopulateDropdownValue;
import com.Utilties.PopulateGridValues;

public class CounterpartyKYCPage {
	PopulateDropdownValue pdv;
	PopulateGridValues pgv;
	
	WebDriver driver;
	
	public CounterpartyKYCPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@id='tabKYC' and @class='FormMenuButtonLayout FormMenuButtonAppearance ng-binding ng-scope']")
	WebElement kyctab;

	@FindBy(xpath="//select[@id='inpPlaceOfIncorporation']")
	WebElement cptykycplaceofincdd;
	
	@FindBy(xpath="//td[@id='tbltdiptDateOfIncorporation']")
	WebElement cptykycdateofincdate;
	
	@FindBy(xpath="//select[@id='inpRisk']")
	WebElement cptykycriskdd;
		
	@FindBy(xpath="//div[@id='dgGridTitleOwnershipDetails']/table/tbody/tr/td[2]/button[@id='btnGridCommand' and contains(text(), '+')]")
	WebElement cptykycownershipdetailsaddbtn;
	
	@FindBy(xpath="//div[@id='dgGridTitleOwnershipDetails']/table/tbody/tr/td[4]/button[@id='btnGridCommand' and contains(text(), 'X')]")
	WebElement cptykycownershipdetailsdeletebtn;
		
	@FindBy(xpath="//table[@id='tblFieldOwnershipDetails']")
	WebElement cptykycownershipdetailsgridtbl;
	
	@FindBy(xpath="//tr[@class='gridRowColor ng-scope']")
	WebElement cptykycownershipdetailsgridtblrow;
	
	@FindBy(xpath="//input[contains(@ng-model,'TradingCounterpartyOwnershipName')]")
	WebElement cptykycownershipdetailsgridcompnametxt;
	
	@FindBy(xpath="//input[contains(@ng-model,'Title')]")
	WebElement cptykycownershipdetailsgridtitletxt;
	
	@FindBy(xpath="//input[contains(@ng-model,'OwnershipPercentage')]")
	WebElement cptykycownershipdetailsgridownerpercenttxt;
	
	@FindBy(xpath="//input[contains(@ng-model,'Comment')]")
	WebElement cptykycownershipdetailsgridcommentstxt;
	
	@FindBy(xpath="//div[@id='dgGridTitleFinancialDetails']/table/tbody/tr/td[2]/button[@id='btnGridCommand' and contains(text(), '+')]")
	WebElement cptykycfinancialdetailsgridaddbtn;
	
	@FindBy(xpath="//div[@id='dgGridTitleFinancialDetails']/table/tbody/tr/td[4]/button[@id='btnGridCommand' and contains(text(), 'X')]")
	WebElement cptykycfinancialdetailsgriddeletebtn;
	
	@FindBy(xpath="//table[@id='tblFieldFinancialDetails']")
	WebElement cptykycfinancialdetailsgridtbl;
	
	@FindBy(xpath="//select[contains(@ng-model,'lCovenantClauseId')]")
	WebElement cptykycfinancialdetailsgridcovenantdd;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement cptykycfinancialdetailsgridpercentchk;
		
	@FindBy(xpath="//div[@id='gridContainerFinancialDetails']/input")
	WebElement cptykycfinancialdetailsgridratiotxt;
	
	@FindBy(xpath="//div[@id='gridContainerFinancialDetails']/select")
	WebElement cptykycfinancialdetailsgridcurrencydd;
		
	@FindBy(xpath="//div[@id='dgGridTitleBankDetails']/table/tbody/tr/td[2]/button[@id='btnGridCommand' and contains(text(), '+')]")
	WebElement cptykycbankdetailsgridaddbtn;
	
	@FindBy(xpath="//div[@id='dgGridTitleBankDetails']/table/tbody/tr/td[4]/button[@id='btnGridCommand' and contains(text(), 'X')]")
	WebElement cptykycbankdetailsgriddeletebtn;
		
	@FindBy(xpath="//table[@id='tblFieldBankDetails']")
	WebElement cptykycbankdetailsgridtbl;
	
	@FindBy(xpath="//input[@type='text' and contains(@ng-model, 'AccountNumber')]")
	WebElement cptykycbankdetailaccnotxt;
	
	@FindBy(xpath="//input[@type='text' and contains(@ng-model, 'AccountName')]")
	WebElement cptykycbankdetailaccnametxt;
	
	@FindBy(xpath="//input[@type='text' and contains(@ng-model, 'TradingCounterpartyBankDetailName')]")
	WebElement cptykycbankdetailbanknametxt;
	
	@FindBy(xpath="//select[contains(@ng-model, 'lCurrencyId')]")
	WebElement cptykycbankdetailcurrencydd;
	
	@FindBy(xpath="//input[@type='text' and contains(@ng-model, 'SortCode')]")
	WebElement cptykycbankdetailsortcodetxt;
	
	@FindBy(xpath="//input[@type='text' and contains(@ng-model, 'SwiftCode')]")
	WebElement cptykycbankdetailswiftcodetxt;
	
	@FindBy(xpath="//input[@type='text' and contains(@ng-model, 'IBAN')]")
	WebElement cptykycbankdetailibantxt;
	
	@FindBy(xpath="//div[@id='dgGridTitleRelationShipDetails']/table/tbody/tr/td[2]/button[@id='btnGridCommand' and contains(text(), '+')]")
	WebElement cptykycrelationshipdetailsgridaddbtn;
	
	@FindBy(xpath="//div[@id='dgGridTitleRelationShipDetails']/table/tbody/tr/td[4]/button[@id='btnGridCommand' and contains(text(), 'X')]")
	WebElement cptykycrelationshipdetailsgriddeletebtn;
	
	@FindBy(xpath="//table[@id='tblFieldRelationShipDetails']")
	WebElement cptykycrelationshipdetailsgridtbl;
	
	@FindBy(xpath="//select[contains(@ng-model, 'lTradingCounterpartyRelationId')]")
	WebElement cptykycrelationshipdetailsrelationdd;
	
	@FindBy(xpath="//select[contains(@ng-model, 'lTradingCounterpartyPaymentTypeId')]")
	WebElement cptykycrelationshipdetailspaymenttypedd;
	
	@FindBy(xpath="//input[@type='text' and contains(@ng-model, 'Terms')]")
	WebElement cptykycrelationshipdetailstermtxt;
	
	@FindBy(xpath="//select[contains(@ng-model, 'lTradingCounterpartyRelationDealTypeId')]")
	WebElement cptykycrelationshipdetailsrelationshiptypedd;
	
	@FindBy(xpath="//input[@type='text' and contains(@ng-model, 'Comment')]")
	WebElement cptykycrelationshipdetailscommenttxt;
	
	@FindBy(xpath="//div[@id='dgGridTitleComplianceDetails']/table/tbody/tr/td[2]/button[@id='btnGridCommand' and contains(text(), '+')]")
	WebElement cptykyccompliancedetailsgridaddbtn;
	
	@FindBy(xpath="//div[@id='dgGridTitleComplianceDetails']/table/tbody/tr/td[4]/button[@id='btnGridCommand' and contains(text(), 'X')]")
	WebElement cptykyccompliancedetailsgriddeletebtn;
	
	@FindBy(xpath="//table[@id='tblFieldComplianceDetails']")
	WebElement cptykyccompliancedetailsgridtbl;
	
	@FindBy(xpath="//select[contains(@ng-model, 'lTradingEntityId')]")
	WebElement cptykyccompliancedetailsourentitydd;
	
	@FindBy(xpath="//select[contains(@ng-model, 'lKYCComplianceCheckId')]")
	WebElement cptykyccompliancedetailsapprovaldd;
	
	@FindBy(xpath="//div[@id='gridContainerComplianceDetails']/div/div[2]/button")
	WebElement cptykycdatediv;
	
	@FindBy(xpath="//input[@type='text' and contains(@ng-model, 'Comment')]")
	WebElement cptykyccompliancedetailscommenttxt;
	
	
	
	public void addKYCDetails(String placeofinc, String dateofinc, String risk) throws Exception{
		kyctab.click();
		
		
		DatePicker dp = new DatePicker();
		pdv = new PopulateDropdownValue();
		
		Thread.sleep(500);
		cptykycplaceofincdd.click();
		pdv.setDropdownValue(cptykycplaceofincdd, placeofinc);
		
		dp.setDate(cptykycdateofincdate, dateofinc, "normal");
		
		cptykycriskdd.click();
		pdv.setDropdownValue(cptykycriskdd, risk);
	}
	
	public void addKYCOwnershipDetails(String compname, String title, String ownerperc, String comments, int index) throws Exception{
		
		kyctab.click();
		cptykycownershipdetailsaddbtn.click();
		
		WebElement gridrowtobeselected = cptykycownershipdetailsgridtbl.findElement(By.xpath("//table[@id='tblFieldOwnershipDetails']/tbody/tr["+index+"]"));
		gridrowtobeselected.click();
		
		
		
		pgv = new PopulateGridValues();
		pgv.setGridValues(cptykycownershipdetailsgridcompnametxt, "Textbox", compname, 1, cptykycownershipdetailsgridtbl);
		pgv.setGridValues(cptykycownershipdetailsgridtitletxt, "Textbox", title, 2, cptykycownershipdetailsgridtbl);
		pgv.setGridValues(cptykycownershipdetailsgridownerpercenttxt, "Textbox", ownerperc, 3, cptykycownershipdetailsgridtbl);
		pgv.setGridValues(cptykycownershipdetailsgridcommentstxt, "Textbox", comments, 4, cptykycownershipdetailsgridtbl);
		
		
	}
	
	public void deleteKYCOwnershipDetails(String keyvalue){
		kyctab.click();
		
		pgv = new PopulateGridValues();
		boolean gridstatus = pgv.deleteGridRows(cptykycownershipdetailsgridtbl, 1, keyvalue);
		if(gridstatus == true){
			cptykycownershipdetailsdeletebtn.click();
		}
		
	}
	
	public void addKYCFinancialDetails(String covenant, String perc, String ratio, String currency, int index) throws Exception{
		kyctab.click();
		
		pdv = new PopulateDropdownValue();
		
		cptykycfinancialdetailsgridaddbtn.click();
		
		WebElement rowtobeselected = cptykycfinancialdetailsgridtbl.findElement(By.xpath("//table[@id='tblFieldFinancialDetails']/tbody/tr["+index+"]"));
		rowtobeselected.click();
		
		pgv = new PopulateGridValues();
		pgv.setGridValues(cptykycfinancialdetailsgridcovenantdd, "Dropdown", covenant, 1, cptykycfinancialdetailsgridtbl);
		pgv.setGridValues(cptykycfinancialdetailsgridpercentchk, "Checkbox", perc, 2, cptykycfinancialdetailsgridtbl);
		pgv.setGridValues(cptykycfinancialdetailsgridratiotxt, "Textbox", ratio, 3, cptykycfinancialdetailsgridtbl);
		pgv.setGridValues(cptykycfinancialdetailsgridcurrencydd, "Dropdown", currency, 4, cptykycfinancialdetailsgridtbl);
		
	}
	
	public void deleteKYCFinancialDetails(String keyvalue) throws Exception{
		kyctab.click();
		
		pgv = new PopulateGridValues();
		boolean gridstatus = pgv.deleteGridRows(cptykycfinancialdetailsgridtbl, 1, keyvalue);
		if(gridstatus == true){
			cptykycfinancialdetailsgriddeletebtn.click();
		}
		
	}
	
	
	public void addKYCBankDetails(String accno, String accname, String bankname, String currency, String sortcode, String swiftcode, String iban, int index) throws Exception{
		kyctab.click();
		
		cptykycbankdetailsgridaddbtn.click();
		
		WebElement gridrowtobeselected = cptykycbankdetailsgridtbl.findElement(By.xpath("//table[@id='tblFieldBankDetails']/tbody/tr["+index+"]"));
		gridrowtobeselected.click();
		pgv = new PopulateGridValues();
		
		pgv.setGridValues(cptykycbankdetailaccnotxt, "Textbox", accno, 1, cptykycbankdetailsgridtbl);
		pgv.setGridValues(cptykycbankdetailaccnametxt, "Textbox", accname, 2, cptykycbankdetailsgridtbl);
		pgv.setGridValues(cptykycbankdetailbanknametxt, "Textbox", bankname, 3, cptykycbankdetailsgridtbl);
		pgv.setGridValues(cptykycbankdetailcurrencydd, "Textbox", currency, 4, cptykycbankdetailsgridtbl);
		pgv.setGridValues(cptykycbankdetailsortcodetxt, "Textbox", sortcode, 5, cptykycbankdetailsgridtbl);
		pgv.setGridValues(cptykycbankdetailswiftcodetxt, "Textbox", swiftcode, 6, cptykycbankdetailsgridtbl);
		pgv.setGridValues(cptykycbankdetailibantxt, "Textbox", iban, 7, cptykycbankdetailsgridtbl);
		
	}
	
	
	public void deleteKYCBankDetails(String keyvalue){
		kyctab.click();
		
		pgv = new PopulateGridValues();
		boolean gridstatus = pgv.deleteGridRows(cptykycbankdetailsgridtbl, 2, keyvalue);
		if(gridstatus == true){
			cptykycbankdetailsgriddeletebtn.click();
		}
	}
	
	
	public void addKYCRelationshipDetails(String relation, String paymentterm, String Term, String type, String comment, int index) throws Exception{
		kyctab.click();
		
		cptykycrelationshipdetailsgridaddbtn.click();
		pgv = new PopulateGridValues();
		
		WebElement gridrowtobeselected = cptykycbankdetailsgridtbl.findElement(By.xpath("//table[@id='tblFieldRelationShipDetails']/tbody/tr["+index+"]"));
		gridrowtobeselected.click();
		
		
		pgv.setGridValues(cptykycrelationshipdetailsrelationdd, "Dropdown", relation, 1, cptykycrelationshipdetailsgridtbl);
		pgv.setGridValues(cptykycrelationshipdetailspaymenttypedd, "Dropdown", paymentterm, 2, cptykycrelationshipdetailsgridtbl);
		pgv.setGridValues(cptykycrelationshipdetailstermtxt, "Textbox", Term, 3, cptykycrelationshipdetailsgridtbl);
		pgv.setGridValues(cptykycrelationshipdetailsrelationshiptypedd, "Dropdown", type, 4, cptykycrelationshipdetailsgridtbl);
		pgv.setGridValues(cptykycrelationshipdetailscommenttxt, "Textbox", comment, 5, cptykycrelationshipdetailsgridtbl);
		
		
	}
	
	
	public void deleteKYCRelationshipDetails(String keyvalue){
		kyctab.click();
		
		pgv = new PopulateGridValues();
		boolean gridstatus = pgv.deleteGridRows(cptykycrelationshipdetailsgridtbl, 1, keyvalue);
		if(gridstatus == true){
			cptykycrelationshipdetailsgriddeletebtn.click();
		}
	}
	
	
	public void addKYCComplianceDetails(String ourentity, String approval, String firstapproved, String lastreviewdate, String nextreviewdate, String comments, int index) throws Exception{
		kyctab.click();
		
		cptykyccompliancedetailsgridaddbtn.click();
		pgv = new PopulateGridValues();
		
		WebElement gridrowtobeselected = cptykyccompliancedetailsgridtbl.findElement(By.xpath("//table[@id='tblFieldComplianceDetails']/tbody/tr["+index+"]"));
		gridrowtobeselected.click();
		
		
		pgv.setGridValues(cptykyccompliancedetailsourentitydd, "Dropdown", ourentity, 1, cptykyccompliancedetailsgridtbl);
		pgv.setGridValues(cptykyccompliancedetailsapprovaldd, "Dropdown", approval, 2, cptykyccompliancedetailsgridtbl);
		pgv.setGridValues(cptykycdatediv, "Date", firstapproved, 3, cptykyccompliancedetailsgridtbl);
		pgv.setGridValues(cptykycdatediv, "Date", lastreviewdate, 4, cptykyccompliancedetailsgridtbl);
		pgv.setGridValues(cptykycdatediv, "Date", nextreviewdate, 5, cptykyccompliancedetailsgridtbl);
		pgv.setGridValues(cptykyccompliancedetailscommenttxt, "Textbox", comments, 6, cptykyccompliancedetailsgridtbl);
	}
	
	
	public void deleteKYCComplianceDetails(String keyvalue){
		kyctab.click();
		
		pgv = new PopulateGridValues();
		boolean gridstatus = pgv.deleteGridRows(cptykyccompliancedetailsgridtbl, 1, keyvalue);
		if(gridstatus == true){
			cptykyccompliancedetailsgriddeletebtn.click();
		}
	}
}
