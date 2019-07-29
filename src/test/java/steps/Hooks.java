package steps;

import org.junit.Before;

import cucumber.api.java.After;
import factory.WebDriverFactory;


public class Hooks {

	@Before
	public static void setUp() {
		WebDriverFactory.startChromeDriver("http://automationpractice.com");
	}

	@After
	public static void tearDown() {
		WebDriverFactory.getCurrentRunningDriver().close();
		WebDriverFactory.killCurrentRunningDriver();

	}
}
