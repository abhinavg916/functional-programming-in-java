package module6;

public class FP22CreationofStreamusingMethodsandforArrays {

	public static void main(String[] args) {
		
//		jshell> List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
//		numbers ==> [12, 9, 13, 4, 6, 2, 4, 12, 15]
//
//		jshell> numbers.stream()
//		$2 ==> java.util.stream.ReferencePipeline$Head@14bf9759
//
//		jshell> Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
//		$3 ==> java.util.stream.ReferencePipeline$Head@553f17c
//
//		jshell> Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).count()
//		$4 ==> 9
//
//		jshell> Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).reduce(0, Integer::sum)
//		$5 ==> 77
//		
//		jshell> Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).average() // Not supported
//		|  Error:
//			|  cannot find symbol
//			|    symbol:   method average()
//			|  Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).average()
//			|  ^----------------------------------------------^
//			
//		jshell> int[] numberArray = {12, 9, 13, 4, 6, 2, 4, 12, 15}
//		numberArray ==> int[9] { 12, 9, 13, 4, 6, 2, 4, 12, 15 }
//		
//		jshell> Arrays.stream(numberArray)
//		$7 ==> java.util.stream.IntPipeline$Head@1ce92674
//		
//		jshell> Arrays.stream(numberArray).sum()
//		$3 ==> 77
//
//		jshell> Arrays.stream(numberArray).average()
//		$4 ==> OptionalDouble[8.555555555555555]
//
//		jshell> Arrays.stream(numberArray).min()
//		$5 ==> OptionalInt[2]
//
//		jshell> Arrays.stream(numberArray).max()
//		$6 ==> OptionalInt[15]
//		
//		jshell> IntStream.rangeClosed(1,10).sum()
//		$9 ==> 55
//		
//		jshell> IntStream.range(1,10).sum()
//		$10 ==> 45
		
//		jshell> IntStream.iterate(1, e -> e+2).limit(10).peek(System.out::println).sum()
//		1
//		3
//		5
//		7
//		9
//		11
//		13
//		15
//		17
//		19
//		$3 ==> 100
//
//		jshell> IntStream.iterate(0, e -> e+2).limit(10).peek(System.out::println).sum()
//		0
//		2
//		4
//		6
//		8
//		10
//		12
//		14
//		16
//		18
//		$4 ==> 90
//
//		jshell> IntStream.iterate(2, e -> e*2).limit(10).peek(System.out::println).sum()
//		2
//		4
//		8
//		16
//		32
//		64
//		128
//		256
//		512
//		1024
//		$5 ==> 2046
//		
//		jshell> IntStream.iterate(2, e -> e*2).limit(10).peek(System.out::println).sum()
//		2
//		4
//		8
//		16
//		32
//		64
//		128
//		256
//		512
//		1024
//		$5 ==> 2046
//
//		jshell> IntStream.iterate(2, e -> e*2).limit(10).collect(Collectors.toList())
//		|  Error:
//		|  method collect in interface java.util.stream.IntStream cannot be applied to given types;
//		|    required: java.util.function.Supplier<R>,java.util.function.ObjIntConsumer<R>,java.util.function.BiConsumer<R,R>
//		|    found:    java.util.stream.Collector<java.lang.Object,capture#2 of ?,java.util.List<java.lang.Object>>
//		|    reason: cannot infer type-variable(s) R
//		|      (actual and formal argument lists differ in length)
//		|  IntStream.iterate(2, e -> e*2).limit(10).collect(Collectors.toList())
//		|  ^----------------------------------------------^
//
//		jshell> IntStream.iterate(2, e -> e*2).limit(10).boxed().collect(Collectors.toList())
//		$6 ==> [2, 4, 8, 16, 32, 64, 128, 256, 512, 1024]
		
		


	}

}
