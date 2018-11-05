package list7.class18;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;

import org.junit.Test;

public class NodeIteratorTest {
	
	@Test
	public void testIterator() {
		Node<String> list = new Node<>("A",new Node<>("B", new Node<>("C",null)));
		Iterator<String> it = list.iterator();
		assertEquals(true, it.hasNext());
		assertEquals("A",it.next());
		assertEquals(true, it.hasNext());
		assertEquals("B",it.next());
		assertEquals(true, it.hasNext());
		assertEquals("C",it.next());
		assertEquals(false, it.hasNext());

	}
	@Test 
	public void iterableDemo() {
		Node<String> list = new Node<>("A",new Node<>("B", new Node<>("C",null)));
		String result = "";
		// prerequisite: add implements Iterable to class Node
		for(String s : list)
			result += s;
		assertEquals("ABC",result);
	}

}
