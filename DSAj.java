// Find the missing number
public class DSAj {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6};

        int n = 6;

        int total = n * (n + 1) / 2;

        int sum = 0;

        for (int num : arr) {
            sum = sum + num;
        }

        int missing = total - sum;

        System.out.println("Missing number: " + missing);
    }
}