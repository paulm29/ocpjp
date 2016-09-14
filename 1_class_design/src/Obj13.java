/**
    1.3. Implement polymorphism

    Two types:
    - static (early binding): at compile time, using method and constructor overloading
    - dynamic (late binding): at runtime, using method overriding

    Note: there is little source code here, as covered in OCAJP
 */
public class Obj13 {
    /*
        Overload resolution rules:
        1. Exact match
        2. Widening (upcast)
        3. Autoboxing
        4. Varargs

        Return types and thrown exceptions do not matter.
     */

    public void printValue(byte exactMatch) {
        System.out.println("exactMatch");
    }

    public void printValue(int widening) {
        System.out.println("widening");
    }

    public void printValue(Short autoboxing) {
        System.out.println("autoboxing");
    }

    public void printValue(short... varargs) {
        System.out.println("varargs");
    }

    public void printValue(int intval, long longval) {
        System.out.println("int, long");
    }

    public void printValue(long longval, int intval) {
        System.out.println("longval, intval");
    }

    public static void main(String[] args) {
        byte b = 1;
        short s = 1;
        double d = 1d;

        Obj13 obj13 = new Obj13();
        obj13.printValue(b);
        obj13.printValue(s);
        // obj13.printValue(d); // compile error, no match

        //obj13.printValue(1,1); // compile error, ambiguous
    }


}
