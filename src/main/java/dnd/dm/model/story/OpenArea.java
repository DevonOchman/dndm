package dnd.dm.model.story;

import java.util.Set;

import org.jgrapht.EdgeFactory;
import org.jgrapht.graph.SimpleWeightedGraph;

public class OpenArea extends AbstractArea<SimpleWeightedGraph<ILocation, Path>> {

	@Override
	public void instantiateMap(EdgeFactory<ILocation, Path> ef) {
		map = new SimpleWeightedGraph<ILocation, Path>(ef);

	}

	public void addLocation(ILocation l) {
		if (l == null)
			throw new NullPointerException();
		if (!map.containsVertex(l)) {
			if(entry == null)
				entry = l;
			map.addVertex(l);
			interconnectAll();
		}
	}
	
	private void interconnectAll(){
		for (ILocation l1 : map.vertexSet()) {
			for (ILocation l2 : map.vertexSet()) {
				if (!l1.equals(l2)) {
					if (map.getEdge(l1, l2) == null) {
						map.addEdge(l1, l2);
					}
					if (map.getEdge(l2, l1) == null) {
						map.addEdge(l2, l1);
					}
				}
			}

		}
	}

	@Override
	public void addPathBetween(ILocation a, ILocation b) {
		if (a == null || b == null)
			throw new NullPointerException();
		if (!map.containsVertex(a))
			throw new IllegalArgumentException("ILocation: " + a + " does not exist in this Area.");
		if (!map.containsVertex(b))
			throw new IllegalArgumentException("ILocation: " + b + " does not exist in this Area.");
		interconnectAll();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public <E extends AbstractArea> void consume(E lm) {
		if (!(lm instanceof OpenArea)) {
			throw new IllegalArgumentException(lm + " must be an OpenArea to be consumed by this " + this);
		}
		OpenArea oArea = (OpenArea) lm;
		for (ILocation l : oArea.getMap().vertexSet()) {
			this.addLocation(l);
		}
		// for (Path p : oArea.getMap().edgeSet()) {
		// map.addEdge(p.getLocationA(), p.getLocationB(), p);
		// }
		// for (ILocation l : oArea.getMap().vertexSet()) {
		// this.addPathBetween(this.entry, l);
		// }
	}

	@Override
	public Set<ILocation> getAccessibleFrom(ILocation l) {
		return map.vertexSet();
	}

	@Override
	public Set<ILocation> getAccessibleBy(ILocation l) {
		return map.vertexSet();
	}

}
