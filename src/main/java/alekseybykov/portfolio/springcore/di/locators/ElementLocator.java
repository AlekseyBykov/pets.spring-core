package alekseybykov.portfolio.springcore.di.locators;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;

/**
 * @author Aleksey Bykov
 * @since 15.08.2020
 */
public class ElementLocator implements Locator {

	private XPath xpath;
	private DocumentBuilder documentBuilder;

	public ElementLocator() throws ParserConfigurationException {
		XPathFactory xpathFactory = XPathFactory.newInstance();
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		documentBuilderFactory.setValidating(false);
		documentBuilder = documentBuilderFactory.newDocumentBuilder();
		xpath = xpathFactory.newXPath();
	}

	@Override
	public Element findElement(String searchPath, String elementName, String id) throws IOException, SAXException, XPathExpressionException {
		Document document = documentBuilder.parse(searchPath);
		return (Element) xpath.compile("//" + elementName + "[@id='" + id + "']").evaluate(document, XPathConstants.NODE);
	}
}
