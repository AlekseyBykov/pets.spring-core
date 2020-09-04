package alekseybykov.portfolio.springcore.javaconfig.di;

import alekseybykov.portfolio.springcore.javaconfig.di.autowiring.annotationconfig.autowired.BeanH;
import alekseybykov.portfolio.springcore.javaconfig.di.autowiring.annotationconfig.autowired.BeanJ;
import alekseybykov.portfolio.springcore.javaconfig.di.autowiring.javabased.BeanE;
import alekseybykov.portfolio.springcore.javaconfig.di.autowiring.javabased.BeanF;
import alekseybykov.portfolio.springcore.javaconfig.di.autowiring.javabased.BeanG;
import alekseybykov.portfolio.springcore.javaconfig.di.autowiring.javabased.ContainerIdentifiedConfig;
import alekseybykov.portfolio.springcore.javaconfig.di.autowiring.manual.BeanB;
import alekseybykov.portfolio.springcore.javaconfig.di.autowiring.manual.BeanC;
import alekseybykov.portfolio.springcore.javaconfig.di.autowiring.manual.BeanD;
import alekseybykov.portfolio.springcore.javaconfig.di.autowiring.manual.ManuallyIdentifiedConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Aleksey Bykov
 * @since 31.08.2020
 */
public class DependencyInjectionTest {

	@Test
	public void testAutowiringWithJavaBasedConfigs() {
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

	@Test
	public void testAutowiringWithAnnotationConfigs() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotationconfig/application-context.xml");
		BeanH beanH = applicationContext.getBean(BeanH.class);

		assertEquals("string", beanH.getBeanC().getBeanD().getString());

		BeanJ beanJ = applicationContext.getBean(BeanJ.class);

		assertEquals("string", beanJ.getBeanC().getBeanD().getString());
	}
}
