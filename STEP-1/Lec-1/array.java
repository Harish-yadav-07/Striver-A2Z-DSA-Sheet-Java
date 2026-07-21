public class array {
    public static void main(String[] args) {

        Object[] arr = {
            10,
            "Harish",
            1.1,
            null,
            true,
            null,      // Java me undefined nahi hota
            new Object(),
            'H',
            50
        };

        // Print complete array
        System.out.println(java.util.Arrays.toString(arr));

        // Print array type
        System.out.println(arr.getClass().getName());

        // Access elements
        System.out.println(arr[0]);
        System.out.println(arr[3]);

        // Length of array
        System.out.println(arr.length);

        // Update element
        arr[2] = 100;
        System.out.println(java.util.Arrays.toString(arr));
    }
}