package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class ConstructingNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i = 0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = canConstruct(a);
            System.out.println(result);
        }
        in.close();
    }
    static String canConstruct(int[] array) {
        int sum = 0;
        for (int item : array) {
            while(item > 0) {
                sum += item % 10;
                item = item / 10;
            }
        }
        return sum % 3 == 0 ? "Yes" : "No";
    }
}
