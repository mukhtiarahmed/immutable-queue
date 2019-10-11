package jp.en.paypay.challenge;

import java.util.Arrays;

/**
 * Created by Mukhtiar Ahmed on 9/27/2019.
 */
public class ImmutableQueue<T> implements Queue<T> {

    protected Object[] queue;

    public ImmutableQueue() {
        queue = new Object[0];
    }

    private ImmutableQueue(T[] queue) {
        this.queue = queue;
    }

    public Queue<T> enQueue(T t) {
        Object[] newQueue = new Object[this.queue.length + 1];
        if (isEmpty()) {
            newQueue[0] = t;
        } else {
            System.arraycopy(queue, 0, newQueue, 0, this.queue.length);
            newQueue[this.queue.length] = t;
        }

        return new ImmutableQueue(newQueue);

    }


    public Queue<T> deQueue() {
        if (isEmpty()) {
            return new ImmutableQueue();
        } else {
            Object[] newQueue = new Object[this.queue.length - 1];
            System.arraycopy(queue, 1, newQueue, 0, newQueue.length);
            return new ImmutableQueue(newQueue);
        }
    }


    public T head() {
        return (T) (isEmpty() ? null : this.queue[0]);
    }


    public boolean isEmpty() {
        return queue.length == 0;
    }


    public int size() {
        return queue.length;
    }

}
