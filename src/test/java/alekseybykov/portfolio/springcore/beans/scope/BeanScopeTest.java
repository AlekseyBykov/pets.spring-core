package alekseybykov.portfolio.springcore.beans.scope;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * @author Aleksey Bykov
 * @since 15.08.2020
 */
public class BeanScopeTest {

	private static ApplicationContext applicationContext;

	@BeforeClass
	public static void setUp() {
		applicationContext = new ClassPathXmlApplicationContext("scopes/application-context.xml");
	}

	@Test
	public void testSingletonScope() {
		FirstBean instanceOfFirstBean = applicationContext.getBean("firstBean", FirstBean.class);
		FirstBean theSameInstanceOfFirstBean = applicationContext.getBean("firstBean", FirstBean.class);
		assertTrue(instanceOfFirstBean == theSameInstanceOfFirstBean);

		instanceOfFirstBean = applicationContext.getBean("firstBean", FirstBean.class);
		FirstBean anotherInstanceOfFirstBean = applicationContext.getBean("firstBeanToo", FirstBean.class);
		assertFalse(instanceOfFirstBean == anotherInstanceOfFirstBean);

		instanceOfFirstBean = applicationContext.getBean("firstBean", FirstBean.class);
		theSameInstanceOfFirstBean = applicationContext.getBean("firstBeanNameToo", FirstBean.class);
		assertTrue(instanceOfFirstBean == theSameInstanceOfFirstBean);

		theSameInstanceOfFirstBean = applicationContext.getBean("firstBeanName", FirstBean.class);
		assertTrue(instanceOfFirstBean == theSameInstanceOfFirstBean);
	}

	@Test
	public void testPrototypeScope() {
		ThirdBean thirdBean = applicationContext.getBean(ThirdBean.class);
		ThirdBean anotherInstanceOfThirdBean = applicationContext.getBean(ThirdBean.class);

		assertFalse(thirdBean == anotherInstanceOfThirdBean);
	}
}