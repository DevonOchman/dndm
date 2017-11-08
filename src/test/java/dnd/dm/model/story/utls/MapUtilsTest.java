package dnd.dm.model.story.utls;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import dnd.dm.model.story.Fact;
import dnd.dm.model.story.Location;
import dnd.dm.model.story.LocationMap;
import dnd.dm.model.story.Path;
import dnd.dm.model.story.utils.MapUtils;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { dnd.dm.model.story.utils.MapUtils.class})
public class MapUtilsTest {
	
	private LocationMap lm;
	
	private MapUtils mu;
	
	/*
	 * Path: cavern_entrace <-> cavern_area1 <-> cavern_end
	 * Path: cavern_entrace <-> cavern_area2 <-> cavern_end
	 * Path: cavern_end -> cavern_entrance
	 */
	Location cavern_entrance;
	Location cavern_area1;
	Location cavern_area2;
	Location cavern_end;

	@Before
	public void init(){
		lm = new LocationMap();
		

		cavern_entrance = new Location("Entry", "Spooky");
		cavern_area1 = new Location("Path One", "It seems safer");
		cavern_area2 = new Location("Path Two", "The safe path");
		cavern_end = new Location("Boss Area", "Make the level 2 moster seem like a big deal");
		
		Path p1a = new Path(cavern_entrance, cavern_area1);
		Path p1b = new Path(cavern_area1,cavern_entrance);
		
		Path p2a = new Path(cavern_entrance, cavern_area2);
		Path p2b = new Path(cavern_area2, cavern_entrance);
		
		Path p3a = new Path(cavern_area1, cavern_end);
		Path p3b = new Path(cavern_end, cavern_area1);
		
		Path p4a = new Path(cavern_area2, cavern_end);
		Path p4b = new Path(cavern_end, cavern_area2);
		
		Path p5 = new Path(cavern_end, cavern_entrance);
		
		lm.addEdge(p1a);
		lm.addEdge(p1b);
		lm.addEdge(p2a);
		lm.addEdge(p2b);
		lm.addEdge(p3a);
		lm.addEdge(p3b);
		lm.addEdge(p4a);
		lm.addEdge(p4b);
		lm.addEdge(p5);
	}
	
	@Test
	public void testGetLocationsOut(){
		mu = new MapUtils();
		Set<Location> expected = new HashSet<Location>();
		expected.add(cavern_area1);
		expected.add(cavern_area2);
		assertEquals(expected, mu.getLocationsOut(cavern_entrance, lm));
	}
	@Test
	public void testGetLocationsIn(){
		mu = new MapUtils();
		Set<Location> expected = new HashSet<Location>();
		expected.add(cavern_area1);
		expected.add(cavern_area2);
		expected.add(cavern_end);
		assertEquals(expected, mu.getLocationsIn(cavern_entrance, lm));
	}
}
