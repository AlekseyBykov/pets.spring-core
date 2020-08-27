package alekseybykov.portfolio.springcore.di.autowiring.xml;

/**
 * @author Aleksey Bykov
 * @since 27.08.2020
 */
public class BeanE {

	private BeanF beanF;

	public BeanE(BeanF beanF) {
		this.beanF = beanF;
	}

	public BeanF getBeanF() {
		return beanF;
	}
}
