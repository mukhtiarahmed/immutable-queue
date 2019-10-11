package jp.en.paypay.challenge;


import java.util.ArrayList;
import java.util.Observable;

public class SoftwareChallengeApplication {

	public static void main(String[] args) {
		Queue<String> queue = new ImmutableQueue<String>();
		System.out.println(queue.size() + "  " + queue.toString());
		queue = queue.enQueue("Ahmed ");
		System.out.println(queue.size() + "  " + queue.toString());
		queue = queue.enQueue("Saleem ");

		System.out.println();
		System.out.println(queue.size() + "  " + queue.toString());
		queue = queue.enQueue("Mukhtiar ");

		System.out.println();
		System.out.println(queue.size() + "  " + queue.toString());
		queue = queue.enQueue("Muhammad ");

		System.out.println();
		System.out.println(queue.size() + "  " + queue.toString());
		queue = queue.enQueue("Hamza ");

		System.out.println();
		System.out.println(queue.size() + "  " + queue.toString());
		queue = queue.deQueue();

		System.out.println();
		System.out.println(queue.size() + "  " + queue.toString());
		queue = queue.deQueue();

		System.out.println();
		System.out.println(queue.size() + "  " + queue.toString());
		queue = queue.deQueue();

		System.out.println();
		System.out.println(queue.size() + "  " + queue.toString());
		queue = queue.deQueue();

		System.out.println();
		System.out.println(queue.size() + "  " + queue.toString());
		queue = queue.deQueue();

		System.out.println();
		System.out.println(queue.size() + "  " + queue.toString());



	}

}
