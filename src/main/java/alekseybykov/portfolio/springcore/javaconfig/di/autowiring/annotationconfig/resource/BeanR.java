package alekseybykov.portfolio.springcore.javaconfig.di.autowiring.annotationconfig.resource;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Aleksey Bykov
 * @since 05.09.2020
 */
@Component
public class BeanR {

	private Bean bean;

	public Bean getBean() {
		return bean;
	}

	// The similar:
	// @Autowired
	// @Qualifier(value = "beanP")
	@Resource
	public void setBeanP(Bean bean) {
		this.bean = bean;
	}
}
