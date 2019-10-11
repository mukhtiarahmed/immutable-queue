package jp.en.paypay.challenge;


import org.junit.Test;
import org.testng.Assert;

/**
 * Created by Mukhtiar Ahmed on 9/27/2019.
 */
public class ImmutableQueueTest {

    @Test
    public void testImmutableQueue_enQueue() {
        Queue<String> queue = new ImmutableQueue<String>();
        Assert.assertEquals(queue.size() , 0);
        Assert.assertEquals(queue.isEmpty() , true);
        Queue<String>  newQueue = queue.enQueue("Ahmed");
        Assert.assertEquals(newQueue.isEmpty() , false);
        Assert.assertEquals(newQueue.size() , 1);
        Assert.assertNotEquals(queue, newQueue);
    }

    @Test
    public void testImmutableQueue_deQueue() {
        Queue<String> queue = new ImmutableQueue<String>();
        queue = queue.enQueue("Ahmed");
        queue = queue.enQueue("Mukhtiar");
        queue = queue.enQueue("PayMax");
        queue = queue.enQueue("PayPay");
        Queue<String>  newQueue =queue.deQueue();
        Assert.assertNotEquals(queue, newQueue);
        Assert.assertEquals(queue.size(), 4);
        Assert.assertEquals(newQueue.size(), 3);
        Assert.assertNotEquals(queue.head(), newQueue.head());

    }

    @Test
    public void testImmutableQueue_head() {
        Queue<String> queue = new ImmutableQueue<String>();
        queue = queue.enQueue("Ahmed");
        queue = queue.enQueue("Mukhtiar");
        queue = queue.enQueue("PayMax");
        queue = queue.enQueue("PayPay");
        Assert.assertEquals(queue.head(), "Ahmed");

    }

    @Test
    public void testImmutableQueue_empty() {
        Queue<String> queue = new ImmutableQueue<String>();
        Assert.assertEquals(queue.isEmpty(), true);
        queue = queue.enQueue("Ahmed");
        Assert.assertEquals(queue.isEmpty(), false);

    }

    @Test
    public void testImmutableQueue_size() {
        Queue<String> queue = new ImmutableQueue<String>();
        Assert.assertEquals(queue.size(), 0);
        queue = queue.enQueue("Ahmed");
        queue = queue.enQueue("Mukhtiar");
        queue = queue.enQueue("PayMax");
        queue = queue.enQueue("PayPay");
        Assert.assertEquals(queue.size(), 4);
    }
}
