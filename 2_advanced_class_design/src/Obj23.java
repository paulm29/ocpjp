/**
    Create inner classes including static inner class, local class, nested class, and anonymous inner class

    Classes defined within the body of another class (or interface) are known as nested classes.
    There are two main types, local and non-local and 4 variations in total.

    Non-local:
    1. static nested classes are static and non-local
    2. inner classes are non-static and non-local.

    Local:
    3. A non-static and local nested class is a local inner class
    4. a local and anonymous nested class is an anonymous inner class.
 */
public class Obj23 {

    /*
        1. static nested classes are static and non-local
     */
    /*
    The accessibility (public, protected, etc.) of the static nested class is defined by
            the outer class.
            •	 The name of the static nested class is expressed with
            OuterClassName.NestedClassName syntax.
            •	 When you define an inner nested class (or interface) inside an interface, the nested
    class is declared implicitly public and static. This point is easy to remember: any
    field in an interface is implicitly declared public and static, and static nested
    classes have this same behavior.
            •	 Static nested classes can be declared abstract or final.
            •	 Static nested classes can extend another class or they can be used as base classes.
            •	 Static nested classes can have static members. (As you’ll see shortly, this statement
    does not apply to other kinds of nested classes.)
            •	 Static nested classes can access the members of the outer class (only static members,
    obviously).
            •	 The outer class can also access the members (even private members) of the nested
    class through an object of a nested class. If you don’t declare an instance of the
    nested class, the outer class cannot access nested class elements directly.
    */

    /*
        2. inner classes are non-static and non-local

- The accessibility (public, protected, etc.) of the inner class is defined by the outer class.
- Just like top-level classes, an inner class can extend a class or can implement
interfaces. Similarly, other classes can extend an inner class, and other classes or
interfaces can extend or implement an inner interface.
- An inner class can be declared final or abstract.
- Inner classes can have inner classes, but you’ll have a hard time reading o
understanding such complex nesting of classes. (Meaning: Avoid them!)
     */
        class Inner5 {}     // an outer class has an inner class
        interface Inner6 {} // an outer class has an inner interface

    /*
        3. local inner class
You can create a non-static local class inside a body of code. Interfaces cannot have
local classes, and you cannot create local interfaces.
•	 Local classes are accessible only from the body of the code in which the class is
defined. The local classes are completely inaccessible outside the body of the code in
which the class is defined.
•	 You can extend a class or implement interfaces while defining a local class.
•	 A local class can access all the variables available in the body of the code in which it
is defined. Variables accessed by local inner classes are considered effectively final.
     */

    /*
        4. anonymous inner class

- Anonymous classes are defined in the new expression itself.
- You cannot explicitly extend a class or explicitly implement interfaces when defining
an anonymous class.
     */


    public static void main(String[] args) {
        Outer1.Inner outerClass1 = new Outer1.Inner();
        Outer2.Inner outerClass2 = new Outer2.Inner();
        outerClass2.hi();

        Obj23.Inner5 innerClass1 = (new Obj23()).new Inner5();

        class LocalInnerClass {
            public void sayHello() {
                System.out.println("local inner class");
            }
        }
        LocalInnerClass lic = new LocalInnerClass();
        lic.sayHello();

        new Object() {
            { // instance initializer
                System.out.println("Anonymous inner class");
            }
        };
    }
}

class Outer1 { // an outer class has a static nested class
    static class Inner {}
}
interface Outer2 { // an outer interface has a static nested class
    static class Inner {
        public static void hi() {
            System.out.println("Hi!");
        }
    }
}
class Outer3 { // an outer class has a static nested interface
    static interface Inner {}
}
interface Outer4 { // an outer interface has a static nested interface
    static interface Inner {}
}