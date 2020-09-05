package alekseybykov.portfolio.springcore.javaconfig.di.autowiring.annotationconfig.qualifier.ootb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Aleksey Bykov
 * @since 05.09.2020
 */
@Component
public class BeanZ {

	private Bean bean;

	public Bean getBean() {
		return bean;
	}

	@Autowired
	@Qualifier(value = "marked")
	public void setBean(Bean bean) {
		this.bean = bean;
	}
}
