package alekseybykov.portfolio.springcore.di.autowiring.xml;

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
