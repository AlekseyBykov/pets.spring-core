package alekseybykov.portfolio.springcore.javaconfig.beans.retrieving;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Aleksey Bykov
 * @since 28.08.2020
 */
@Configuration
public class ApplicationConfig {

	// All the beans here are singletons.

	// Because all the dependencies are identified manually,
	// XML configuration is not required.

	@Bean(name = {"anotherNameForBeanA", "yetAnotherNameForBeanA"})
	public BeanA beanA() {
		return new BeanA();
	}
}
