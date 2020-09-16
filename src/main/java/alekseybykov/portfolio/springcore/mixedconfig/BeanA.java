package alekseybykov.portfolio.springcore.mixedconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Aleksey Bykov
 * @since 16.09.2020
 */
@Component
public class BeanA {

	private BeanB beanB;

	@Autowired
	public BeanA(BeanB beanB) {
		this.beanB = beanB;
	}

	public String getStringFromDependency() {
		return beanB.getBeanC().getString();
	}
}
