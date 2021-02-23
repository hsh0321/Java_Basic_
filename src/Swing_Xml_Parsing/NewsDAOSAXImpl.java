package Swing_Xml_Parsing;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
public class NewsDAOSAXImpl implements INewsDAO {
	List<News> list = new ArrayList<News>();
	@Override
	public List<News> getNewsList(String url) {
		list.clear();
		connectNews(url);
		return list;
	}
	@Override
	public News search(int index) { // 뉴스에서 검색
		return list.get(index);
	}
	public String getDesc(String title) {
		for (News n : list) {
			if (n.getTitle().equals(title)) {
				System.out.println(title);
				return n.getDesc();
			}
		}
		return null;
	}
	private void connectNews(String url) {
		SAXParserFactory f = null;
		try {
			f = SAXParserFactory.newInstance();
			SAXParser p = f.newSAXParser();
			p.parse(new URL(url).openConnection().getInputStream(), new SAXHandler());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	class SAXHandler extends DefaultHandler {
		StringBuilder data = new StringBuilder();
		News n = null;
		public void startElement(String uri, String localName, String qName, Attributes attributes)
				throws SAXException {
			if (qName.equals("item")) {
				n = new News();
			}
			data = new StringBuilder();
		}
		@Override 
		public void characters(char[] ch, int start, int length) throws SAXException {
			data.append(ch, start, length);
		}
		@Override
		public void endElement(String uri, String localName, String qName) throws SAXException {
			if(n == null) return;
			if (qName.equals("title")) {
				n.setTitle(data.toString());
			} else if (qName.equals("link")) {
				n.setLink(data.toString());
			} else if (qName.equals("description")) {
				n.setDesc(data.toString());
			}else if (qName.equals("item")) {
				list.add(n);
			}
		}
	}
}             