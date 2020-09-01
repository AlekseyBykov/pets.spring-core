package alekseybykov.portfolio.springcore.javaconfig.di.autowiring.manual;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Aleksey Bykov
 * @since 28.08.2020
 */
@Configuration
public class ManuallyIdentifiedConfig {

	// All the beans here are singletons.

	// Because all the dependencies are identified manually,
	// XML configuration or additional information about
	// base package is not provided.

	@Bean
	public BeanB beanB() {
		BeanB beanB = new BeanB();
		beanB.setString("string");
		return beanB;
	}

	@Bean
	public BeanC beanC() {
		BeanC beanC = new BeanC();
		beanC.setBeanB(beanB());
		return beanC;
	}

	@Bean
	public BeanD beanD() {
		return new BeanD(beanC());
	}
}
