package alekseybykov.portfolio.springcore.javaconfig.di.autowiring.javabased;

import alekseybykov.portfolio.springcore.javaconfig.di.autowiring.manual.BeanB;
import alekseybykov.portfolio.springcore.javaconfig.di.autowiring.manual.BeanC;
import alekseybykov.portfolio.springcore.javaconfig.di.autowiring.manual.BeanD;
import alekseybykov.portfolio.springcore.javaconfig.di.autowiring.manual.ManuallyIdentifiedConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Aleksey Bykov
 * @since 05.09.2020
 */
public class AutowiringWithJavaBasedConfigsTest {

	@Test
	public void test() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ManuallyIdentifiedConfig.class);
		BeanD beanD = applicationContext.getBean(BeanD.class);
		BeanC beanC = beanD.getBeanC();

		assertNotNull(beanC);

		BeanB beanB = beanC.getBeanB();

		assertNotNull(beanB);
		assertEquals("string", beanB.getString());

		applicationContext = new AnnotationConfigApplicationContext(ContainerIdentifiedConfig.class);
		BeanG beanG = applicationContext.getBean(BeanG.class);
		BeanF beanF = beanG.getBeanF();

		assertNotNull(beanF);

		BeanE beanE = beanF.getBeanE();

		assertNotNull(beanE);
		assertEquals("string", beanE.getString());
	}
}
