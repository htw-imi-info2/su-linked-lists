package queue.generic;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueueTest extends TestCase {
    @Test
    public void testEnqueue(){
        Queue<String> q = new Queue<>();
        q.enqueue("a");
        assertEquals("a",q.toString());
    }
    @Test
    public void testEnqueue2(){
        Queue<String> q = new Queue<>();
        q.enqueue("a");
        q.enqueue("b");
        assertEquals("b, a",q.toString());
    }

    @Test
    public void testDequeueEnqueue(){
        Queue<String> q = new Queue<>();
        q.enqueue("a");
        assertEquals("a",q.dequeue());
    }
    @Test
    public void testDequeueEnqueue2(){
        Queue<String> q = new Queue<>();
        q.enqueue("a");
        q.enqueue("b");
        assertEquals("a",q.dequeue());
    }
}
