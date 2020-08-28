package alekseybykov.portfolio.springcore.xmlconfig.di.constructors;

/**
 * @author Aleksey Bykov
 * @since 16.08.2020
 */
public class BeanA {

	private String stringValue;
	private int intValue;

	public BeanA(String stringValue) {
		this.stringValue = stringValue;
	}

	public BeanA(int intValue) {
		this.intValue = intValue;
	}

	public String getStringValue() {
		return stringValue;
	}

	public int getIntValue() {
		return intValue;
	}
}
