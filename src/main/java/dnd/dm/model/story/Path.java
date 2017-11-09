package dnd.dm.model.story;


public class Path {
	
	private ILocation locationA;

	private ILocation locationB;

	public Path(ILocation locationA, ILocation locationB) {
		this.locationA = locationA;
		this.locationB = locationB;
	}
	
	public ILocation getLocationA() {
		return locationA;
	}

	public void setLocationA(ILocation locationA) {
		this.locationA = locationA;
	}

	public ILocation getLocationB() {
		return locationB;
	}

	public void setLocationB(ILocation locationB) {
		this.locationB = locationB;
	}

	public String toString() {
		String s = "";
		s += locationA + " --> " + locationB;
		return s;
	}

}
