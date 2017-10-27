package dnd.dm.model.story;

import java.util.List;

public class Story extends StoryElement {
	
	private List<Location> locations;

	private List<Character> characters;
	
	private List<Item> items;

	public Story(String name, String description, List<Fact> facts) {
		super(name, description, facts);
		// TODO Auto-generated constructor stub
	}
	
	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}
	
	public void addLocation(Location l){
		this.locations.add(l);
	}

	public List<Character> getCharacters() {
		return characters;
	}

	public void setCharacters(List<Character> characters) {
		this.characters = characters;
	}
	
	public void addCharacter(Character c){
		this.characters.add(c);
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	public void addItem(Item i){
		this.items.add(i);
	}

}
