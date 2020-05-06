package module4;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class FP14BiPredicateBiFunctionBiConsumerPrimitiveFunctional {
	public static void main(String[] args) {

		BiPredicate<Integer, String> biPredicate = (number, str) -> true;
		BiPredicate<Integer, String> biPredicate2 = (number, str) -> { // Multiple line lambda expression
			return number < 10 && str.length() > 5;
		};

		System.out.println(biPredicate.test(5, "in28Minutes"));
		System.out.println(biPredicate2.test(10, "in28Minutes"));

		BiFunction<Integer, String, String> biFunction = (number, str) -> {
			return number + " " + str;
		};

		System.out.println(biFunction.apply(5, "in28Minutes"));

		BiConsumer<Integer, String> biConsumer = (s1, s2) -> {
			System.out.println(s1);
			System.out.println(s2);
		};

//		System.out.println(biConsumer.accept(15, "in28Minutes")); // Error because it returns nothing and sysout cannot be used.
		biConsumer.accept(15, "in28Minutes");

	}
}
