package list2.generic;

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
		assertEquals("a",list.toString());
	}
	@Test
	public void testAddFirst() {
		list.addFirst("a");
		assertEquals("a",list.toString());
	}
	@Test
	public void testAdd2Elements() {
		list.add("a");
		list.add("b");	
		assertEquals("a, b",list.toString());
	}
	@Test
	public void testAdd3Elements() {
		list.add("a");
		list.add("b");	
		list.add("c");	
		assertEquals("a, b, c",list.toString());
	}
	@Test
	public void testAddFirst2Elements() {
		list.addFirst("a");
		list.addFirst("b");	
		assertEquals("b, a",list.toString());
	}
	@Test
	public void testAddFirst3Elements() {
		list.addFirst("a");
		list.addFirst("b");	

		list.addFirst("c");	
		assertEquals("c, b, a",list.toString());
	}
	@Test
	public void testGetIElements() {
		list.add("a");
		list.add("b");	
		list.add("c");	
		list.add("d");
		
		assertEquals("c",list.get(2));
	}
	@Test
	public void testGetIElementsCast() {
		list.add("a");
		list.add("b");	
		list.add("c");	
		list.add("d");
		String actual = list.get(2);
		assertEquals("c",actual);
	}
	@Test
	public void testGetFirstElements() {
		list.add("a");
		list.add("b");	
		list.add("c");	
		list.add("d");
		
		assertEquals("a",list.get(0));
	}
	@Test
	public void testGetNonExistingElements() {
		list.add("a");
		list.add("b");	
		list.add("c");	
		list.add("d");
		
		assertEquals(null,list.get(25));
	}

}
