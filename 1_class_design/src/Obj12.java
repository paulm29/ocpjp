import java.io.Serializable;
import java.lang.invoke.SerializedLambda;

/**
    1.2. Implement inheritance including visibility modifiers and composition

    This topic covers IS-A and HAS-A relationships.

    Composition means that a class has a reference to a particular instance variable.

    Favour composition over inheritance, unless you really want polymorphic behaviour.
    Composition enables greater re-use.

    Note: there is little source code here, as covered in OCAJP
 */
/*
    Obj12 IS-A Object, as it extends Object
 */
public class Obj12 extends Object{
    /*
        This object HAS-A name because it is one of its members.
     */
    String name;

    public static void main(String[] args) {
        instanceofExamples();
    }

    /*
         A IS-A B if instanceof returns true
     */
    private static void instanceofExamples() {
        Obj12 obj12 = new Obj12();

        System.out.println(obj12 instanceof Object);

        /*
            Compiler reports errors on comparisons it knows to be false
         */
        // System.out.println(obj12 instanceof Integer); // compile error

        /*
            Although null is not an instance, compiler allows this!
         */
        System.out.println(null instanceof Object);

         /*
            Following is a compile error, compiler know String can never be an instanceof
            HashMap. This check does NOT work for interfaces.
         */
        //System.out.println("" instanceof java.util.HashMap); // compile error

        /*
            Even through this class does not implement Serializable, it is possible
            that it could, so compiler does not report an error
         */
        System.out.println(obj12 instanceof Serializable);
    }
}
