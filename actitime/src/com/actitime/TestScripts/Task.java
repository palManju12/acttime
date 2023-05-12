package com.actitime.TestScripts;

import org.testng.annotations.Test;

import com.actitime.genuriclibary.BaseClass;
import com.actitime.genuriclibary.fileLiabary;
import com.actitime.objectrepository.Homepage;
import com.actitime.objectrepository.TaskPage;

import graphql.language.Value;

public class Task  extends BaseClass {
	
	@Test
	public void creatCustomer() {
		
	Homepage hp=new Homepage(driver);
	hp.getTasktab().click();
TaskPage tP=new taskPage(driver);
tP.getAddnewbtn().click();
tP.getNewcust().click();


fileliabary f=new fileliabary();
String  Value  f.readDataFromeExcel("sheet1" 1,1);
tP.getcustname().sendkeys();
tP.getcuratcum




	}

}
