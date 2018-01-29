package hackerrank;

import java.util.Scanner;

public class XoringNinja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < t; i += 1) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for( int j = 0; j < n; j += 1) {
                a[j] = scanner.nextInt();
            }
            System.out.println(solution(n, a));
        }
        scanner.close();
    }
    static int solution(int n, int[] a) {
        int sum = 0;
        for(int i = 0; i < n; i += 1) {
            sum += a[i];
        }
        return sum;
    }
}
