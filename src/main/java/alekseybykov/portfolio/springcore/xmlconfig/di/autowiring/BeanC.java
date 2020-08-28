package alekseybykov.portfolio.springcore.xmlconfig.di.autowiring;

/**
 * @author Aleksey Bykov
 * @since 26.08.2020
 */
public class BeanC {

	private BeanD beanD;

	public BeanD getBeanD() {
		return beanD;
	}

	public void setBeanD(BeanD beanD) {
		this.beanD = beanD;
	}
}
