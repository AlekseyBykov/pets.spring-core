package alekseybykov.portfolio.springcore.javaconfig.di.autowiring.annotationconfig.qualifier.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author Aleksey Bykov
 * @since 05.09.2020
 */
public class BeanK {

	private BeanL beanL;

	public BeanL getBeanL() {
		return beanL;
	}

	@Autowired
	@Qualifier(value = "marked")
	public void setBeanL(BeanL beanL) {
		this.beanL = beanL;
	}
}
