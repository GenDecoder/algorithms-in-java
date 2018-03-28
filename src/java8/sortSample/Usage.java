package java8.sortSample;

import java.util.*;

public class Usage {
    public static void main(String[] args) {
        inJava7();
        inJava8();
    }
    private static void inJava7() {
        List<String> list = Arrays.asList("Mario", "Pablo", "Rita", "Nestor", "Melisa");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("In Java 7");
        list.forEach(System.out::println);
    }
    private static void inJava8() {
        List<String> list = Arrays.asList("Mario", "Pablo", "Rita", "Nestor", "Melisa");
        Collections.sort(list, (a, b) -> b.compareTo(a));
        System.out.println("In Java 8");
        list.forEach(System.out::println);
    }
}
