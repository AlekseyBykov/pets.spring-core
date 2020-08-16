package alekseybykov.portfolio.springcore.beans.instantiation;

/**
 * @author Aleksey Bykov
 * @since 16.08.2020
 */
public final class BeanB {

	private static BeanB instance;
	private int intValue;

	private BeanB() {}

	public static BeanB getInstance() {
		if (instance == null) {
			instance = new BeanB();
		}
		return instance;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
}
