package alekseybykov.portfolio.springcore.javaconfig.beans.di.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Aleksey Bykov
 * @since 31.08.2020
 */
@Component
public class BeanF {

	private BeanE beanE;

	@Autowired
	public void setBeanE(BeanE beanE) {
		this.beanE = beanE;
	}

	public BeanE getBeanE() {
		return beanE;
	}
}
