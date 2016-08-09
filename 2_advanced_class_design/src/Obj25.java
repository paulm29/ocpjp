/**
    2.5 Develop code that declares, implements, and/or extends interfaces and use the atOverride annotation

 An interface cannot be instantiated. A reference to an interface can refer to an object
 of any of its derived types implementing it.
 •	 An interface can extend another interface. Use the extends (and not the implements)
 keyword for extending another interface.
 •	 Interfaces cannot contain instance variables. If you declare a data member in an
 interface, it should be initialized, and all such data members are implicitly treated as
 “public static final” members.
 •	 An interface can have three kinds of methods: abstract methods, default methods,
 and static methods.
 •	 An interface can be declared with empty body (i.e., an interface without any
 members). For example, java.util defines the interface EventListener
 without a body.
 •	 An interface can be declared within another interface or class; such interfaces are
 known as nested interfaces.
 •	 Unlike top-level interfaces that can have only public or default access, a nested
 interface can be declared public, protected, or private.
 •	 If you are implementing an interface in an abstract class, the abstract class does not
 need to define the method. But, ultimately a concrete class has to define the abstract
 method declared in the interface.
 •	 You can use the @Override annotation for a method to indicate that it is overriding a
 method from its base typ
 */
public class Obj25 {

    /*
    Here are some key points about abstract, default, and static methods that will help you in the OCPJP 8 exam:
•	 You cannot declare members as protected or private. Only public access is
allowed for members of an interface. Since all methods are public by default, you can
omit the public keyword.
•	 All methods declared in an interface (i.e., without a method body) are implicitly
considered to be abstract. If you want, you can explicitly use the abstract qualifier
for the method.
•	 Default methods must have a method body. Default methods must be qualified
using the default keyword. The classes implementing the interface inherit the
default method definitions and they can be overridden.
•	 A default method can be overridden in a derived class as an abstract method; for
such overriding, the @Override annotation can also be used.
•	 You cannot qualify default methods as synchronized or final.
•	 Static methods must have a method body and they are qualified using the static
keyword
     */
}
