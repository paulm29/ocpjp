/**
    Lambdas replace anonymous inner classes with far less verbosity.

    Like inner classes, lambdas can access final or 'effectively final'
    variables in the enclosing scope.

    Lambda: (Parameters) -> { Body;}
 */
public class Lambdas {
}

interface LambdaFunction {
    void call();
}

interface SuffixFunction {
    void call();
}

class FirstLambda {

    public static void main(String []args) {
        LambdaFunction lambdaFunction = () -> System.out.println("Hello world");
        lambdaFunction.call();

        /*
        The following code won't compile because word is treated as
        'effectively final'
        */
        String word = "hello";
        SuffixFunction suffixFunc = () -> System.out.println(word + "ay");
        word = "e";
        suffixFunc.call();
    }
}