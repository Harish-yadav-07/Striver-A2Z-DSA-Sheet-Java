public class TimeComplexity {

    // O(1) - Constant Time
    static int getFirstElement(int[] arr) {
        return arr[0];
    }

    // O(n) - Linear Time
    static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // O(n^2) - Quadratic Time
    static void printAllPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i] + " " + arr[j]);
            }
        }
    }

    // O(log n) - Binary Search
    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("O(1): " + getFirstElement(arr));

        System.out.println("O(n): " + sumArray(arr));

        System.out.println("O(n^2):");
        int[] pairArray = {1, 2};
        printAllPairs(pairArray);

        System.out.println("O(log n): " + binarySearch(arr, 3));
    }
}