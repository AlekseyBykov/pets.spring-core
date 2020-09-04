package alekseybykov.portfolio.springcore.javaconfig.di.autowiring.annotationconfig.autowired;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Aleksey Bykov
 * @since 02.09.2020
 */
public class BeanJ {

	private BeanC beanC;

	@Autowired
	public BeanJ(BeanC beanC) {
		this.beanC = beanC;
	}

	public BeanC getBeanC() {
		return beanC;
	}

	public void setBeanC(BeanC beanC) {
		this.beanC = beanC;
	}
}
