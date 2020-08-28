package alekseybykov.portfolio.springcore.xmlconfig.di.services;

import alekseybykov.portfolio.springcore.xmlconfig.di.locators.Locator;
import org.w3c.dom.Element;

/**
 * @author Aleksey Bykov
 * @since 15.08.2020
 */
public class ElementSearchService {

	private Locator locator;

	public ElementSearchService(Locator locator) {
		this.locator = locator;
	}

	public Element findElement(String searchPath, String elementName, String id) throws Exception {
		return locator.findElement(searchPath, elementName, id);
	}
}
