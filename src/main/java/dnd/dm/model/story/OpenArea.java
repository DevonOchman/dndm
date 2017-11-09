package dnd.dm.model.story;

import java.util.Set;

import org.jgrapht.EdgeFactory;
import org.jgrapht.graph.Multigraph;

public class OpenArea extends AbstractArea<Multigraph<ILocation, Path>> {

	@Override
	public void instantiateMap(EdgeFactory<ILocation, Path> ef) {
		map = new Multigraph<ILocation, Path>(ef);

	}

	@Override
	public void addPathBetween(ILocation a, ILocation b) {
		if (a == null || b == null)
			throw new NullPointerException();
		if (!map.containsVertex(a))
			throw new IllegalArgumentException("ILocation: " + a + " does not exist in this Area.");
		if (!map.containsVertex(b))
			throw new IllegalArgumentException("ILocation: " + b + " does not exist in this Area.");
		for (ILocation l : map.vertexSet()) {
			if (map.getEdge(l, a) == null) {
				map.addEdge(l, a);
			}
			if (map.getEdge(a, l) == null) {
				map.addEdge(a, l);
			}
			if (map.getEdge(b, a) == null) {
				map.addEdge(b, a);
			}
			if (map.getEdge(a, b) == null) {
				map.addEdge(a, b);
			}
			if (map.getEdge(l, b) == null) {
				map.addEdge(l, b);
			}
			if (map.getEdge(b, l) == null) {
				map.addEdge(b, l);
			}
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public <E extends AbstractArea> void consume(E lm) {
		if(!(lm instanceof OpenArea)){
			throw new IllegalArgumentException(lm + " must be an OpenArea to be consumed by this " + this);
		}
		OpenArea oArea = (OpenArea) lm;
		for (ILocation l : oArea.getMap().vertexSet()) {
			map.addVertex(l);
		}
		for (Path p : oArea.getMap().edgeSet()) {
			map.addEdge(p.getLocationA(), p.getLocationB(), p);
		}
		for (ILocation l : oArea.getMap().vertexSet()) {
			this.addPathBetween(this.entry, l);
		}
	}

	@Override
	public Set<ILocation> getAccessibleFrom(ILocation l) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<ILocation> getAccessibleBy(ILocation l) {
		// TODO Auto-generated method stub
		return null;
	}

}
