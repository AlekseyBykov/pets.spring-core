package alekseybykov.portfolio.springcore.javaconfig.di.autowiring.annotationconfig.qualifier.custom;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Aleksey Bykov
 * @since 05.09.2020
 */
public class BeanM {

	private BeanN beanN;

	public BeanN getBeanN() {
		return beanN;
	}

	@Autowired
	@Marker
	public void setBeanN(BeanN beanN) {
		this.beanN = beanN;
	}
}
