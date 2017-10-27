package dnd.dm.model.story;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class StoryElement {

	protected String name;
	
	public StoryElement(String name, String description, List<Fact> facts) {
		super();
		this.name = name;
		this.description = description;
		this.facts = facts;
	}

	protected String description;
	
	protected List<Fact> facts;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Fact> getFacts() {
		List<Fact> copyOf =  new ArrayList<Fact>(this.facts.size());
		Collections.copy(copyOf, this.facts);
		return copyOf;
	}

	public void setFacts(List<Fact> facts) {
		this.facts =  new ArrayList<Fact>(facts.size());
		Collections.copy(this.facts, facts);
	}
}
