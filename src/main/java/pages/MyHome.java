package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyHome extends ProjectMethods{
	public MyHome() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Leads")
	private WebElement clickLeads;
	@And("Click Leads Link")
	public MyLeads leadClick() {
		click(clickLeads);
		return new MyLeads();
	}
}
