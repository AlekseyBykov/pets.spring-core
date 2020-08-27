package alekseybykov.portfolio.springcore.di.autowiring.xml;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * @author Aleksey Bykov
 * @since 26.08.2020
 */
public class AutowiringTest {

	private static ApplicationContext applicationContext;

	@BeforeClass
	public static void setUp() {
		applicationContext = new ClassPathXmlApplicationContext("di/autowiring/xml/application-context.xml");
	}

	@Test
	public void testAutowiringByTypeUsingXml() {
		BeanA beanA = applicationContext.getBean(BeanA.class);
		BeanB beanB = applicationContext.getBean(BeanB.class);

		assertEquals(beanA.getBeanB(), beanB);
	}

	@Test
	public void testAutowiringByNameUsingXml() {
		BeanC beanC = applicationContext.getBean(BeanC.class);
		BeanD beanD = applicationContext.getBean(BeanD.class);

		assertEquals(beanC.getBeanD(), beanD);
	}
}
