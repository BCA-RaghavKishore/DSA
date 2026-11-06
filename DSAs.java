// Find a pair with a given sum using Two Pointers
import java.util.Arrays;

public class DSAs {
    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 7, 10};
        int target = 14;

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {

                System.out.println("Pair: "
                    + arr[left] + ", " + arr[right]);
                return;

            } else if (sum < target) {

                left++;

            } else {

                right--;
            }
        }

        System.out.println("Pair not found");
    }
}