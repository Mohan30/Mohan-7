package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{
	
	public ViewLead() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement verifyFirstName;
	
	@Then("verify FirstName as (.*)")
	public ViewLead verify(String data) {
		verifyExactText(verifyFirstName, data);
		return this;
	}
}
