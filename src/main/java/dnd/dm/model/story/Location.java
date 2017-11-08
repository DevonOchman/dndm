package dnd.dm.model.story;

import java.util.ArrayList;
import java.util.List;

public class Location extends StoryElement {

	private List<Character> characters;

	private List<Item> items;
	
//	private List<Location> subLocations;
	
	public List<Character> getCharacters() {
		return characters;
	}



	public void setCharacters(List<Character> characters) {
		this.characters = characters;
	}

	public Location(String name, String description, List<Fact> facts) {
		super(name, description, facts);
		// TODO Auto-generated constructor stub
	}

	public Location(String name, String description) {
		super(name, description, new ArrayList<Fact>());
		// TODO Auto-generated constructor stub
	}

	public List<Item> getItems() {
		return items;
	}



	public void setItems(List<Item> items) {
		this.items = items;
	}



//	public List<Location> getSubLocations() {
//		return subLocations;
//	}
//
//
//
//	public void setSubLocations(List<Location> subLocations) {
//		this.subLocations = subLocations;
//	}
	

	public void addCharacter(Character c) {
		characters.add(c);
	}
	
	public void addItem(Item i){
		items.add(i);
	}

//	public void addLocation(Location l) {
//		subLocations.add(l);
//	}

}
