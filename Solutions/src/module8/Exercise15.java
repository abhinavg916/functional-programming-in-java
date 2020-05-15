package module8;

import java.util.stream.IntStream;

public class Exercise15 {

	public static void main(String[] args) {
		Runnable runnable2 = () -> { // Lambda Expression
			IntStream.range(0, 10)
			.forEach(i -> System.out.println(Thread.currentThread().getId() + ":" + i));
		};

		Thread thread = new Thread(runnable2);
		thread.start();

		Thread thread1 = new Thread(runnable2);
		thread1.start();

		Thread thread2 = new Thread(runnable2);
		thread2.start();
	}

}
