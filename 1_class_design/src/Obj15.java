/**
    1.5. Create and use singleton classes and immutable classes

    Singleton ensures only one instance of the class ever exists.
    The static getInstance method returns the static object.

    They are useful for single-point of entry functionality, such as:
    logging, thread-pooling
 */
class Singleton {
    private static Singleton singleton;

    private Singleton() {
        System.out.println("constructing");
    }

    /*
        There are at least 3 popular variations of the Singleton pattern.
        synchronized is only needed for multi-threaded environment
     */
    public static synchronized Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }

    /*
        A more efficient, thread-safe version of getInstance.
        Sometimes a static inner class, without synchronization, is used instead for
        performance reasons.
     */
    public static Singleton getInstance2() {
        if(singleton == null) {
            synchronized(Singleton.class) {
                if(singleton == null) {
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }

    /*
        An alternative method for a multi-threaded environment below,
        which doesn't have the performance impact of synchronized
        This uses a static inner class and 'initialization on demand'
     */
    /*
    public static class InstanceHolder {
        public static Singleton instance = new Singleton();
    }
    public static Singleton getInstance() {
        return InstanceHolder.instance;
    }
    */
}

/*
    Immutable objects have many advantages such as thread-safety and
    reducing the potential for bugs.

    Some immutable classes:
    - String
    - Wrapper classes for primitive types
    - Date objects from java.time package
    - Path objects from nio.2

    Immutable classes have the following properties:
    - class declared final
    - private, final fields initialized in a constructor
    - final methods (implicit when class made final)
    - no setters
    - getters that return deep copies of objects that are members
 */
final class Immutable {
    private final String name;

    public Immutable(String name) {
        this.name = name;
    }

    public Immutable getCopy() {
        return new Immutable(name);
    }
}
