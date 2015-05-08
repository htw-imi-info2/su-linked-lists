package list6.exercise;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
	LinkedList<String> list;

	@Before
	public void setUp() throws Exception {
		list = new LinkedList<>();
	}

	@Test
	public void testAdd() {
		list.add("a");
		list.add("b");
		assertEquals("b, a", list.toString());

	}

	@Test
	public void testSize() {
		assertEquals(0, list.size());
		list.add("b");
		list.add("a");
		assertEquals(2, list.size());

	}

}
