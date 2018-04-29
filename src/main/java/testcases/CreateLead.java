package testcases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;
public class CreateLead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="CreateLead";
		testDescription="create the lead";
		testNodes="Leads";
		category="Smoke";
		authors="Gopi";
		browserName="chrome";
		dataSheetName="TC001";
	}
	
	@Test(dataProvider = "fetchData")
    public void createLead(String uName, String pwd, String verify,String cNmae,String fName,String lName) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrm()
		.leadClick()
		.createLeadm()
		.companyName(cNmae)
		.firstName(fName)
		.lastName(lName)
		.submitCreate()
		.verify(fName);
    	
    }
}
