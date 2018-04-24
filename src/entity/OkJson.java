package entity;
import java.util.ArrayList;

//import org.codehaus.jackson.annotate.JsonIgnoreProperties;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class OkJson extends Json{
	private int count;
	private ArrayList<Record> data;
	
	public OkJson() {
		super();
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public ArrayList<Record> getData() {
		return data;
	}

	public void setData(ArrayList<Record> data) {
		this.data = data;
	}
}
