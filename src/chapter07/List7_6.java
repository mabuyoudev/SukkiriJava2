// XMLファイルを読み込むコード	

package chapter07;

import javax.xml.parsers.*;

import org.w3c.dom.*;

import java.io.*;

public class List7_6 {

	public static void main(String[] args) throws Exception {
		String filePath	= "/Users/yusukemabuchi/Documents/Temporary/xmlsample.xml";
		InputStream is	= new FileInputStream(filePath);
		Document doc	= DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
		
		Element hero	= doc.getDocumentElement();
		Element weapon	= findChildByTag(hero, "weapon");
		Element power	= findChildByTag(weapon, "power");
		String value	= power.getTextContent();
		
		System.out.println(value);
		is.close();
	}
	
	// 指定された名前を持つタグの最初の子タグを返す
	static Element findChildByTag(Element self, String name) throws Exception {
		NodeList children = self.getChildNodes();
		
		for(int i = 0; i < children.getLength(); i++) {
			if(children.item(i) instanceof Element) {
				Element e = (Element) children.item(i);
				if(e.getTagName().equals(name)){
					return e;
				}
			}
		}
		return null;
	}

}
