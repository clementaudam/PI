package parser;




import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class MadcatHandler extends DefaultHandler{
	private StringBuffer buffer;
	private String segmentId;
	private MadcatToDae dae;
	
	private String path;
	
	public MadcatHandler(){
		super();
		dae = new MadcatToDae();
		
	}
	
	public void startElement(String uri, String localName,
			String qName, Attributes attributes) throws SAXException{
				
				if(qName.equals("doc")){
					dae.insertDoc(attributes);
					
				}
				if(qName.equals("writer")){
					dae.insertWriter(attributes);
				}
				if(qName.equals("page")){
					dae.insertPage(attributes);
				}
				if(qName.equals("zone")){
					
				}
				
				
	}
	
	public void characters(char[] ch,int start, int length)
			throws SAXException{
		String lecture = new String(ch,start,length);
		if(buffer != null) buffer.append(lecture);       
	}
	
	
}
