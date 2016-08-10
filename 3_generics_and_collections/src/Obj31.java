/**
    3.1 Create and use a generic class
 */
public class Obj31<T> {
    private T val;
    private T val2; // val and val2 must be of the same type


    public Obj31(T arg) {
        val = arg;
    }
    public String toString() {
        return "[" + val + "]";
    }

    public static void main(String []args) {
        Obj31<Integer> value1 = new Obj31<Integer>(new Integer(10));
        System.out.println(value1);
        Obj31<String> value2 = new Obj31<String>("Hello world");
        System.out.println(value2);

        /*
            Diamond syntax, available since Java 7
         */
        Obj31<Integer> value3 = new Obj31<>(new Integer(10));
    }
}
