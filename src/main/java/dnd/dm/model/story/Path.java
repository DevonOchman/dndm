package dnd.dm.model.story;

import java.util.List;

public class Path extends StoryElement {

	public Path(String name, String description, List<Fact> facts) {
		super(name, description, facts);
		// TODO Auto-generated constructor stub
	}

	public Path(String name, String description, List<Fact> facts, Location locationA, Location locationB) {
		super(name, description, facts);
		this.locationA = locationA;
		this.locationB = locationB;
	}

	private Location locationA;

	private Location locationB;

	public Location getLocationA() {
		return locationA;
	}

	public void setLocationA(Location locationA) {
		this.locationA = locationA;
	}

	public Location getLocationB() {
		return locationB;
	}

	public void setLocationB(Location locationB) {
		this.locationB = locationB;
	}

	public String toString() {
		String s = "";
		s += locationA + " to " + locationB;
		return s;
	}

}
