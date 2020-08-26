package alekseybykov.portfolio.springcore.di.collections;

import org.hamcrest.collection.IsMapContaining;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsCollectionContaining.hasItems;

/**
 * @author Aleksey Bykov
 * @since 25.08.2020
 */
public class CollectionsInjectionTest {

	private static ApplicationContext applicationContext;

	@BeforeClass
	public static void setUp() {
		applicationContext = new ClassPathXmlApplicationContext("di/collections/application-context.xml");
	}

	@Test
	public void test() {
		BeanWithCollections beanWithCollections = applicationContext.getBean(BeanWithCollections.class);

		assertThat(beanWithCollections.getList(), hasItems("First value", "Third value", "Second value"));

		assertThat(beanWithCollections.getSet(), hasItems("First value", "Third value", "Second value"));

		assertThat(beanWithCollections.getYetAnotherSet(), hasItems("First value", "Third value", "Second value"));

		assertThat(beanWithCollections.getMap(), IsMapContaining.hasEntry("key1", "First value"));
		assertThat(beanWithCollections.getMap(), IsMapContaining.hasEntry("key2", "Second value"));
		assertThat(beanWithCollections.getMap(), IsMapContaining.hasEntry("key3", "Third value"));
	}
}
