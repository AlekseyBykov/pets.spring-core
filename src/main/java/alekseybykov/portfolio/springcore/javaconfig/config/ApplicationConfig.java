package alekseybykov.portfolio.springcore.javaconfig.config;

import alekseybykov.portfolio.springcore.javaconfig.beans.BeanA;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Aleksey Bykov
 * @since 28.08.2020
 */
@Configuration
public class ApplicationConfig {

	@Bean(name = {"anotherNameForBeanA", "yetAnotherNameForBeanA"})
	public BeanA beanA() {
		return new BeanA();
	}
}
