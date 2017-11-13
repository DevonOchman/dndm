package dnd.dm.model.story;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.jgrapht.EdgeFactory;
import org.jgrapht.GraphPath;
import org.jgrapht.graph.AbstractBaseGraph;
import org.jgrapht.graph.AbstractGraph;
import org.jgrapht.graph.ClassBasedEdgeFactory;
import org.jgrapht.graph.Pseudograph;
import org.jgrapht.graph.SimpleDirectedGraph;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm.SingleSourcePaths;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.alg.shortestpath.AllDirectedPaths;

public abstract class AbstractArea<T extends AbstractGraph<ILocation, Path>> implements ILocation {

	private String name;

	protected T map;

	protected ILocation entry;

	protected ILocation exit;

	public AbstractArea(String name) {
		this();
		this.setName(name);
	}

	private AbstractArea() {
		EdgeFactory<ILocation, Path> ef = new EdgeFactory<ILocation, Path>() {

			@Override
			public Path createEdge(ILocation a, ILocation b) {
				return new Path(a, b);
			}

		};
		instantiateMap(ef);
	}

	public abstract void instantiateMap(EdgeFactory<ILocation, Path> ef);

	public void addExitLocation(ILocation l) {
		if (l == null)
			throw new NullPointerException("Cannot accept null ILocation as parameter.");
		if (!map.containsVertex(l))
			throw new IllegalArgumentException("Area does not contain ILocation: " + l);
		exit = l;
	}

	public void addFirstLocation(ILocation l) {
		if (l == null)
			throw new NullPointerException("Cannot accept null ILocation as parameter.");
		map.addVertex(l);
		if (entry != null)
			this.addPathBetween(l, entry);
		entry = l;
	}

	/**
	 * Creates an edge (Path) between two existing locations in the Graph.
	 * 
	 * @param a
	 * @param b
	 */
	public abstract void addPathBetween(ILocation a, ILocation b);

	public void addLocationAfter(ILocation a, ILocation b) {
		if (a == null || b == null)
			throw new NullPointerException("Cannot accept null ILocation as parameter.");
		if (entry == null)
			addFirstLocation(a);
		addLocationAfterHelper(a, b);
	}

	protected void addLocationAfterHelper(ILocation a, ILocation b) {
		if (a == null || b == null)
			throw new NullPointerException("Cannot accept null ILocation as parameter.");
		if (!map.containsVertex(a))
			throw new IllegalArgumentException("ILocation: " + a + " not defined in this Area");
		if (!map.containsVertex(b))
			map.addVertex(b);
		addPathBetween(a, b);
	}

	public T getMap() {
		return map;
	}

	public boolean contains(ILocation l) {
		return map.containsVertex(l);
	}

	public ILocation getEntry() {
		return entry;
	}

	public ILocation getExit() {
		return exit;
	}

	@SuppressWarnings("rawtypes")
	public AbstractArea getAreaWith(ILocation l) {
		for (ILocation v : map.vertexSet()) {
			if (v.equals(l)) {
				return this;
			} else if (v instanceof AbstractArea) {
				AbstractArea t = ((AbstractArea) v).getAreaWith(l);
				if (t != null)
					return t;
			}
		}
		return null;
	}

	@SuppressWarnings("rawtypes")
	public abstract <E extends AbstractArea> void consume(E lm);

	/**
	 * 
	 * @param l
	 * @return Set of ILocation which have Edges that start with ILocation l
	 */
	public abstract Set<ILocation> getAccessibleFrom(ILocation l);

	/**
	 * 
	 * @param l
	 * @return Set of ILocation that have Edges that lead to ILocation l
	 */
	public abstract Set<ILocation> getAccessibleBy(ILocation l);

	public String toString() {
		String s = this.getClass().getSimpleName() + " " + name + ": [";
		// AllDirectedPaths<Location, Path> ad = new AllDirectedPaths<Location,
		// Path>(map);
		// for (Location v1 : map.vertexSet()) {
		// List<GraphPath<Location, Path>> paths = new
		// ArrayList<GraphPath<Location, Path>>();
		// for (Location v2 : map.vertexSet()) {
		// if (v1 != v2) {
		// List<GraphPath<Location, Path>> p = ad.getAllPaths(v1, v2, true,
		// 100);
		// paths.addAll(p);
		// }
		// }
		// int i = 0;
		// }
		DijkstraShortestPath<ILocation, Path> paths = new DijkstraShortestPath<ILocation, Path>(map);
		for (ILocation v : map.vertexSet()) {
			SingleSourcePaths<ILocation, Path> p = paths.getPaths(v);
			for (ILocation v2 : map.vertexSet()) {
				if (v != v2) {
					if (map.containsEdge(v, v2)) {
						// s += "Path from " + v + " to " + v2 + "\n";
						s += p.getPath(v2) + "\n";
					}
				}
			}
		}
		return s + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
