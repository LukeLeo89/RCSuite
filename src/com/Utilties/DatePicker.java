package com.Utilties;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BaseTest.BaseConfigurations;

public class DatePicker extends BaseConfigurations {
	
	public void setDate(WebElement datediv, String inpdate, String type){
		
		String selecteddate = "";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
		int j = 0;
		WebElement tblhdr;
		WebElement tblbdy;
		
		String currdate = new String(inpdate);
		LocalDate localDate = LocalDate.parse(currdate, formatter);

		int dom = localDate.getDayOfMonth();
		int moy = localDate.getMonthValue();
		int yr = localDate.getYear();
		
		WebElement datebtn = datediv.findElement(By.xpath("//button[@class='btn btn-default NoSpace' and @type='button']"));
		if(type.equals("normal")){
			datebtn.click();
		}
		tblhdr = datediv.findElement(By.xpath("//table[@role='grid']/thead/tr[1]"));
		tblbdy = datediv.findElement(By.xpath("//table[@role='grid']/tbody"));
		
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		selecteddate = tblhdr.findElement(By.xpath("//button[@class='btn btn-default btn-sm uib-title']")).getText();
		LocalDate ld = LocalDate.parse("01 " + selecteddate, formatter);
		
		int smoy = ld.getMonthValue();
		int syr = ld.getYear();
		
		
		int diffyear = syr - yr;
		int diffmonth = (diffyear * 12) + (smoy - moy);
		
		
		if(diffyear > 0){	
			while (j < diffmonth) {
				tblhdr.findElement(By.xpath("//button[@class='btn btn-default btn-sm pull-left uib-left']")).click();
				j++;
			}
		}else if(diffyear < 0){
			while (j >= diffmonth+1) {
				tblhdr.findElement(By.xpath("//button[@class='btn btn-default btn-sm pull-right uib-right']")).click();
				j--;
			}
		}else{
			if(diffmonth < 0){
				while (j >= diffmonth+1) {
					tblhdr.findElement(By.xpath("//button[@class='btn btn-default btn-sm pull-right uib-right']")).click();
					j--;
				}
			}else{
				while (j < diffmonth) {
					tblhdr.findElement(By.xpath("//button[@class='btn btn-default btn-sm pull-left uib-left']")).click();
					j++;
				}
			}
			
		}
		
		List<WebElement> columns = tblbdy.findElements(By.tagName("td"));
		for (WebElement cell : columns) {
			if (cell.getText().equals(String.format("%02d", dom))) {
				cell.click();
				break;
			}
		}
	}
}
