package alekseybykov.portfolio.springcore.di;

import alekseybykov.portfolio.springcore.di.locators.ElementLocator;
import alekseybykov.portfolio.springcore.di.locators.Locator;
import alekseybykov.portfolio.springcore.di.services.ElementSearchService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.w3c.dom.Element;

import static org.junit.Assert.assertEquals;

/**
 * @author Aleksey Bykov
 * @since 15.08.2020
 */
public class DependencyInjectionWithoutSpringTest {

	private static Element dataElement;

	@BeforeClass
	public static void setUp() throws Exception {
		// dependency
		Locator locator = new ElementLocator(DependencyInjectionWithoutSpringTest.class.getResource("/data.xml").getPath());
		// dependency injection performed
		ElementSearchService elementSearchService = new ElementSearchService(locator);

		dataElement = elementSearchService.find("data", "1");
	}

	@Test
	public void test() {
		assertEquals("1", dataElement.getAttribute("id"));
	}
}
