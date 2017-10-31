package dnd.dm.model.story;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { dnd.dm.model.story.StoryBuilderTest.class})
public class StoryBuilderTest {

	StoryBuilder sb;
	/*
	 * Path: townA -> townB -> cavern
	 */
	Location townA;
	Location townB;
	Location cavern;
	
	/*
	 * Interconnected. In townA.
	 */
	Location tavern;
	Location smithy;
	Location shop;
	
	/*
	 * Interconnected. In townB
	 */
	Location mansion;
	Location hideout;
	
	/*
	 * Path: cavern_entrace -> cavern_area1 -> cavern_end
	 * Path: cavern_entrace -> cavern_area2 -> cavern_end
	 * Path: cavern_end -> cavern_entrance (reverse not possible).
	 */
	Location cavern_entrance;
	Location cavern_area1;
	Location cavern_area2;
	Location cavern_end;
	
	@Before
	public void init(){
		List<Fact> facts = new ArrayList<Fact>();
		sb = new StoryBuilder(new Story("Test Story", "Test story description", facts));
		
		facts = new ArrayList<Fact>();
		townA = new Location("TownA", "This is the first town of out adventure", facts);
		facts = new ArrayList<Fact>();
		townB = new Location("TownB", "The second town we come accross", facts);
		facts = new ArrayList<Fact>();
		cavern = new Location("Cavern", "Here the PCs will enter combat for the first time", facts);
		
		facts = new ArrayList<Fact>();
		tavern = new Location("UglyDuckling", "The Tavern in which our PCs meet", facts);
		facts = new ArrayList<Fact>();
		smithy = new Location("Smith", "Here there be weapons", facts);
		facts = new ArrayList<Fact>();
		shop = new Location("Shop", "You can't afford any of this yet", facts);
		
		facts = new ArrayList<Fact>();
		mansion = new Location("Mansion", "Do ye be trying to steal?", facts);
		facts = new ArrayList<Fact>();
		hideout = new Location("Hideout", "What are you hidhing for?", facts);
		
		facts = new ArrayList<Fact>();
		cavern_entrance = new Location("Entry", "Spooky", facts);
		facts = new ArrayList<Fact>();
		cavern_area1 = new Location("Path One", "It seems safer", facts);
		facts = new ArrayList<Fact>();
		cavern_area2 = new Location("Path Two", "The safe path", facts);
		facts = new ArrayList<Fact>();
		cavern_end = new Location("Boss Area", "Make the level 2 moster seem like a big deal", facts);
		
		sb.addLocation(townA);
		sb.addLocation(townB);
		sb.addLocation(cavern);
		
		sb.createSimplePath(townA, townB);
		sb.createSimplePath(townB, cavern);
		
		sb.addLocation(cavern_entrance);
		sb.addLocation(cavern_area1);
		sb.addLocation(cavern_area2);
		sb.addLocation(cavern_end);
		
		sb.createSimplePath(cavern_entrance, cavern_area1);
		sb.createSimplePath(cavern_entrance, cavern_area2);
		sb.createSimplePath(cavern_area1, cavern_end);
		sb.createSimplePath(cavern_area2, cavern_end);
		
		
		System.out.println(sb.getStory());
	}
	
	@Test
	public void testSetStory(){
		Story initStory = sb.getStory();
		Story newStory = new Story("New Test Story", "A new test story description", new ArrayList<Fact>());
		sb.setStory(newStory);
		assertNotSame(initStory, sb.getStory());
	}
}
