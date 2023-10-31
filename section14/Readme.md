# Lambda Expression and Functional interface

## Lambda Expression
- Lambda expression is a new and important feature of Java which was included in Java SE 8. It provides a clear and concise way to represent one method interface using an expression. It is very useful in collection library in case of filtering, mapping etc. It enables to treat functionality as a method argument, or code as data.
- Lambda expression provides implementation of functional interface. An interface which has only one abstract method is called functional interface. Java provides an anotation @FunctionalInterface, which is used to declare an interface as functional interface.
- Lambda expression is a new feature which is introduced in Java 8. A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

## Functional Interface
- An interface which has only one abstract method is called functional interface. Java provides an anotation @FunctionalInterface, which is used to declare an interface as functional interface.
- Before Java 8, we had to create anonymous inner class objects or implement these interfaces.
- Java 8 has added a keyword called lambda, which makes it easy to create anonymous classes by providing implementation of method defined by functional interface.
- Java 8 has defined a lot of functional interfaces to be used extensively in lambda expressions. Following is the list of functional interfaces defined in java.util.Function package.

 ## The Consumer Interface

- The Consumer Interface is a part of the java.util.function package which has been introduced since Java 8, to implement functional programming in Java. It represents a function which takes in one argument and produces a result. However these kind of functions don’t return any value.
- The lambda expression assigned to an object of Consumer type is used to define its accept() which eventually applies the given operation on its argument. Consumer interface doesn’t return any value.

Lampda expression syntax
```java
Consumer<Integer> display = a -> System.out.println(a);
display.accept(10);
```

Labda expression with block statement
```java
Consumer<Integer> display = a -> {
    System.out.println(a);
};
display.accept(10);
```
Labda expression with multiple parameter
```java
BiConsumer<Integer, Integer> display = (a, b) -> {
    System.out.println(a);
    System.out.println(b);
};  
display.accept(10, 20);
```
- The rule for multiple parameter is that you have to enclose the parameter inside the bracket and separate them with comma.
- If you use an explicit type for one parameter, then you have to use it for all the parameters.
- If you don’t specify the type of the parameter, then the compiler will treat it as an Object type.
- if you use var for one parameter, then you have to use it for all the parameters.
- if you use state block you have to use return statement.

## The Supplier Interface

- The Supplier Interface is a part of the java.util.function package which has been introduced since Java 8, to implement functional programming in Java. It represents a function which does not take in any argument but produces a value of type T.
- 
