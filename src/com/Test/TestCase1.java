package com.Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.BaseTest.BaseConfigurations;
import com.POM.CounterpartyContactPage;
import com.POM.CounterpartyGeneralPage;
import com.POM.CounterpartyKYCPage;
import com.POM.CounterpartyRestrictionPage;
import com.POM.CounterpartyCreditRatingPage;
import com.Utilties.ReadSystemProperties;

public class TestCase1 extends BaseConfigurations {
	
	ReadSystemProperties rp;
	CounterpartyGeneralPage cp;
	CounterpartyContactPage contp;
	CounterpartyCreditRatingPage crp;
	CounterpartyRestrictionPage cresp;
	CounterpartyKYCPage ckycp;
		
	@Test(priority=1)
	public void createNewCptyGeneraltab() throws Exception{
		
		rp = new ReadSystemProperties(systempropertieslocation);
		cp = new CounterpartyGeneralPage(driver);
		contp = new CounterpartyContactPage(driver);
		crp = new CounterpartyCreditRatingPage(driver);
		cresp = new CounterpartyRestrictionPage(driver);
		ckycp = new CounterpartyKYCPage(driver);
		
		driver.get(rp.getPropertyValue("BaseURL"));
		Runtime.getRuntime().exec(rp.getPropertyValue("Authenticationpgmlink"));
		Thread.sleep(6000);
		Assert.assertEquals(cp.getPageTitle(), "Counterparty Management");
		
		/*----------General tab----------*/
		cp.createNewCptyGeneral("abc", "abc", "Affiliate", "Aviation", "Lee Campbell", "United Kingdom", true, "05 November 2015");
		
		
		/*----------Adding Stock ticker----------*/
		cp.addStockTicker("CME", "Test CME", 1);
		cp.addStockTicker("LME", "Test LME", 2);
		cp.addStockTicker("ICE", "Test ICE", 3);
		
		/*----------Deleting Stock ticker enties----------*/
		cp.deleteStockTicker("CME");
		
		/*----------Adding new contacts----------*/
		contp.addNewContact("Luke", "Sam", "QA Lead", "QA", "123456", "654321", "Yes", "United States", "New York");
		
		/*----------Change or select the default probability rule----------*/
		crp.selectProbabilityRule("Lowest");
		
		/*----------Add new Credit Ratings----------*/
		crp.addNewCreditRating("Fitch", "A", "Stable", "29 December 2017");
		crp.addNewCreditRating("D&B", "AA", "Positive", "29 December 2017");
		
		/*----------Add new Trade Restrictions----------*/
		cresp.setOurEntityDetails("Mercuria", true, true, "Partial Trading");
		cresp.addTradeRestrictions("UK Power", "Day Ahead", "Day Ahead", "Day Ahead", "Day Ahead test");
		cresp.addTradeRestrictions("Oil", "n Calendar Seasons", "", "2S", "n Calendar Seasons test");
		
		
		/*----------Delete Trade Restrictions----------*/
		cresp.deleteTradeRestrictions("UK Power");
		
		
		
		
		
		
		
		/*----------Add new KYC general details----------*/
		ckycp.addKYCDetails("United Kingdom", "02 December 2017", "Low");
		
		/*----------Add new KYC Ownership details----------*/
		ckycp.addKYCOwnershipDetails("ABC", "DEF", "25", "Test Ownership 1", 1);
		ckycp.addKYCOwnershipDetails("XYZ", "QWE", "45", "Test Ownership 2", 2);
		ckycp.addKYCOwnershipDetails("HHH", "YYY", "10", "Test Ownership 3", 3);
		
		/*----------Delete KYC Ownership details----------*/
		ckycp.deleteKYCOwnershipDetails("XYZ");
		
		
		/*----------Add KYC Financial details----------*/
		ckycp.addKYCFinancialDetails("TNW", "Yes", "25", "EUR", 1);
		ckycp.addKYCFinancialDetails("Net Worth", "Yes", "50", "GBP", 2);
		ckycp.addKYCFinancialDetails("Other Ratio", "Yes", "100", "USD", 3);
		
		
		/*----------Delete KYC Financial details----------*/
		ckycp.deleteKYCFinancialDetails("Net Worth");
		
		/*----------Add KYC Bank details----------*/
		ckycp.addKYCBankDetails("1234", "Test Acc 1", "Test Bank 1", "EUR", "Sort 1", "Swift 1", "IBAN 1", 1);
		ckycp.addKYCBankDetails("5678", "Test Acc 2", "Test Bank 2", "GBP", "Sort 2", "Swift 2", "IBAN 2", 2);
		ckycp.addKYCBankDetails("45612", "Test Acc 3", "Test Bank 3", "USD", "Sort 3", "Swift 3", "IBAN 3", 3);
		
		/*----------Delete KYC Bank details----------*/
		ckycp.deleteKYCBankDetails("Test Acc 2");
		
		
		
		
		
		
		/*----------Add KYC Relationship details----------*/
		ckycp.addKYCRelationshipDetails("Tax", "EFT", "123", "Spot", "Comment 1", 1);
		ckycp.addKYCRelationshipDetails("Parent", "ACH", "455", "Exchange", "Comment 2", 2);
		ckycp.addKYCRelationshipDetails("Trading", "Overrid", "899", "Term", "Comment 3", 3);
		
		
		ckycp.deleteKYCRelationshipDetails("Trading");
		
		
		
		ckycp.addKYCComplianceDetails("CPQi", "In Progress", "08 March 2017", "02 July 2017", "22 June 2018", "Compliance 1", 1);
		ckycp.addKYCComplianceDetails("Mercuria", "Completed", "02 February 2017", "09 August 2017", "17 June 2019", "Compliance 2", 2);
		ckycp.addKYCComplianceDetails("Test Entity 1", "Not Started", "29 April 2017", "05 May 2017", "06 March 2019", "Compliance 3", 3);
		
		
		ckycp.deleteKYCComplianceDetails("CPQi");
		
	}
}
