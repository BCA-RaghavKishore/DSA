import java.util.HashSet;
import java.util.Set;

public class DSAo {
    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {20, 40, 60, 80};

        Set<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        System.out.print("Common elements: ");

        for (int num : arr2) {

            if (set.contains(num)) {

                System.out.print(num + " ");

                set.remove(num);
            }
        }
    }
}