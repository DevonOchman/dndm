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
	
	private OrderedArea sArea;
	
	private List<ILocation> fLocations;
	
	public Story(){	
		sArea = new OrderedArea();
		fLocations = new ArrayList<ILocation>();
//		sArea.addExitLocation(l);
//		sArea.addFirstLocation(l);
//		sArea.addLocationAfter(a, b);
//		sArea.addPathBetween(a, b);
//		
	}


	

}
