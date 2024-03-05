package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooks {
	
	@Before
	public void setup(Scenario scenario) {
		System.out.println("** Execution before the scenario- "+scenario.getName());
		System.out.println("++ User entered the URL ++");
		System.out.println("++ Application got opened ++");
	}
	
	@After
	public void tearDown(Scenario scenario) {
		System.out.println("** Execution after the scenario- "+scenario.getName());
		System.out.println("-- User closed the URL --");
		System.out.println("-- Application got closed --");
	}
}
