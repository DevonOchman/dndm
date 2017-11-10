package dnd.dm.model.story;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.jgrapht.graph.ListenableUndirectedWeightedGraph;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;
import org.jgrapht.graph.SimpleWeightedGraph;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { dnd.dm.model.story.OpenArea.class })
public class OpenAreaTest {

	OpenArea oArea;

	@Before
	public void init() {
		oArea = new OpenArea();

		assertEquals(SimpleWeightedGraph.class, oArea.getMap().getClass());
	}
	
	@Test
	public void testAddLocation(){
		OpenArea oa = new OpenArea();
		Location l = new Location("1", "nn");
		oa.addLocation(l);
		assertTrue(oa.getMap().containsVertex(l));
	}
	
	@Test
	public void testConsume(){
		OpenArea oa1 = new OpenArea();
		OpenArea oa2 = new OpenArea();
		OpenArea oa3 = new OpenArea();
		Location l1 = new Location("1", "nn");
		Location l2 = new Location("2", "nn");
		Location l3 = new Location("3", "nn");
		Location l4 = new Location("4", "nn");
		oa1.addFirstLocation(l1);
		oa1.addLocationAfter(l1, l2);

		oa2.addFirstLocation(l3);
		oa2.addLocationAfter(l3, l4);
		
		oa1.consume(oa2);
		
		oa3.addFirstLocation(l1);
		oa3.addLocationAfter(l1, l2);
		oa3.addLocationAfter(l2, l3);
		oa3.addLocationAfter(l3, l4);

		assertEquals(oa3.toString(),oa1.toString());
	}
	
	@Test
	public void testContains(){
		OpenArea oa = new OpenArea();
		Location l = new Location("not default", "nn");
		assertFalse(oa.contains(l));
		assertFalse(oa.contains(null));
		oa.addFirstLocation(l);
		assertTrue(oa.contains(l));
	}
	
	@Test
	public void testAddFirstLocation() {
		OpenArea oa = new OpenArea();
		Location l = new Location("not default", "nn");
		oa.addFirstLocation(l);
		assertEquals(l, oa.getEntry());
		try {
			oa.addFirstLocation(null);
			fail();
		} catch (NullPointerException e) {
		}
	}

	@Test
	public void testAddExitLocation() {
		OpenArea oa = new OpenArea();
		Location l = new Location("not default", "nn");
		oa.addFirstLocation(l);
		oa.addExitLocation(l);
		assertEquals(l, oa.getExit());
		try {
			oa.addExitLocation(null);
			fail();
		} catch (NullPointerException e) {
		}
	}
	
	@Test
	public void testAddLocationAfter() {
		Location l1 = new Location("not default", "nn");
		Location l2 = new Location("After", "nn");
		OpenArea oa = new OpenArea();
		try {
			oa.addLocationAfter(null, l2);
			fail();
		} catch (NullPointerException e) {
		}
		oa = new OpenArea();
		try {
			oa.addLocationAfter(l1, null);
			fail();
		} catch (NullPointerException e) {
		}
		oa = new OpenArea();
		oa.addFirstLocation(l1);
		try {
			oa.addLocationAfter(l2, l1);
			fail();
		} catch (IllegalArgumentException e) {
		}
		oa.addLocationAfter(l1, l2);
		Path p = oa.getMap().getEdge(l1, l2);
		assertNotNull(p);

		oa = new OpenArea();
		oa.addFirstLocation(l1);
		oa.addLocationAfter(l1, l2);
		p = oa.getMap().getEdge(l1, l2);
		assertNotNull(p);
	}
	
	@Test
	public void testAddPathBetween() {
		Location l1 = new Location("not default", "nn");
		Location l2 = new Location("After", "nn");
		Location l3 = new Location("Third", "nn");
		OpenArea oa = new OpenArea();
		try {
			oa.addPathBetween(null, l2);
			fail();
		} catch (NullPointerException e) {
		}
		oa = new OpenArea();
		try {
			oa.addPathBetween(l1, null);
			fail();
		} catch (NullPointerException e) {
		}

		oa = new OpenArea();
		try {
			oa.addPathBetween(l1, l2);
			fail();
		} catch (IllegalArgumentException e) {
		}

		oa = new OpenArea();
		oa.addFirstLocation(l1);
		oa.addLocationAfter(l1, l2);
		oa.addLocationAfter(l2, l3);

		oa.addPathBetween(l1, l3);

		Path p = oa.getMap().getEdge(l1, l3);
		assertNotNull(p);
	}
}
