package Swing_Xml_Parsing;

import java.util.List;

public interface INewsDAO {
	List<News> getNewsList(String url);
	News search(int index);
}
