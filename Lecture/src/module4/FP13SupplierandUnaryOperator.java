package module4;

import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FP13SupplierandUnaryOperator {
	public static void main(String[] args) {

		Supplier<Integer> randomIntegerSupplier = () -> 2; // () represents no parameters and return 2 everytime
		Supplier<Integer> randomIntegerSupplier2 = () -> {
			Random random = new Random();
			return random.nextInt(1000);

		}; // For Multiple lines of coding in Lambda Expressions, {} are used.

		System.out.println(randomIntegerSupplier.get());
		System.out.println(randomIntegerSupplier2.get());

		UnaryOperator<Integer> unaryOperator = (x) -> x * 3;
		System.out.println(unaryOperator.apply(10)); // 10 as input
	}
}
