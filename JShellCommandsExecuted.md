# JShell Commands Executed
```
System.out.println("Hello World in JShell by Abhinav")

List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

numbers.stream().reduce(0, (x,y)->x+y)
numbers.stream().reduce(0, (x,y)->x)
numbers.stream().reduce(0, (x,y)->y)
numbers.stream().reduce(0, (x,y)-> x>y ? x:y)

numbers.stream().reduce(Integer.MIN_VALUE, (x,y)-> x>y ? x:y)
numbers.stream().reduce(Integer.MIN_VALUE, (x,y)-> x>y ? y:x)
numbers.stream().reduce(Integer.MAX_VALUE, (x,y)-> x>y ? y:x)

numbers.stream().reduce(0, (x,y) -> x*x + y*y)
numbers.stream().map(x -> x*x).reduce(0, Integer::sum)
numbers.stream().map(x -> x*x*x).reduce(0, Integer::sum)

numbers.stream().filter(x -> x%2==1).reduce(0, Integer::sum)
numbers.stream().filter(x -> x%2==0).reduce(0, Integer::sum)

numbers.stream().distinct().forEach(System.out::println)

numbers.stream().sorted().forEach(System.out::println)

numbers.stream().distinct().sorted().forEach(System.out::println)

List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");

courses.stream().sorted().forEach(System.out::println)

courses.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println)
courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println)
courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println)

courses.stream().map(x -> x.length()).collect(Collectors.toList())

numbers.stream().map(x -> x*x).collect(Collectors.toList())

Supplier<String> supplier = () -> {return "Ranga";};

Consumer<String> consumer = (str) -> { System.out.println(str);System.out.println(str);};

List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
numbers.stream()

Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).count()
Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).reduce(0, Integer::sum)
Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15)

int[] numberArray = {12, 9, 13, 4, 6, 2, 4, 12, 15};
Arrays.stream(numberArray)
Arrays.stream(numberArray).sum()
Arrays.stream(numberArray).average()
Arrays.stream(numberArray).min()
Arrays.stream(numberArray).max()

IntStream.range(1,10)
IntStream.range(1,10).sum()
IntStream.rangeClosed(1,10).sum()

IntStream.iterate(1, e -> e + 2).limit(10).sum()
IntStream.iterate(1, e -> e + 2).limit(10).peek(System.out::println).sum()
IntStream.iterate(2, e -> e + 2).limit(10).peek(System.out::println).sum()
IntStream.iterate(2, e -> e * 2).limit(10).peek(System.out::println).sum()
IntStream.iterate(2, e -> e * 2).limit(10).boxed().collect(Collectors.toList())

Integer.MAX_VALUE
Long.MAX_VALUE

IntStream.rangeClosed(1,50).reduce(1, (x,y)->x*y)
LongStream.rangeClosed(1,50).reduce(1, (x,y)->x*y)
LongStream.rangeClosed(1,50).reduce(1L, (x,y)->x*y)
LongStream.rangeClosed(1,10).reduce(1, (x,y)->x*y)
LongStream.rangeClosed(1,20).reduce(1, (x,y)->x*y)
LongStream.rangeClosed(1,40).reduce(1, (x,y)->x*y)
LongStream.rangeClosed(1,50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply)

courses.stream().collect(Collectors.joining(" "))
courses.stream().collect(Collectors.joining(","))

"Spring".split("")

courses.stream().map(course -> course.split("")).collect(Collectors.toList())

courses.stream().map(course -> course.split(""))

courses.stream().map(course -> course.split("")).flatMap(Arrays::stream).collect(Collectors.toList())

courses.stream().map(course -> course.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList())

List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");

List<String> courses2 = List.of("Spring", "Spring Boot", "API" , "Microservices","
	AWS", "PCF","Azure", "Docker", "Kubernetes");

courses.stream().flatMap(course -> courses2.stream().map(course2 -> List.of(course,course2))).collect(Collectors.toList())

courses.stream().flatMap(course -> courses2.stream().map(course2 -> List.of(course,course2))).filter(list -> list.get(0).equals(list.get(1))).collect(Collectors.toList())

courses.stream().flatMap(course -> courses2.stream().map(course2 -> List.of(course,course2))).filter(list -> !list.get(0).equals(list.get(1))).collect(Collectors.toList())

courses.stream().flatMap(course -> courses2.stream().filter(course2 -> course2.length()==course.length()).map(course2 -> List.of(course,course2))).filter(list -> !list.get(0).equals(list.get(1))).collect(Collectors.toList())

courses.stream().filter(courses -> courses.length()>11).map(String::toUpperCase).findFirst()

courses.stream().peek(System.out::println).filter(courses -> courses.length()>11).map(String::toUpperCase).peek(System.out::println).findFirst()

courses.stream().peek(System.out::println).filter(courses -> courses.length()>11).map(String::toUpperCase).peek(System.out::println)

$4.findFirst()//Change $4 to your variable name

List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");

courses.replaceAll( str -> str.toUpperCase()) //Error

List<String> modifyableCourses = new ArrayList(courses);

modifyableCourses.replaceAll(str -> str.toUpperCase())
modifyableCourses.removeIf(course -> course.length()<6)

Runnable runnable3 = () -> IntStream.range(0, 10000).forEach(i -> System.out.println(Thread.currentThread().getId() + ":" + i))
```
