package alekseybykov.portfolio.springcore.javaconfig.di;

import alekseybykov.portfolio.springcore.javaconfig.di.autowiring.BeanE;
import alekseybykov.portfolio.springcore.javaconfig.di.autowiring.BeanF;
import alekseybykov.portfolio.springcore.javaconfig.di.autowiring.BeanG;
import alekseybykov.portfolio.springcore.javaconfig.di.autowiring.ContainerIdentifiedConfig;
import alekseybykov.portfolio.springcore.javaconfig.di.manual.BeanB;
import alekseybykov.portfolio.springcore.javaconfig.di.manual.BeanC;
import alekseybykov.portfolio.springcore.javaconfig.di.manual.BeanD;
import alekseybykov.portfolio.springcore.javaconfig.di.manual.ManuallyIdentifiedConfig;
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

	@Test
	public void testInjectManuallyIdentifiedDependencies() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ManuallyIdentifiedConfig.class);
		BeanD beanD = applicationContext.getBean(BeanD.class);
		BeanC beanC = beanD.getBeanC();

		assertNotNull(beanC);

		BeanB beanB = beanC.getBeanB();

		assertNotNull(beanB);
		assertEquals("string", beanB.getString());
	}

	@Test
	public void testAutowiring() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ContainerIdentifiedConfig.class);
		BeanG beanG = applicationContext.getBean(BeanG.class);
		BeanF beanF = beanG.getBeanF();

		assertNotNull(beanF);

		BeanE beanE = beanF.getBeanE();

		assertNotNull(beanE);
		assertEquals("string", beanE.getString());
	}
}
