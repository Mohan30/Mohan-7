package hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends  SeMethods{
	public String browserName;

	
	
	@Before
	public void before(Scenario sc){
		browserName="chrome";
		System.out.println(sc.getName());
		System.out.println(sc.getId());
		startResult();
	 startTestModule(sc.getName(), sc.getName());
		test = startTestCase(sc.getId());
		test.assignCategory("Sanity");
		test.assignAuthor("Mohan");
	startApp(browserName);		
	
			}

	@After
	public void after(){
		endResult();
		closeAllBrowsers();
	}
}
