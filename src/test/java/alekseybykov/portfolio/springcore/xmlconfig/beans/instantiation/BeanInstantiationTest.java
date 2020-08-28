package alekseybykov.portfolio.springcore.xmlconfig.beans.instantiation;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Aleksey Bykov
 * @since 16.08.2020
 */
public class BeanInstantiationTest {

	private static ApplicationContext applicationContext;

	@BeforeClass
	public static void setUp() {
		applicationContext = new ClassPathXmlApplicationContext("xmlconfig/instantiation/application-context.xml");
	}

	@Test
	public void testInstantiateBeanWithoutConstructorWithUsingStaticMethod() {
		BeanA beanA = applicationContext.getBean(BeanA.class);
		assertEquals(1, beanA.getIntValue());
	}

	@Test
	public void testInstantiateBeanWithoutConstructorWithUsingFactory() {
		BeanC beanC = applicationContext.getBean(BeanC.class);
		assertNotNull(beanC);
	}
}
