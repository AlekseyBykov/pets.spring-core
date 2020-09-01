package alekseybykov.portfolio.springcore.javaconfig.di.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Aleksey Bykov
 * @since 31.08.2020
 */
@Component
public class BeanG {

	private BeanF beanF;

	@Autowired
	public BeanG(BeanF beanF) {
		this.beanF = beanF;
	}

	public BeanF getBeanF() {
		return beanF;
	}
}
