package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods {
	
	public CreateLead() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement typeCompanyName;
	@And("Enter Company Name as (.*)")
	public CreateLead companyName(String data) {
		type(typeCompanyName,data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement typeFirstName;
	@And("Enter First Name as (.*)")
	public CreateLead firstName(String data) {
		type(typeFirstName,data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement typeLastName;
	@And("Enter Last Name as (.*)")
	public CreateLead lastName(String data) {
		type(typeLastName,data);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement submitCreate;
	@When("Click CreateLead Button")
	public ViewLead submitCreate() {
		click(submitCreate);
		return new ViewLead();
	}
}
