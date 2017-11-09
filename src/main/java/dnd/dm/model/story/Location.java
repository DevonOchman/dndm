package dnd.dm.model.story;

public class Location implements ILocation, StoryElement {

	private String title;
	
	private String descr;
	
	public Location(){
		this("dTitle", "dDescr");
	}
	
	public Location(String title){
		this(title, "dDescr");
	}

	public Location(String title, String descr) {
		this.title = title;
		this.descr = descr;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String toString(){
		return title;
	}
}
