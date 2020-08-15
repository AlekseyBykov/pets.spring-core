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

	private static ElementSearchService elementSearchService;

	@BeforeClass
	public static void setUp() throws Exception {
		// dependency
		Locator locator = new ElementLocator();
		// dependency injection performed
		elementSearchService = new ElementSearchService(locator);
	}

	@Test
	public void testFindElement() throws Exception {
		final String searchPath = DependencyInjectionWithoutSpringTest.class.getResource("/data.xml").getPath();
		Element element = elementSearchService.findElement(searchPath, "data", "1");

		assertEquals("1", element.getAttribute("id"));
	}
}
