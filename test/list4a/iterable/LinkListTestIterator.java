package list4a.iterable;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import list4b.iterableWithRemove.LinkedList;

public class LinkListTestIterator {
	LinkedList<String> list;

	@Before
	public void setUp() throws Exception {
		list = new LinkedList<>();
	}

	@Test
	public void testIterator() {
		list.add("a");
		list.add("d");
		list.add("c");
		list.add("b");
		Iterator<String> iterator = list.iterator();
		assertEquals(true, iterator.hasNext());
		assertEquals("a", iterator.next());
		assertEquals("b", iterator.next());
		assertEquals("c", iterator.next());
		assertEquals("d", iterator.next());
		assertEquals(false, iterator.hasNext());

	}

	@Ignore
	public void testIteratorRemove() {
		list.add("a");
		list.add("d");
		list.add("c");
		list.add("b");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String s = iterator.next();
			if (s.equals("c"))
				iterator.remove();
		}
		assertEquals("a, b, d", list.toString());

	}

	@Ignore
	public void testIteratorRemoveFIRST() {
		list.add("a");
		list.add("d");
		list.add("c");
		list.add("b");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String s = iterator.next();
			if (s.equals("a"))
				iterator.remove();
		}
		assertEquals("b, c, d", list.toString());

	}

	@Ignore
	public void testIteratorRemoveLAST() {
		list.add("a");
		list.add("d");
		list.add("c");
		list.add("b");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String s = iterator.next();
			if (s.equals("d"))
				iterator.remove();
		}
		assertEquals("a, b, c", list.toString());

	}

	@Ignore
	public void testIteratorRemoveALL() {
		list.add("a");
		list.add("d");
		list.add("c");
		list.add("b");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			iterator.remove();
		}
		assertEquals("a, b, c, d", list.toString());

	}

	@Ignore
	public void testIteratorRemoveALLSteps() {
		list.add("a");
		list.add("d");
		list.add("c");
		list.add("b");

		Iterator<String> iterator = list.iterator();
		iterator.next();
		iterator.remove();
		assertEquals("b, c, d", list.toString());
		iterator.next();
		iterator.remove();
		assertEquals("c, d", list.toString());
		iterator.next();
		iterator.remove();
		assertEquals("d", list.toString());
		iterator.next();
		iterator.remove();
		assertEquals("", list.toString());
		assertEquals(false, iterator.hasNext());

	}

	@Ignore
	public void testIteratorRemoveSECOND() {
		list.add("a");
		list.add("d");
		list.add("c");
		list.add("b");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String s = iterator.next();
			if (s.equals("b"))
				iterator.remove();
		}
		assertEquals("a, c, d", list.toString());

	}

	@Test
	public void printWithIterator() {
		list.add("a");
		list.add("d");
		list.add("c");
		list.add("b");
		String result = "";
		for (String s : list) {
			result += s;
		}
		assertEquals("abcd", result);
	}
}
