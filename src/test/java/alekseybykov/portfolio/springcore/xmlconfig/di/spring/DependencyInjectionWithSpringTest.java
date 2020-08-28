package alekseybykov.portfolio.springcore.xmlconfig.di.spring;

import alekseybykov.portfolio.springcore.xmlconfig.di.manual.DependencyInjectionWithoutSpringTest;
import alekseybykov.portfolio.springcore.xmlconfig.di.services.ElementSearchService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.Element;

import static org.junit.Assert.assertEquals;

/**
 * @author Aleksey Bykov
 * @since 15.08.2020
 */
public class DependencyInjectionWithSpringTest {

	private static ElementSearchService elementSearchService;

	@BeforeClass
	public static void setUp() {
		// dependency injection is performed by the container
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xmlconfig/di/application-context.xml");
		elementSearchService = applicationContext.getBean("elementSearchService", ElementSearchService.class);
	}

	@Test
	public void testFindElement() throws Exception {
		final String searchPath = DependencyInjectionWithoutSpringTest.class.getResource("/data.xml").getPath();
		Element dataElement = elementSearchService.findElement(searchPath, "data", "1");

		assertEquals("1", dataElement.getAttribute("id"));
	}
}
