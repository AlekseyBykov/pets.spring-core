package alekseybykov.portfolio.springcore.di.services;

import alekseybykov.portfolio.springcore.di.locators.Locator;
import org.w3c.dom.Element;

import javax.xml.xpath.XPathExpressionException;

/**
 * @author Aleksey Bykov
 * @since 15.08.2020
 */
public class ElementSearchService {

	private Locator locator;

	public ElementSearchService(Locator locator) {
		this.locator = locator;
	}

	public Element find(String elementName, String id) throws XPathExpressionException {
		Element element = locator.findElementById(elementName, id);
		element.normalize();
		return element;
	}
}
