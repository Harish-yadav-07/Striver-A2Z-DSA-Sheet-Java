import java.math.BigInteger;
import java.util.HashMap;

public class datatypes {
    public static void main(String[] args) {

        // String
        String username = "Alice";

        // Integer
        int age = 25;

        // Boolean
        boolean isStudent = true;

        // Null (Java me undefined nahi hota)
        String address = null;

        // Null
        String car = null;

        // Object (HashMap)
        HashMap<String, String> person = new HashMap<>();
        person.put("firstName", "Bob");
        person.put("lastName", "Smith");

        // Array
        int[] numbers = {1, 2, 3, 4, 5};

        // Symbol ka direct equivalent Java me nahi hai
        Object id = new Object();

        // BigInteger (BigInt equivalent)
        BigInteger bigNumber = new BigInteger(
                "1234567890123456789012345678901234567890"
        );

        // Logging types
        System.out.println(username.getClass().getSimpleName());      // String
        System.out.println(((Object) age).getClass().getSimpleName()); // Integer
        System.out.println(((Object) isStudent).getClass().getSimpleName()); // Boolean
        System.out.println(address == null ? "null" : address.getClass().getSimpleName());
        System.out.println(car == null ? "null" : car.getClass().getSimpleName());
        System.out.println(person.getClass().getSimpleName());         // HashMap
        System.out.println(numbers.getClass().getSimpleName());        // int[]
        System.out.println(id.getClass().getSimpleName());             // Object
        System.out.println(bigNumber.getClass().getSimpleName());      // BigInteger
    }
}