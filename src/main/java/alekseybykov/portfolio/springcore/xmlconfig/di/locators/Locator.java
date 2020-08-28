package alekseybykov.portfolio.springcore.xmlconfig.di.locators;

import org.w3c.dom.Element;

/**
 * @author Aleksey Bykov
 * @since 15.08.2020
 */
public interface Locator {
	Element findElement(String searchPath, String elementName, String id) throws Exception;
}
