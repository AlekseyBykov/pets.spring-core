package alekseybykov.portfolio.springcore.di.locators;

import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;

/**
 * @author Aleksey Bykov
 * @since 15.08.2020
 */
public class ElementLocator extends Locator {

	public ElementLocator(String searchPath) throws ParserConfigurationException, IOException, SAXException {
		super(searchPath);
	}

	@Override
	public Element findElementById(String elementName, String id) throws XPathExpressionException {
		XPathExpression xPathExpression = xpath.compile("//" + elementName + "[@id='" + id + "']");
		return (Element) xPathExpression.evaluate(document, XPathConstants.NODE);
	}
}
