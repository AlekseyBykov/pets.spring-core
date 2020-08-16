package alekseybykov.portfolio.springcore.di.constructors;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * @author Aleksey Bykov
 * @since 16.08.2020
 */
public class ConstructorInjectionTest {

	private static ApplicationContext applicationContext;

	@BeforeClass
	public static void setUp() {
		applicationContext = new ClassPathXmlApplicationContext("di/constructors/application-context.xml");
	}

	@Test
	public void test() {
		BeanA beanAWithStringArg = applicationContext.getBean("beanAWithStringArg", BeanA.class);
		assertEquals("1", beanAWithStringArg.getStringValue());
		assertEquals(0, beanAWithStringArg.getIntValue());

		BeanA beanAWithIntArg = applicationContext.getBean("beanAWithIntArg", BeanA.class);
		assertNull(beanAWithIntArg.getStringValue());
		assertEquals(1, beanAWithIntArg.getIntValue());

		BeanB beanB = applicationContext.getBean("beanB", BeanB.class);
		assertEquals("1", beanB.getFirstStringValue());
		assertEquals("0", beanB.getSecondStringValue());
	}
}
