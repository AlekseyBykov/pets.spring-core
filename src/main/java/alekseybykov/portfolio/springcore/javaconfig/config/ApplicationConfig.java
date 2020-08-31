package alekseybykov.portfolio.springcore.javaconfig.config;

import alekseybykov.portfolio.springcore.javaconfig.beans.di.BeanB;
import alekseybykov.portfolio.springcore.javaconfig.beans.di.BeanC;
import alekseybykov.portfolio.springcore.javaconfig.beans.di.BeanD;
import alekseybykov.portfolio.springcore.javaconfig.beans.retrieving.BeanA;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Aleksey Bykov
 * @since 28.08.2020
 */
@Configuration
public class ApplicationConfig {

	// All the beans here are singletons.

	@Bean(name = {"anotherNameForBeanA", "yetAnotherNameForBeanA"})
	public BeanA beanA() {
		return new BeanA();
	}

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
