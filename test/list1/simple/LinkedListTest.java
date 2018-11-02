package list1.simple;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {


	@Test
	public void testAdd() {
		LinkedList list = new LinkedList();
		list.add("a");
		assertEquals("a",list.toString());
	}
	@Test
	public void testAddFirst() {
		LinkedList list = new LinkedList();
		list.addFirst("a");
		assertEquals("a",list.toString());
	}
	@Test
	public void testAdd2Elements() {
		LinkedList list = new LinkedList();
		list.add("a");
		list.add("b");	
		assertEquals("a, b",list.toString());
	}
	@Test
	public void testAdd3Elements() {
		LinkedList list = new LinkedList();
		list.add("a");
		list.add("b");	
		list.add("c");	
		assertEquals("a, b, c",list.toString());
	}
	@Test
	public void testAddFirst2Elements() {
		LinkedList list = new LinkedList();
		list.addFirst("a");
		list.addFirst("b");	
		assertEquals("b, a",list.toString());
	}
	@Test
	public void testAddFirst3Elements() {
		LinkedList list = new LinkedList();
		list.addFirst("a");
		list.addFirst("b");	

		list.addFirst("c");	
		assertEquals("c, b, a",list.toString());
	}
	@Test
	public void testGetIElements() {
		LinkedList list = new LinkedList();
		list.add("a");
		list.add("b");	
		list.add("c");	
		list.add("d");
		
		assertEquals("c",list.get(2));
	}
	@Test
	public void testGetIElementsCast() {
		LinkedList list = new LinkedList();
		list.add("a");
		list.add("b");	
		list.add("c");	
		list.add("d");
		String actual = (String)list.get(2);
		assertEquals("c",actual);
	}
	@Test
	public void testGetFirstElements() {
		LinkedList list = new LinkedList();
		list.add("a");
		list.add("b");	
		list.add("c");	
		list.add("d");
		
		assertEquals("a",list.get(0));
	}
	@Test
	public void testGetNonExistingElements() {
		LinkedList list = new LinkedList();
		list.add("a");
		list.add("b");	
		list.add("c");	
		list.add("d");
		
		assertEquals(null,list.get(25));
	}

}
