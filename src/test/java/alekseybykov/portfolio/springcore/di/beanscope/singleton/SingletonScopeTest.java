package alekseybykov.portfolio.springcore.di.beanscope.singleton;

import alekseybykov.portfolio.springcore.beanscope.singleton.FirstBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static junit.framework.TestCase.assertTrue;

/**
 * @author Aleksey Bykov
 * @since 15.08.2020
 */
public class SingletonScopeTest {

	@Test
	public void testSingletonScope() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("scopes/application-context.xml");

		FirstBean instanceOfBean = applicationContext.getBean(FirstBean.class);
		FirstBean theSameInstanceOfBean = applicationContext.getBean(FirstBean.class);

		assertTrue(instanceOfBean == theSameInstanceOfBean);
	}
}
