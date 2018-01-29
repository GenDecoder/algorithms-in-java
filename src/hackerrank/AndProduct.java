package hackerrank;

public class AndProduct {
    public static void main(String[] args) {
        System.out.println(solution(12, 15));
    }
    static long solution(long a, long b) {
        long result = a;
        while (a < b) {
            a++;
            result &= a;
        }
        return result;
    }
}
