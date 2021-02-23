package Swing_Xml_Parsing;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class NewsDAODOMImpl implements INewsDAO{
	List<News> list;
	
	public List<News> getNewsList(String url) {
		return list;
	}
	
	public News search(int index) {
		return list.get(index);
	}
	
	private void connetNews(String url) {
		File file = new File(url);
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		
		News news = new News();
		String date = "";
		
		try {
			
			builder = factory.newDocumentBuilder();
			Document doc = builder.parse(file);
			doc.getDocumentElement().normalize();

			Element root = doc.getDocumentElement();
			System.out.println("Root element : " + root.getNodeName());

			NodeList childNodes = root.getChildNodes();

			for(int i = 0; i < childNodes.getLength(); i++){
				Node node = childNodes.item(i);
				if(node.getNodeType() == Node.ELEMENT_NODE){
					
					Element element = (Element) node;
					String textContent = element.getTextContent();
					String nodeName = element.getNodeName();
					switch( nodeName ) {
						case "title" 	: 
							System.out.println("author : " + textContent); 
							news.setTitle(textContent); 
							break;
						case "description" 	: 
							System.out.println("about : " + textContent); 
							news.setDesc(textContent); 
							break;
						case "link" 	: 
							System.out.println("about : " + textContent); 
							news.setLink(textContent); 
							break;					}
				}
			}

		} catch (SAXException | ParserConfigurationException | IOException e1) {
			e1.printStackTrace();
		}
		
		System.out.println(news);
	}
}
