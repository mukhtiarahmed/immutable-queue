package jp.en.paypay.challenge;

/**
 * Created by Mukhtiar Ahmed on 9/27/2019.
 */
public interface Queue<T> {

    Queue<T> enQueue(T t);

    Queue<T> deQueue();

    T head();

    boolean isEmpty();

    int size();

}
