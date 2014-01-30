package DAEStructure;
import java.util.ArrayList;


public class Dataset {
	
	private int id;
	private String name;
	private String purpose;
	
	private ArrayList<PageImage> images;
	private DatasetSection content;
	private PageElementPropertyValue writer;
	

	public Dataset(int id, String name, String purpose, ArrayList<PageImage> images) {
		super();
		this.id = id;
		this.name = name;
		this.purpose = purpose;
		this.images = images;
	}
	
	public Dataset(){
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public ArrayList<PageImage> getImages() {
		return images;
	}

	public void setImages(ArrayList<PageImage> images) {
		this.images = images;
	}

	public DatasetSection getContent() {
		return content;
	}

	public void setContent(DatasetSection content) {
		this.content = content;
	}

	public PageElementPropertyValue getWriter() {
		return writer;
	}

	public void setWriter(PageElementPropertyValue writer) {
		this.writer = writer;
	}
	
	

}