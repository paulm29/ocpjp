/**
    5. Create and use singleton classes and immutable classes

    Singleton ensures only one instance of the class ever exists.
    The static getInstance method returns the static object.
 */
class Singleton {
    private static Singleton singleton;

    private Singleton() {
        System.out.println("constructing");
    }

    /*
        synchronized is only needed for multi-threaded environment
     */
    public static synchronized Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
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
    Immutable objects have many advantages such as threat-safety and
    reducing the portential for bugs.

    Some immutable classes:
    - String
    - Date objects from java.time package

    Immutable classes have the following properties:
    - class declared final
    - private, final fields initialized in a constructor
    - final methods (implicit when class made final)
    - no setters
    - getters that return deep copies of objects
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
