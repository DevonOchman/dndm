package dnd.dm.model.story;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.jgrapht.graph.SimpleDirectedWeightedGraph;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { dnd.dm.model.story.OrderedArea.class })
public class OrderedAreaTest {

	OrderedArea oArea;

	@Before
	public void init() {
		oArea = new OrderedArea("Test Ordered Area");

		assertEquals(SimpleDirectedWeightedGraph.class, oArea.getMap().getClass());
	}

	@Test
	public void testGetAccessibleBy() {
		OrderedArea oa = new OrderedArea("Test Ordered Area");
		Location l1 = new Location("1", "nn");
		Location l2 = new Location("2", "nn");
		Location l3 = new Location("3", "nn");
		Location l4 = new Location("4", "nn");

		oa.addFirstLocation(l1);
		oa.addLocationAfter(l1, l2);
		oa.addFirstLocation(l3);
		oa.addLocationAfter(l3, l4);

		Set<ILocation> expected = new HashSet<ILocation>();
		expected.add(l3);
		assertEquals(expected, oa.getAccessibleBy(l4));
	}

	@Test
	public void testGetAccessibleFrom() {
		OrderedArea oa = new OrderedArea("Test Ordered Area");
		Location l1 = new Location("1", "nn");
		Location l2 = new Location("2", "nn");
		Location l3 = new Location("3", "nn");
		Location l4 = new Location("4", "nn");

		oa.addFirstLocation(l1);
		oa.addLocationAfter(l1, l2);
		oa.addFirstLocation(l3);
		oa.addLocationAfter(l3, l4);

		Set<ILocation> expected = new HashSet<ILocation>();
		expected.add(l1);
		expected.add(l4);
		assertEquals(expected, oa.getAccessibleFrom(l3));
	}

	@Test
	public void testConsume() {
		OrderedArea oa1 = new OrderedArea("Test Ordered Area");
		OrderedArea oa2 = new OrderedArea("Test Ordered Area");
		OrderedArea oa3 = new OrderedArea("Test Ordered Area");
		Location l1 = new Location("1", "nn");
		Location l2 = new Location("2", "nn");
		Location l3 = new Location("3", "nn");
		Location l4 = new Location("4", "nn");
		oa1.addFirstLocation(l1);
		oa1.addLocationAfter(l1, l2);

		oa2.addFirstLocation(l3);
		oa2.addLocationAfter(l3, l1);
		oa2.addLocationAfter(l3, l4);

		oa1.consume(oa2);

		oa3.addFirstLocation(l1);
		oa3.addLocationAfter(l1, l2);
		oa3.addFirstLocation(l3);
		oa3.addLocationAfter(l3, l4);

		assertEquals(oa3.toString(), oa1.toString());

	}

	@Test
	public void testContains() {
		OrderedArea oa = new OrderedArea("Test Ordered Area");
		Location l = new Location("not default", "nn");
		assertFalse(oa.contains(l));
		assertFalse(oa.contains(null));
		oa.addFirstLocation(l);
		assertTrue(oa.contains(l));
	}

	@Test
	public void testAddFirstLocation() {
		OrderedArea oa = new OrderedArea("Test Ordered Area");
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
		OrderedArea oa = new OrderedArea("Test Ordered Area");
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
		OrderedArea oa = new OrderedArea("Test Ordered Area");
		try {
			oa.addLocationAfter(null, l2);
			fail();
		} catch (NullPointerException e) {
		}
		oa = new OrderedArea("Test Ordered Area");
		try {
			oa.addLocationAfter(l1, null);
			fail();
		} catch (NullPointerException e) {
		}
		oa = new OrderedArea("Test Ordered Area");
		oa.addFirstLocation(l1);
		try {
			oa.addLocationAfter(l2, l1);
			fail();
		} catch (IllegalArgumentException e) {
		}
		oa.addLocationAfter(l1, l2);
		Path p = oa.getMap().getEdge(l1, l2);
		assertNotNull(p);

		oa = new OrderedArea("Test Ordered Area");
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
		OrderedArea oa = new OrderedArea("Test Ordered Area");
		try {
			oa.addPathBetween(null, l2);
			fail();
		} catch (NullPointerException e) {
		}
		oa = new OrderedArea("Test Ordered Area");
		try {
			oa.addPathBetween(l1, null);
			fail();
		} catch (NullPointerException e) {
		}

		oa = new OrderedArea("Test Ordered Area");
		try {
			oa.addPathBetween(l1, l2);
			fail();
		} catch (IllegalArgumentException e) {
		}

		oa = new OrderedArea("Test Ordered Area");
		oa.addFirstLocation(l1);
		oa.addLocationAfter(l1, l2);
		oa.addLocationAfter(l2, l3);

		oa.addPathBetween(l1, l3);

		Path p = oa.getMap().getEdge(l1, l3);
		assertNotNull(p);
	}
}
