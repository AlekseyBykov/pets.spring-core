package alekseybykov.portfolio.springcore.xmlconfig.beans.instantiation;

/**
 * @author Aleksey Bykov
 * @since 16.08.2020
 */
public final class BeanC {

	private static BeanC instance;

	private BeanC() {}

	public static BeanC getInstance() {
		if (instance == null) {
			instance = new BeanC();
		}
		return instance;
	}
}
