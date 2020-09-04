package alekseybykov.portfolio.springcore.javaconfig.di.autowiring.annotationconfig.autowired;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Aleksey Bykov
 * @since 01.09.2020
 */
public class BeanC {

	private BeanD beanD;

	public BeanD getBeanD() {
		return beanD;
	}

	@Autowired
	public void setBeanD(BeanD beanD) {
		this.beanD = beanD;
	}
}
