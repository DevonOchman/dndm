package dnd.dm.model.story;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.jgrapht.EdgeFactory;
import org.jgrapht.GraphPath;
import org.jgrapht.graph.ClassBasedEdgeFactory;
import org.jgrapht.graph.Pseudograph;
import org.jgrapht.graph.SimpleDirectedGraph;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm.SingleSourcePaths;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.alg.shortestpath.AllDirectedPaths;

public class LocationMap {

	private Location parent;

	private Set<LocationMap> subMaps;

	private SimpleDirectedGraph<Location, Path> map;

	public LocationMap() {
		EdgeFactory<Location, Path> ef = new ClassBasedEdgeFactory<Location, Path>(Path.class);
		setMap(new SimpleDirectedGraph<Location, Path>(ef));

		subMaps = new HashSet<LocationMap>();
	}

	public Location getParent() {
		return parent;
	}

	public void setParent(Location parent) {
		this.parent = parent;
	}

	public SimpleDirectedGraph<Location, Path> getMap() {
		return map;
	}

	public void setMap(SimpleDirectedGraph<Location, Path> map) {
		this.map = map;
	}

	public boolean contains(Location l) {
		return map.containsVertex(l);
	}

	public void consume(LocationMap lm) {
		if (!(parent == null && lm.getParent() == null) || !parent.equals(lm.parent)) {
			throw new IllegalArgumentException("Cannot merge two maps with different parent maps.");
		}
		for (Location l : lm.getMap().vertexSet()) {
			map.addVertex(l);
		}
		for (Path p : lm.getMap().edgeSet()) {
			map.addEdge(p.getLocationA(), p.getLocationB(), p);
		}
		this.subMaps.addAll(lm.subMaps);
	}

	public void addEdge(Location a, Location b, Path a2b) {
		if (!map.containsVertex(a))
			map.addVertex(a);
		if (!map.containsVertex(b))
			map.addVertex(b);
		map.addEdge(a, b, a2b);

	}

	public void addEdge(Path p) {
		addEdge(p.getLocationA(), p.getLocationB(), p);
	}

	public String toString() {
		String s = "";
		AllDirectedPaths<Location, Path> ad = new AllDirectedPaths<Location, Path>(map);
		for (Location v1 : map.vertexSet()) {
			List<GraphPath<Location, Path>> paths = new ArrayList<GraphPath<Location, Path>>();
			for (Location v2 : map.vertexSet()) {
				if (v1 != v2) {
					List<GraphPath<Location, Path>> p = ad.getAllPaths(v1, v2, true, 100);
					paths.addAll(p);
				}
			}
			int i = 0;
		}
		DijkstraShortestPath<Location, Path> paths = new DijkstraShortestPath<Location, Path>(map);
		for (Location v : map.vertexSet()) {
			SingleSourcePaths<Location, Path> p = paths.getPaths(v);
			for (Location v2 : map.vertexSet()) {
				if (v != v2) {
					s += "Path from " + v + " to " + v2 + "\n";
					s += p.getPath(v2) + "\n";
				}
			}
		}
		return s;
	}

}
