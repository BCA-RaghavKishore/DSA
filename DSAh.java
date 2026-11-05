// Find the second-smallest number
public class DSAh {
    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 42, 18};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < smallest) {

                secondSmallest = smallest;
                smallest = arr[i];

            } else if (arr[i] < secondSmallest
                    && arr[i] != smallest) {

                secondSmallest = arr[i];
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Second smallest: " + secondSmallest);
    }
}