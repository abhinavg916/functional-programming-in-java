package module8;

import java.util.stream.IntStream;

public class FP30ThreadsusingFunctionalProgramming {

	public static void main(String[] args) {
		// Traditional Approach
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++)
					System.out.println(Thread.currentThread().getId() + ":" + i);
			}
		};
//		Thread thread = new Thread(runnable);
//		thread.start();
//		
//		Thread thread1 = new Thread(runnable);
//		thread1.start();
//		
//		Thread thread2 = new Thread(runnable);
//		thread2.start();
//		
		// Functional Approach
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
