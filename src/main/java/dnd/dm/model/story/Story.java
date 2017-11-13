package dnd.dm.model.story;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * @author DevonOchman
 *
 */
public class Story implements StoryElement {
	
	private OrderedArea rootArea;
	
	private List<ILocation> fLocations;
	
	
	public Story(){	
		rootArea = new OrderedArea("root Area");
		fLocations = new ArrayList<ILocation>();
		// sArea.addExitLocation(l);
		// sArea.addFirstLocation(l);
		// sArea.addLocationAfter(a, b);
		// sArea.addPathBetween(a, b);
		//
	}

	public OrderedArea getRootArea() {
		if (rootArea == null)
			rootArea = new OrderedArea("root Area");
		return rootArea;
	}

	public void addILocation(ILocation iL) {
		if (!fLocations.contains(iL))
			fLocations.add(iL);
	}

	public void createFloatingLocation(Location l) {
		addILocation(l);
	}

	public void createFloatingLocation(String name){
		createFloatingLocation(new Location(name));
	}

	@SuppressWarnings("rawtypes")
	public void createFloatingArea(AbstractArea a){
		addILocation(a);
	}

	public List<ILocation> getfLocations() {
		return fLocations;
	}

	@SuppressWarnings("rawtypes")
	public AbstractArea getAreaWith(ILocation l) {
		AbstractArea area = rootArea.getAreaWith(l);
		if(area != null)
			return area;
		for(ILocation v : fLocations){
			if(v instanceof AbstractArea){
				return ((AbstractArea) v).getAreaWith(l);
			}
		}
		return null;
	}
}
