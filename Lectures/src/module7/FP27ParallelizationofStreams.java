package module7;

import java.util.List;
import java.util.stream.LongStream;

public class FP27ParallelizationofStreams {

	public static void main(String[] args) {

		long time = System.currentTimeMillis();
		// Sequential
		// System.out.println(LongStream.range(0, 1000000000).sum()); // 1601 ms

		// Parallelized
		System.out.println(LongStream.range(0, 1000000000).parallel().sum()); // 188 ms

		System.out.println(System.currentTimeMillis() - time);

//		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
//		int sum  = 0;
//		for(int number:numbers)
//			sum+=number;
//		System.out.println(sum); // Structured Code
//		System.out.println(numbers.stream().reduce(0 , Integer::sum)); 
//		System.out.println(numbers.stream().parallel().reduce(0 , Integer::sum)); 
	}

}
