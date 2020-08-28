package alekseybykov.portfolio.springcore.xmlconfig.di.setters;

/**
 * @author Aleksey Bykov
 * @since 16.08.2020
 */
public class BeanB {

	private int intValue;
	private BeanA beanA;

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

	public BeanA getBeanA() {
		return beanA;
	}

	public void setBeanA(BeanA beanA) {
		this.beanA = beanA;
	}
}
