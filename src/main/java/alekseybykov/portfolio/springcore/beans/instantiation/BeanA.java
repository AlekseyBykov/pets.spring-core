package alekseybykov.portfolio.springcore.beans.instantiation;

/**
 * @author Aleksey Bykov
 * @since 16.08.2020
 */
public class BeanA {

	private BeanB beanB;

	public BeanA(BeanB beanB) {
		this.beanB = beanB;
	}

	public int getIntValue() {
		return beanB.getIntValue();
	}
}
