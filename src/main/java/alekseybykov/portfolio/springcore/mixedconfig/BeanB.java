package alekseybykov.portfolio.springcore.mixedconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Aleksey Bykov
 * @since 16.09.2020
 */
@Component
public class BeanB {

	private BeanC beanC;

	@Autowired
	public void setBeanC(BeanC beanC) {
		this.beanC = beanC;
	}

	public BeanC getBeanC() {
		return beanC;
	}
}
