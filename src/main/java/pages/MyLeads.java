package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods {
	public MyLeads() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement createLead;
	@And("Click CreateLead Link")
	public CreateLead createLeadm() {
		click(createLead);
		return new CreateLead();
	}
}
