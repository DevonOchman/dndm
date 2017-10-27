package dnd.dm.model.story;

import org.jgrapht.EdgeFactory;
import org.jgrapht.graph.ClassBasedEdgeFactory;
import org.jgrapht.graph.Pseudograph;

public class LocationMap {
	
	private Location parent;
	
	private Pseudograph<Location, Path> map;

	public LocationMap() {
		EdgeFactory<Location, Path> ef = new ClassBasedEdgeFactory<Location, Path>(Path.class);
		setMap(new Pseudograph<Location, Path>(ef));
	}
	
	public Location getParent() {
		return parent;
	}

	public void setParent(Location parent) {
		this.parent = parent;
	}

	public Pseudograph<Location, Path> getMap() {
		return map;
	}

	public void setMap(Pseudograph<Location, Path> map) {
		this.map = map;
	}
	
}
