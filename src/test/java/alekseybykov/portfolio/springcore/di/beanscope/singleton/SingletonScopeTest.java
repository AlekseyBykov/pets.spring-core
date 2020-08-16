package alekseybykov.portfolio.springcore.di.beanscope.singleton;

import alekseybykov.portfolio.springcore.beanscope.singleton.FirstBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * @author Aleksey Bykov
 * @since 15.08.2020
 */
public class SingletonScopeTest {

	@Test
	public void test() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("scopes/application-context.xml");

		FirstBean instanceOfFirstBean = applicationContext.getBean("firstBean", FirstBean.class);
		FirstBean theSameInstanceOfFirstBean = applicationContext.getBean("firstBean", FirstBean.class);

		assertTrue(instanceOfFirstBean == theSameInstanceOfFirstBean);

		instanceOfFirstBean = applicationContext.getBean("firstBean", FirstBean.class);
		FirstBean anotherInstanceOfFirstBean = applicationContext.getBean("firstBeanToo", FirstBean.class);

		assertFalse(instanceOfFirstBean == anotherInstanceOfFirstBean);
	}
}
