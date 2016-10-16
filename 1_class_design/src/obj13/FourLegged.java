package obj13;

/*
    This class outputs "walk, walk", rather than "toddle, toddle" as you may expect.
    The variable walk in the superclass is used, because the walk() method is not
    overriden.
 */
public class FourLegged {
    String walk = "walk,";

    public void walk() {
        System.out.println(walk);
    }

    static class BabyRhino extends FourLegged {
        String walk = "toddle,";
    }
    public static void main(String[] args) {
        FourLegged f = new BabyRhino();
        BabyRhino b = new BabyRhino();
        f.walk();
        b.walk();
    } }

