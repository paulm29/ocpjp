/**
    6. Develop code that uses static keyword on initialize blocks,
        variables, methods, and classes
 */
public class Obj16 {
    private static int count = 0;

    public void sayHello() {
        System.out.println("Hi");
    }

    static {
        System.out.println(count);
        /*
            Cannot call instance methods from static context
         */
        // sayHello();
    }

    static {
        count = 100;
        System.out.println("Set count to 100");
    }

    public Obj16() {
        decrement();
    }

    public static void increment() {
        count++;
    }

    public static void decrement() {
        count--;
    }

    public static void main(String[] args) {
        Obj16.decrement();
        /*
         99 because constructor not invoked, as no instance
          */
        System.out.println(count);
    }
}
