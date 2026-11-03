// find the frequency of each number in an array.abstract 
import java.util.HashMap;
import java.util.Map;
public class DSAb {
    public static void main (String[] args) {
        int[] arr ={1,2,2,3,1,1};
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : arr) {
            frequency.put(
                num,
                frequency.getOrDefault(num, 0) + 1
            );
        }
        System.out.println(frequency);
    }
    
}
