/**
    4. Override hashCode, equals, and toString methods from Object class

    Rules for overriding:
    - names must match
    - Should have the same argument list types (or compatible types) as the base version.
    - Should have the same return type.
    -- But from Java 5 onwards, the return type can be a subclass–covariant return
        types (which you’ll learn shortly).
    - Should not have a more restrictive access modifier than the base version.
    -- But it may have a less restrictive access modifier.
    - Should not throw new or broader checked exceptions.
    -- But it may throw fewer or narrower checked exceptions, or any unchecked
    exception.
 */
public class Obj14 {
    /*
        The following methods from Object class can be overriden:
        - clone(), equals(), hashCode(), toString(), and finalize()

        The following cannot be overriden, because they are final:
        - getClass(), notify(), notifyAll(), wait

        Use the @Override to ensure you actually overrode the method
     */

    private int equality_id = 1;

    /*
        Override equals to obtain a 'deep' comparison, not a check of whether
        references point to the same object.

        The parameter must be object, not the class being compared.
     */
    @Override
    public boolean equals(Object other) {
        if(other == null) {
            return false;
        }

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

        It should return the same hash value for two objects if the equals() method
        returns true

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
        return new Obj14();
    }
}

class Obj14subclass extends Obj14 {

    /*
        Use of a covariant return type
     */
    public Obj14subclass covariant() {
        return new Obj14subclass();
    }
}
