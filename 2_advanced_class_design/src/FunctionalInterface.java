/*
    The following will not compile, because it has the annotation, but
    no single, abstract method.

    Functional interfaces will compile if:
    - no abstract methods
    - more than one abstract method
    - only methods from the Object clas

    It is okay for a functional interface to have:
    - static methods
    - default methods
    - abstract methods from the Object class: compare, equals, etc.

    @FunctionalInterface
    public interface AnnotationTest {
        default int foo() {};
    }
 */
@FunctionalInterface
public interface FunctionalInterface {
    abstract int foo();

    /*
        Method from Object class
     */
    abstract boolean equals(Object other);
}

@FunctionalInterface
abstract class FunctionalInterface2 {
    abstract int foo();
}

