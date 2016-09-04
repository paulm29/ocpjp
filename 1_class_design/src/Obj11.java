/**
    1.1. Implement encapsulation

    Encapsulation is suggested through JavaBean conventions:
    - private instance variables
    - public getter methods named according to getX , where X is the name of the variable,
        or isX in the case of boolean variables (X must be uppercase)
    - public setter methods named according to setX , where X is the name of the variable
        (X must be uppercase)

    Note: there is little source code here, as this topic is covered in OCAJP
 */
public class Obj11 {
    private String instanceVariable = "Hello, world!";

    public void getInstanceVariable()  {
        System.out.println(instanceVariable);
    }
}
