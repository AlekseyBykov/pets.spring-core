package alekseybykov.portfolio.springcore.javaconfig.annotations;

import alekseybykov.portfolio.springcore.javaconfig.di.autowiring.annotationconfig.BeanA;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * @author Aleksey Bykov
 * @since 01.09.2020
 */
public class AnnotationsTest {

	private static ApplicationContext applicationContext;

	@BeforeClass
	public static void setUp() {
		applicationContext = new ClassPathXmlApplicationContext("annotationconfig/application-context.xml");
	}

	@Test
	public void testInjectionUsingValueAnnotation() {
		BeanA beanA = applicationContext.getBean(BeanA.class);
		assertEquals("string", beanA.getString());
	}
}
