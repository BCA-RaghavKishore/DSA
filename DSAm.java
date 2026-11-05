//  Find duplicate numbers in an array
import java.util.HashSet;
import java.util.Set;

public class DSAm {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {

            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        for (int num : duplicates) {
            System.out.println("Duplicate number: " + num);
        }
    }
}