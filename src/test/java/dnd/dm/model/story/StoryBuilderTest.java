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
	
	Location l1 = new Location("L1");
	Location l2 = new Location("L2");
	Location l3 = new Location("L3");
	Location l4 = new Location("L4");
	Location l5 = new Location("L5");
	Location l6 = new Location("L6");
	Location l7 = new Location("L7");
	Location l8 = new Location("L8");
	Location l9 = new Location("L9");
	Location l10 = new Location("L10");
	Location l11 = new Location("L11");
	Location l12 = new Location("L12");
	Location l13 = new Location("L13");
	Location l14 = new Location("L14");
	
	OrderedArea ora1 = new OrderedArea("ora1");
	OrderedArea ora2 = new OrderedArea("ora2");
	OrderedArea ora3 = new OrderedArea("ora3");
	
	OpenArea opa1 = new OpenArea("opa1");
	OpenArea opa2 = new OpenArea("opa2");
	
	@Before
	public void init(){
		sb = new StoryBuilder();
		sb.addAreaToRoot(ora1, null);
		sb.addAreaToRoot(opa1, ora1);
		sb.addAreaToRoot(ora2, opa1);
		
		sb.addLocation(ora1, l1, null);
		sb.addLocation(ora1, l2, l1);
		sb.addLocation(ora1, l3, l2);
		sb.addLocation(ora1, l2, l3);
		sb.addLocation(ora1, l4, l2);
		sb.addLocation(ora1, l4, l3);
		
		sb.addLocation(opa1, l5, null);
		sb.addLocation(null, l6, l5);
		sb.addLocation(null, l7, l5);
		
		sb.addLocation(ora2, opa2, null);
		sb.addLocation(null, l10, opa2);
		sb.addLocation(null, ora3, l10);
		
		sb.addLocation(opa2, l8, null);
		sb.addLocation(null, l9, l8);
		
		sb.addLocation(ora3, l11, null);
		sb.addLocation(null, l12, l11);
		sb.addLocation(null, l13, l11);
		sb.addLocation(null, l12, l13);
		sb.addLocation(null, l13, l12);
		sb.addLocation(null, l14, l13);
		int i = 0;
	}
	
	@Test
	public void testSetStory(){

	}
}
