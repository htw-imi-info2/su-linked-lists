package list3.comparable;

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
	public void testAdd2Elements() {
		list.add("b");	
		list.add("a");
		assertEquals("a, b",list.toString());
	}
	@Test
	public void testAdd3Elements() {
		list.add("c");
		list.add("a");
		list.add("b");	
	
		assertEquals("a, b, c, d",list.toString());
	}
	@Test
	public void testAdd3aElements() {
		list.add("a");
		list.add("b");
		list.add("d");	
		list.add("c");	
		assertEquals("a, b, c, d",list.toString());
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
