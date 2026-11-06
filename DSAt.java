// Find the longest subarray with a given sum
import java.util.HashMap;
import java.util.Map;

public class DSAt {
    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 1, 1, 3, 2};
        int target = 3;

        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLength = 0;

        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (map.containsKey(sum - target)) {

                int length = i - map.get(sum - target);

                maxLength = Math.max(maxLength, length);
            }

            map.putIfAbsent(sum, i);
        }

        System.out.println("Longest subarray length: "
                           + maxLength);
    }
}