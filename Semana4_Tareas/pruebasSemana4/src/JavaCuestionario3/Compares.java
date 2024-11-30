package JavaCuestionario3;
import java.util.*;

public class Compares {
    public static void main(String[] args) {
        String[] cities = {"Bangalore", "Pune", "San Francisco", "New York City"};
        MySort ms = new MySort();
        Arrays.sort(cities, ms);
        System.out.println(Arrays.binarySearch(cities, "New York City"));
    }

    //    static class MySort implements Comparator {
    static class MySort implements Comparator<String> {
        public int compare(String a, String b) {
            return b.compareToIgnoreCase(a);
        }
    }
}


