package Advance_Java;

/**
 * This is just a demonstration of creating own java documentation :)
 * <p>Using HTML the <strong>Description</strong> can be <em>customized</em>.</p>
 * <p>This is another paragraph...</p>
 * @author Sourav Routray
 * @version 1.0
 * @since 5th Jan 2024
 * @see <a href="https://docs.oracle.com/en/java/javase/20/docs/api/index.html" target = "_blank">JDK-20 Docs</a>
 */

public class CreatingOwnJavaDoc {
    /**
     * This is a method using which we can divide any two numbers.
     * @param a This is the numerator.
     * @param b This is the denominator
     * @throws ArithmeticException when the value of denominator is 0, i.e.&nbsp; b = 0.
     * @return Division of any 2 numbers.
     * @deprecated This method is deprecated, instead of this method use the '/' operator.
     */
    public static double divide(double a, double b) throws ArithmeticException {
        if(b == 0)
            throw new ArithmeticException();
        return a / b;
    }

    /**
     * Takes argument supplied.
     * @param args By default, it is always a String[].
     */
    public static void main(String[] args) {
        System.out.println(divide(10, 20));
    }
}
