package alekseybykov.portfolio.springcore.di.factory;

import alekseybykov.portfolio.springcore.di.factories.ElementLocatorFactory;
import alekseybykov.portfolio.springcore.di.manual.DependencyInjectionWithoutSpringTest;
import alekseybykov.portfolio.springcore.di.services.ElementSearchService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.w3c.dom.Element;

import static org.junit.Assert.assertEquals;

/**
 * @author Aleksey Bykov
 * @since 15.08.2020
 */
public class DependencyInjectionWithStaticFactoryTest {

	private static ElementSearchService elementSearchService;

	@BeforeClass
	public static void setUp() throws Exception {
		// dependency injection is performed "manually" by using specific factory
		elementSearchService = new ElementSearchService(ElementLocatorFactory.createInstance());
	}

	@Test
	public void testFindElement() throws Exception {
		final String searchPath = DependencyInjectionWithoutSpringTest.class.getResource("/data.xml").getPath();
		Element element = elementSearchService.findElement(searchPath, "data", "1");

		assertEquals("1", element.getAttribute("id"));
	}
}
