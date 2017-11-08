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
public class Story extends StoryElement {

	private Set<Location> unmappedLocations;

	private Set<Character> characters;

	private List<Item> items;

	private Set<LocationMap> grandMap;

	public Set<LocationMap> getGrandMap() {
		return grandMap;
	}

	public void setGrandMap(Set<LocationMap> grandMap) {
		this.grandMap = grandMap;
	}

	public Story(String name, String description, List<Fact> facts) {
		super(name, description, facts);
		unmappedLocations = new HashSet<Location>();
		characters = new HashSet<Character>();
		items = new ArrayList<Item>();
		grandMap = new HashSet<LocationMap>();
	}
	
	public Story(String name, String description){
		this(name, description, new ArrayList<Fact>());
	}

	public Set<Location> getLocations() {
		return unmappedLocations;
	}

	public void setLocations(Set<Location> locations) {
		this.unmappedLocations = locations;
	}

	public void addLocation(Location l) {
		this.unmappedLocations.add(l);
	}

	public Set<Character> getCharacters() {
		return characters;
	}

	public void setCharacters(Set<Character> characters) {
		this.characters = characters;
	}

	public void addCharacter(Character c) {
		this.characters.add(c);
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public void addItem(Item i) {
		this.items.add(i);
	}

	public void addPathBetween(Location a, Location b, Path a2b) {
		LocationMap withA = mapContaining(a);
		LocationMap withB = mapContaining(b);
		boolean mappedA = isMapped(a);
		boolean mappedB = isMapped(b);
		if (withA == null && mappedA)
			throw new IllegalArgumentException("Location: " + a + " is not a part of this Story");
		if (withB == null && mappedB)
			throw new IllegalArgumentException("Location: " + b + " is not a part of this Story");

		if (!mappedA && !mappedB) {
			LocationMap newMap = new LocationMap();
			newMap.addEdge(a, b, a2b);
			grandMap.add(newMap);
			removeFromUnmapped(a);
			removeFromUnmapped(b);
		} else {
			if (withA != null) {
				if (withB == null) {
					withA.addEdge(a, b, a2b);
					removeFromUnmapped(b);
				} else if (withA.contains(b)) {
					withA.addEdge(a, b, a2b);
				} else {
					withA.consume(withB);
					withA.addEdge(a, b, a2b);
					grandMap.remove(withB);
				}
			} else {
				withB.addEdge(a, b, a2b);
				removeFromUnmapped(a);
			}
		}

	}

	private void removeFromUnmapped(Location l) {
		this.unmappedLocations.remove(l);

	}

	private boolean isMapped(Location l) {
		return !this.unmappedLocations.contains(l);
	}

	private LocationMap mapContaining(Location l) {
		for (LocationMap lm : grandMap) {
			if (lm.contains(l)) {
				return lm;
			}
		}
		return null;
	}

	public String toString() {
		String s = "";
		for (LocationMap lm : grandMap) {
			s += lm.toString() + "\n";
		}
		return s;
	}

}
