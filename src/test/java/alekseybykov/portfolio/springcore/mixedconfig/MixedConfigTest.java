package alekseybykov.portfolio.springcore.mixedconfig;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Aleksey Bykov
 * @since 16.09.2020
 */
public class MixedConfigTest {

	@Test
	public void test() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		BeanA beanA = applicationContext.getBean(BeanA.class);

		assertNotNull(beanA);
		assertEquals("string", beanA.getStringFromDependency());
	}
}
