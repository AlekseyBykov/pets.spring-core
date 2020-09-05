package alekseybykov.portfolio.springcore.javaconfig.di.autowiring.annotationconfig;

import alekseybykov.portfolio.springcore.javaconfig.di.autowiring.annotationconfig.autowired.BeanA;
import alekseybykov.portfolio.springcore.javaconfig.di.autowiring.annotationconfig.autowired.BeanH;
import alekseybykov.portfolio.springcore.javaconfig.di.autowiring.annotationconfig.autowired.BeanJ;
import alekseybykov.portfolio.springcore.javaconfig.di.autowiring.annotationconfig.qualifier.ootb.BeanZ;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * @author Aleksey Bykov
 * @since 05.09.2020
 */
public class AutowiringWithAnnotationConfigsTest {

	private static final String ROOT = "javaconfig.di.autowiring.annotationconfig";

	@Test
	public void testInjectionUsingAutowiredAnnotation() {
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext(ROOT.concat("/autowired/application-context.xml"));
		BeanH beanH = applicationContext.getBean(BeanH.class);

		assertEquals("string", beanH.getBeanC().getBeanD().getString());

		BeanJ beanJ = applicationContext.getBean(BeanJ.class);

		assertEquals("string", beanJ.getBeanC().getBeanD().getString());
	}

	@Test
	public void testInjectionUsingQualifierAnnotation() {
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext(ROOT.concat("/qualifier/application-context.xml"));

		BeanZ beanZ = applicationContext.getBean(BeanZ.class);
		assertEquals("beanY", beanZ.getBean().getString());
	}

	@Test
	public void testInjectionUsingValueAnnotation() {
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext(ROOT.concat("/autowired/application-context.xml"));

		BeanA beanA = applicationContext.getBean(BeanA.class);
		assertEquals("string", beanA.getString());
	}
}
