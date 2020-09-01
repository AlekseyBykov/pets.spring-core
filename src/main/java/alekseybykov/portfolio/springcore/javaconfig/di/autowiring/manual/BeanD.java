package alekseybykov.portfolio.springcore.javaconfig.di.autowiring.manual;

/**
 * @author Aleksey Bykov
 * @since 31.08.2020
 */
public class BeanD {

	private BeanC beanC;

	public BeanD(BeanC beanC) {
		this.beanC = beanC;
	}

	public BeanC getBeanC() {
		return beanC;
	}
}
