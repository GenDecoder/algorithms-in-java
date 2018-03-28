package java8.formulaSample;

// A Functional Interface can have only one abstract method,
// but the number of default methods is not a limit.
@FunctionalInterface
interface Formula {
    double calculate(int a);
    default double sqrt(int a) {
        return Math.sqrt(a);
    }
    default double maths(int a) {
        return a*2;
    }
}