package alekseybykov.portfolio.springcore.di.services;

import alekseybykov.portfolio.springcore.di.locators.Locator;
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
		Element element = locator.findElement(searchPath, elementName, id);
		element.normalize();
		return element;
	}
}
