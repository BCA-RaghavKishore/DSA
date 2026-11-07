// Find the intersection of two arrays
import java.util.HashSet;
import java.util.Set;

public class DSAw {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        Set<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        System.out.print("Intersection: ");

        for (int num : arr2) {

            if (set.remove(num)) {
                System.out.print(num + " ");
            }
        }
    }
}