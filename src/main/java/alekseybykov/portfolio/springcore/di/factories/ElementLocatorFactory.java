package alekseybykov.portfolio.springcore.di.factories;

import alekseybykov.portfolio.springcore.di.locators.ElementLocator;
import alekseybykov.portfolio.springcore.di.locators.Locator;

import javax.xml.parsers.ParserConfigurationException;

/**
 * @author Aleksey Bykov
 * @since 15.08.2020
 */
public class ElementLocatorFactory {
	public static Locator createInstance() throws ParserConfigurationException {
		return new ElementLocator();
	}
}
