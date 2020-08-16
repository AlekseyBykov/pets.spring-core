package alekseybykov.portfolio.springcore.di.setters;

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
public class SetterInjectionTest {

	private static ApplicationContext applicationContext;

	@BeforeClass
	public static void setUp() {
		applicationContext = new ClassPathXmlApplicationContext("di/setters/application-context.xml");
	}

	@Test
	public void test() {
		BeanB beanB = applicationContext.getBean(BeanB.class);
		assertNotNull(beanB.getBeanA());
		assertEquals(1, beanB.getIntValue());
	}
}
