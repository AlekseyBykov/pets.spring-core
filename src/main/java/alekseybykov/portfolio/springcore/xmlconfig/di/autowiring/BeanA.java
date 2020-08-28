package alekseybykov.portfolio.springcore.xmlconfig.di.autowiring;

/**
 * @author Aleksey Bykov
 * @since 26.08.2020
 */
public class BeanA {

	private BeanB beanB;

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}

	public BeanB getBeanB() {
		return beanB;
	}
}
