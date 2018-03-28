package java8.formulaSample;


public class Usage {

    public static void main(String[] args) {
        inJava7();
        inJava8();
    }
    private static void inJava7() {
        // Needs the creation of an anonymous class
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                // Can access directly to the default interface class
                return sqrt(a*100);
            }
        };
        System.out.println(formula.calculate(5));
        System.out.println(formula.sqrt(25));
    }
    private static void inJava8() {
        // Straight forward solution, but the Interface needs to be a Functional one.
        // In most of the cases tha lambda expression can not access the interface default methods.
        Formula formula = a -> Math.sqrt(a*100);
        System.out.println(formula.calculate(5));
    }
}
