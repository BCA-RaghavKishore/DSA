// Search for a given number in a sorted array using Binary Search.
public class DSAg {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        int target = 50;

        int start = 0;
        int end = arr.length - 1;

        boolean found = false;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {

                System.out.println("Element found at index: " + mid);
                found = true;
                break;

            } else if (arr[mid] < target) {

                start = mid + 1;

            } else {

                end = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}