class Box {
    int value;

    Box(int value) {
        this.value = value;
    }
}

public class fnPassByValue {

    // Pass by Value (Primitive)
    static void modifyPrimitive(int x) {
        x = x + 10;
        System.out.println("Inside function (primitive): " + x);
    }

    // Pass by Value (Object Reference)
    static void modifyObject(Box obj) {
        obj.value = obj.value + 10;
        System.out.println("Inside function (object): " + obj.value);
    }

    public static void main(String[] args) {

        // Primitive
        int num = 5;
        modifyPrimitive(num);
        System.out.println("Outside function (primitive): " + num);

        // Object
        Box myObj = new Box(5);
        modifyObject(myObj);
        System.out.println("Outside function (object): " + myObj.value);
    }
}