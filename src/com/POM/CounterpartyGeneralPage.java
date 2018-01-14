package com.POM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utilties.DatePicker;
import com.Utilties.PopulateDropdownValue;
import com.Utilties.PopulateGridValues;

public class CounterpartyGeneralPage {

	WebDriver driver;
	PopulateDropdownValue pdv;

	public CounterpartyGeneralPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[@id='tbcBannerTitle']")
	WebElement pagetitle;

	@FindBy(xpath = "//button[@id='tabGeneral' and @class='FormMenuButtonLayout FormMenuButtonAppearance ng-binding ng-scope']")
	WebElement generaltab;

	@FindBy(xpath = "//button[@id='btnAdd' and @class='btn btn-default active btn-xs']")
	WebElement cptyaddnewbtn;

	@FindBy(xpath = "//input[@id='inpTradingCounterparty']")
	WebElement cptyshortnametxt;

	@FindBy(xpath = "//textarea[@id='inpLongName']")
	WebElement cptylongnametxta;

	@FindBy(xpath = "//select[@id='inpLegalStatus']")
	WebElement cptylegalstatusdd;

	@FindBy(xpath = "//select[@id='inpIndustry']")
	WebElement cptyindustrycodedd;

	@FindBy(xpath = "//select[@id='inpCountryOfRisk']")
	WebElement cptycountryofriskdd;

	@FindBy(xpath = "//select[@id='inpDomicileCountry']")
	WebElement cptydomicilecountrydd;

	@FindBy(xpath = "//select[@id='inpGeneralNarrative']")
	WebElement cptygeneralnarrativetxta;

	@FindBy(xpath = "//select[@id='inpParentTradingCounterparty']")
	WebElement cptyparentcounterpartytxt;

	@FindBy(xpath = "//select[@id='inpCounterpartyType']")
	WebElement cptycounterpartytypedd;

	@FindBy(xpath = "//select[@id='inpCPCode']")
	WebElement cptycpcodetxt;

	@FindBy(xpath = "//select[@id='inpDunsNumber']")
	WebElement cptydunsnumbertxt;

	@FindBy(xpath = "//select[@id='inpCreditOfficer']")
	WebElement cptycreditofficerdd;

	@FindBy(xpath = "//select[@class='form-control ng-pristine ng-valid ng-isolate-scope ng-empty ng-valid-date ng-touched']")
	WebElement cptynextreviewdatedt;

	@FindBy(xpath = "//input[@id='inpEnabled']")
	WebElement cptyenabledchk;

	@FindBy(xpath = "//input[@id='inpInBankruptcy']")
	WebElement cptyinbankruptcychk;

	@FindBy(xpath = "//button[@id='btnGridCommand' and contains(text(), '+')]")
	WebElement cptystocktickeraddbtn;
	
	@FindBy(xpath = "//button[@id='btnGridCommand' and contains(text(), 'X')]")
	WebElement cptystocktickerdeletebtn;

	@FindBy(xpath = "//td[@id='tbltdiptNextReviewDate']")
	WebElement cptynextreviewdatediv;

	@FindBy(xpath = "//select[@class='tableCellEdit form-control ng-pristine ng-untouched ng-valid ng-scope ng-empty']")
	WebElement cptystocktickerexchangedd;

	@FindBy(xpath = "//input[@class='tableCellEdit form-control ng-pristine ng-untouched ng-valid ng-scope ng-empty']")
	WebElement cptystocktickertickertxt;
	
	@FindBy(xpath = "//table[@id='tblFieldStockTicker']")
	WebElement cptystocktickergridtbl;
	
	@FindBy(xpath = "//tr[@class='gridRowColor ng-scope']")
	WebElement cptystocktickergridrow;
	

	public String getPageTitle() {
		return pagetitle.getText();
	}

	public void createNewCptyGeneral(String shortname, String longname, String legalstatus, String industrycode,
			String creditofficer, String domicilecountry, boolean enabled, String nextreviewdate) throws InterruptedException {

		DatePicker dp = new DatePicker();
		pdv = new PopulateDropdownValue();

		generaltab.click();
		cptyaddnewbtn.click();
		cptyshortnametxt.sendKeys(shortname);
		cptylongnametxta.sendKeys(longname);

		cptylegalstatusdd.click();
		pdv.setDropdownValue(cptylegalstatusdd, legalstatus);
		
		cptyindustrycodedd.click();
		pdv.setDropdownValue(cptyindustrycodedd, industrycode);
		
		cptycreditofficerdd.click();
		pdv.setDropdownValue(cptycreditofficerdd, creditofficer);

		cptydomicilecountrydd.click();
		pdv.setDropdownValue(cptydomicilecountrydd, domicilecountry);
		
		if (!cptyenabledchk.isSelected() && enabled == true) {
			cptyenabledchk.click();
		}

		dp.setDate(cptynextreviewdatediv, nextreviewdate, "normal");
	}

	
	public void addStockTicker(String exchange, String ticker, int index) throws Exception {
		cptystocktickeraddbtn.click();
		
		PopulateGridValues pgv = new PopulateGridValues();
		WebElement gridrowtobeselected = cptystocktickergridtbl.findElement(By.xpath("//table[@id='tblFieldStockTicker']/tbody/tr["+index+"]"));
		
		
		
		gridrowtobeselected.click();

		pgv.setGridValues(cptystocktickerexchangedd, "Dropdown", exchange, 1, cptystocktickergridtbl);
		pgv.setGridValues(cptystocktickertickertxt, "Textbox", ticker, 2, cptystocktickergridtbl);

	}
	
	public void deleteStockTicker(String keyvalue){
		
		PopulateGridValues pgv = new PopulateGridValues();
		
		boolean gridstatus = pgv.deleteGridRows(cptystocktickergridtbl, 1, keyvalue);
		if(gridstatus == true){
			cptystocktickerdeletebtn.click();
		}
	}
}
