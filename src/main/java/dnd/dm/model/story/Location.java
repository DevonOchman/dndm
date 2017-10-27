package dnd.dm.model.story;

import java.util.List;

public class Location extends  StoryElement {
	
	public Location(String name, String description, List<Fact> facts) {
		super(name, description, facts);
		// TODO Auto-generated constructor stub
	}

	private List<LocationMap> subLocations;
	
}
