package dnd.dm.model.story;

import java.util.HashSet;
import java.util.Set;

import org.jgrapht.EdgeFactory;
import org.jgrapht.graph.AbstractBaseGraph;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

public class OrderedArea extends AbstractArea<SimpleDirectedWeightedGraph<ILocation,Path>>{

	@Override
	public void instantiateMap(EdgeFactory<ILocation, Path> ef) {
		this.map = new SimpleDirectedWeightedGraph<ILocation,Path>(ef);
	}

	@Override
	public void addPathBetween(ILocation a, ILocation b) {
		if(a == null || b == null)
			throw new NullPointerException();
		if(!map.containsVertex(a))
			throw new IllegalArgumentException("ILocation: " + a + " does not exist in this Area.");
		if(!map.containsVertex(b))
			throw new IllegalArgumentException("ILocation: " + b + " does not exist in this Area.");
//		map.addEdge(a, b, p);
		map.addEdge(a, b);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public <E extends AbstractArea> void consume(E lm) {
		if(!(lm instanceof OrderedArea)){
			throw new IllegalArgumentException(lm + " must be an OrderedArea to be consumed by this " + this);
		}
		OrderedArea oArea = (OrderedArea) lm;
		for (ILocation l : oArea.getMap().vertexSet()) {
			map.addVertex(l);
		}
		for (Path p : oArea.getMap().edgeSet()) {
			map.addEdge(p.getLocationA(), p.getLocationB(), p);
		}
	}




}
