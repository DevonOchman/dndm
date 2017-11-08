package dnd.dm.model.story.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import dnd.dm.model.story.Location;
import dnd.dm.model.story.LocationMap;
import dnd.dm.model.story.Path;

public class MapUtils {

	/**
	 * Returns a list of Locations for which there is a Path leading from Location l to them.
	 * @param l
	 * @param map
	 * @return
	 */
	public Set<Location> getLocationsOut(Location l, LocationMap map) {
		Set<Path> paa = map.getMap().outgoingEdgesOf(l);
		Set<Location> locationsAfter = new HashSet<Location>();
		for(Path p : paa){
			if(p.getLocationA().equals(l)){
				locationsAfter.add(p.getLocationB());
			}
		}
		return locationsAfter;
	}

	/**
	 * Returns a list of Locations for which there is a Path leading to Location l.
	 * @param l
	 * @param map
	 * @return
	 */
	public Set<Location> getLocationsIn(Location l, LocationMap map) {
		Set<Path> paa = map.getMap().incomingEdgesOf(l);
		Set<Location> locationsAfter = new HashSet<Location>();
		for(Path p : paa){
			if(p.getLocationB().equals(l)){
				locationsAfter.add(p.getLocationA());
			}
		}
		return locationsAfter;
	}
}
