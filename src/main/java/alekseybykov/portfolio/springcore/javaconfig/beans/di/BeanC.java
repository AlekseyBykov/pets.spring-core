package alekseybykov.portfolio.springcore.javaconfig.beans.di;

/**
 * @author Aleksey Bykov
 * @since 31.08.2020
 */
public class BeanC {

	private BeanB beanB;

	public BeanB getBeanB() {
		return beanB;
	}

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}
}
