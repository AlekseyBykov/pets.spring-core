package alekseybykov.portfolio.springcore.javaconfig.beans.di;

import alekseybykov.portfolio.springcore.javaconfig.beans.di.manual.BeanB;
import alekseybykov.portfolio.springcore.javaconfig.beans.di.manual.BeanC;
import alekseybykov.portfolio.springcore.javaconfig.beans.di.manual.BeanD;
import alekseybykov.portfolio.springcore.javaconfig.config.ApplicationConfig;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Aleksey Bykov
 * @since 31.08.2020
 */
public class DependencyInjectionTest {

	private static ApplicationContext applicationContext;

	@BeforeClass
	public static void setUp() {
		applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
	}

	@Test
	public void testInjectManuallyIdentifiedDependencies() {
		BeanD beanD = applicationContext.getBean(BeanD.class);
		BeanC beanC = beanD.getBeanC();

		assertNotNull(beanC);

		BeanB beanB = beanC.getBeanB();

		assertNotNull(beanB);
		assertEquals("string", beanB.getString());
	}
}
