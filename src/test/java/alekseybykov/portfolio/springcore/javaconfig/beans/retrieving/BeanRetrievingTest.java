package alekseybykov.portfolio.springcore.javaconfig.beans.retrieving;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * @author Aleksey Bykov
 * @since 28.08.2020
 */
public class BeanRetrievingTest {

	private static ApplicationContext applicationContext;

	@BeforeClass
	public static void setUp() {
		applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
	}

	@Test
	public void testRetrieveBeanFromContainer() {
		BeanA beanA = applicationContext.getBean(BeanA.class);
		assertEquals("string", beanA.getString());
	}

	@Test
	public void testRetrieveBeanFromContainerByUsingDifferentNames() {
		BeanA beanA = applicationContext.getBean(BeanA.class);
		BeanA instanceOfBeanA = applicationContext.getBean("anotherNameForBeanA", BeanA.class);
		BeanA yetAnotherInstanceOfBeanA = applicationContext.getBean("yetAnotherNameForBeanA", BeanA.class);

		assertEquals(beanA, yetAnotherInstanceOfBeanA);
		assertEquals(instanceOfBeanA, yetAnotherInstanceOfBeanA);
		assertEquals("string", yetAnotherInstanceOfBeanA.getString());
	}
}
