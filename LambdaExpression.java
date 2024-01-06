package Advance_Java;

@FunctionalInterface
interface FunctionalInterface0 {
    public void meth();
}

public class LambdaExpression {
    public static void main(String[] args) {
        FunctionalInterface0 obj = () -> {
            System.out.println("I am meth()");
        };
        obj.meth();
    }
}
