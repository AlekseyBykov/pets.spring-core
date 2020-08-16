package alekseybykov.portfolio.springcore.di.constructors;

/**
 * @author Aleksey Bykov
 * @since 16.08.2020
 */
public class BeanB {

	private String firstStringValue;
	private String secondStringValue;

	public BeanB(String firstStringValue, String secondStringValue) {
		this.firstStringValue = firstStringValue;
		this.secondStringValue = secondStringValue;
	}

	public String getFirstStringValue() {
		return firstStringValue;
	}

	public String getSecondStringValue() {
		return secondStringValue;
	}
}
