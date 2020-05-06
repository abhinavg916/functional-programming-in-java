package module4;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class FP15Puzzles {

	public static void main(String[] args) {
//		Puzzles
//		jshell> Consumer<String> consumer = () -> {}
//		|  Error:
//		|  incompatible types: incompatible parameter types in lambda expression
//		|  Consumer<String> consumer = () -> {};			// REASON: Because it expects one input
//		|                              ^------^
//
//		jshell> Consumer<String> consumer = (str) -> {}			
//		consumer ==> $Lambda$17/0x0000000800bb2c40@3c0ecd4b
//
//		jshell> Consumer<String> consumer = (str) -> System.out::println
//		|  Error:
//		|  incompatible types: bad return type in lambda expression
//		|      void is not a functional interface
//		|  Consumer<String> consumer = (str) -> System.out::println;   		
//		|                                       ^-----------------^
//
//		jshell> Consumer<String> consumer = System.out::println
//		
//		jshell> Consumer<String> consumer = (str) -> System.out.println(str)
//		consumer ==> $Lambda$18/0x0000000800bb3840@5f341870
//
//		jshell> BiConsumer<String, String> consumer = (str, str2) -> System.out.println(str)
//		consumer ==> $Lambda$19/0x0000000800bb3c40@271053e1
//
//		jshell> Supplier<String> supplier = () -> "Abhinav"
//		supplier ==> $Lambda$20/0x0000000800bb4840@6500df86
//
//		jshell> Supplier<String> supplier = () -> {"Abhinav"}
//		|  Error:
//		|  not a statement
//		|  Supplier<String> supplier = () -> {"Abhinav"};		// REASON: Wrong Syntax
//		|                                     ^-------^
//		|  Error:
//		|  ';' expected
//		|  Supplier<String> supplier = () -> {"Abhinav";};		// REASON: Wrong Syntax
//		|                                              ^
//
//		jshell> Supplier<String> supplier = () -> {return "Abhinav"};
//		|  Error:
//		|  ';' expected
//		|  Supplier<String> supplier = () -> {return "Abhinav"};	// REASON : Wrong Syntax
//		|                                                     ^
//
//		jshell> Supplier<String> supplier = () -> {return "Abhinav";}
//		supplier ==> $Lambda$20/0x0000000800bb4840@6500df86
//
//		jshell> Consumer<String> consumer = (str) -> System.out.println(str); System.out.println(str);
//		consumer ==> $Lambda$21/0x0000000800bb4c40@4cf777e8
//		|  Error:
//		|  cannot find symbol
//		|    symbol:   variable str
//		|   System.out.println(str);			// REASON: Wrong syntax of writing multi-line lambda expression
//		|                      ^-^
//
//		jshell> Consumer<String> consumer = (str) -> {System.out.println(str); System.out.println(str);}
//		consumer ==> $Lambda$22/0x0000000800bb5840@3fee9989

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		Predicate<Integer> isEvenPredicate = (Integer x) -> x % 2 == 0; // Type defined for the parameter in lambda
																		// expression
		BinaryOperator<Integer> binaryOperator = (Integer x, Integer y) -> x + y; // Type defined for all the parameter
																					// in lambda expression
		BinaryOperator<Integer> binaryOperator2 = (x, y) -> x + y; // Type Inference, Compiler automatically infer type
																	// as 'Integer' defined in Binary Operator definition
//		BinaryOperator<Integer> binaryOperator3 = (String x, String y) -> x + y; // Compile Error because of wrong type

	}

}
