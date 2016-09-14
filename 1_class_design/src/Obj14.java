/**
    1.4. Override hashCode, equals, and toString methods from Object class

    Rules for overriding:
    - names must match
    - same argument list types (or compatible types) as the base version.
    - same return type, or co-variant from Java 5 onwards
    - not have a more restrictive access modifier
    -- but it may have a less restrictive access modifier.
    - not throw new or broader checked exceptions.
    - may throw fewer/narrower checked exceptions, or any unchecked exception
 */
public class Obj14 {
    /*
        The following methods from Object class can be overriden:
        - clone(), equals(), hashCode(), toString(), and finalize()

        The following cannot be overriden, because they are final:
        - getClass(), notify(), notifyAll(), wait

        Use the @Override to ensure you actually overrode the method
     */

    private int equality_id;

    public Obj14(int equality_id) {
        this.equality_id = equality_id;
    }

    /*
        Override equals to obtain a 'deep' comparison, not a check of whether
        references point to the same object.

        The parameter MUST BE OBJECT, not the class being compared. The latter
        will NOT cause an error, unless you use @Override

        false is returned if null or wrong type, not an exception
     */
    /*
        The equals method must be:
        - reflexive: for any reference value x, x.equals(x) should return true.
        - symmetric: for any reference values x and y, x.equals(y) should return true if and only if y.equals(x)
            returns true.
        - transitive: for any reference values x, y, and z, if x.equals(y) returns true and y.equals(z) returns true,
            then x.equals(z) should return true.
        - consistent: for any reference values x and y, multiple invocations of x.equals(y) consistently return true or
            consistently return false, provided no information used in equals comparisons on the object is modified.
        - For any non-null reference value x, x.equals(null) should return false.

        It is generally necessary to override the hashCode method whenever this method is overridden, so as to maintain
        the general contract for the hashCode method, which states that equal objects must have equal hash codes.
     */
    @Override
    public boolean equals(Object other) {
        if(other == null) {
            return false;
        }

        /*
            Note: previous check not needed as null is not an instance of any class
         */
        if(!(other instanceof Obj14)) {
            return false;
        }

        Obj14 otherObj14 = (Obj14) other;

        if(this.equality_id == otherObj14.equality_id) {
            return true;
        }

        return false;
    }

    /*
        hashcode needs to be overriden as it is used by collection classes such as
        HashSet or HashMap to check equality efficiently.

        equals() also needs to be overriden for HashSet/HashMap, as equals is called after
        hashcode() if hashcodes are the same.

        It should return the same hash value for two objects if the equals() method
        returns true. The hash calculation can use the same fields, or a subset of
        fields.

        You can use prime magic numbers or bit shift operators to generate a unique code
        based on prime numbers.
     */
    private static final int PRIME_MAGIC_NUMBER = 37;

    public int hashCode() {
        return equality_id * PRIME_MAGIC_NUMBER;
    }

    /*
        By default, toString will return: ClassName@hex version of the object's hashcode
        It must have a public access modifier.
     */
    @Override
    public String toString() {
        return "Obj14";
    }

    public Obj14 covariant() {
        return new Obj14(3);
    }

    public static void main(String[] args) {
        Obj14 objectOne = new Obj14(1);
        Obj14 objectTwo = new Obj14(2);

        System.out.println(objectOne.equals(objectOne));
        System.out.println(objectOne.equals(objectTwo));
    }
}

class Obj14subclass extends Obj14 {

    public Obj14subclass(int equality_id) {
        super(equality_id);
    }

    /*
        Use of a covariant return type
     */
    @Override
    public Obj14subclass covariant() {
        return new Obj14subclass(4);
    }
}
