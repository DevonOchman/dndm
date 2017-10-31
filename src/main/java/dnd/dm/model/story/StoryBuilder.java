package dnd.dm.model.story;

import static org.mockito.Matchers.anyByte;

import java.util.ArrayList;

public class StoryBuilder {

	private Story story;

	public StoryBuilder(Story story) {
		this.story = story;
	}

	public void setStory(Story story) {
		this.story = story;
	}

	public void addCharacter(Character c) {
		this.story.addCharacter(c);
	}

	public void addLocation(Location l) {
		this.story.addLocation(l);
	}

	public void addItem(Item i) {
		this.story.addItem(i);
	}

	public void setLocation(Location l, Character c) {
		l.addCharacter(c);
	}

	public void setLocation(Location l, Item i) {
		l.addItem(i);
	}

//	public void setLocation(Location a, Location b) {
//		a.addLocation(b);
//	}

	public Story getStory() {
		return story;
	}

	public void createSimplePath(Location a, Location b) {
		Path a2b = new Path("Simple Path " + a.getName() + ", " + b.getName(),
				"This is a simple path connecting " + a.getName() + " and " + b.getName(), new ArrayList<Fact>(), a, b);

		this.story.addPathBetween(a, b, a2b);
	}

}
