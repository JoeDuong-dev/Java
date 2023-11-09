import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp {
    // Void methods return nothing.
    public static void main(String[] args) {
        int age = 28;

        // Strings are objects in Java.
        String name = "Joe Duong"; // This is a string literal.
        String name1 = new String("Joe Duong");

        System.out.println("My name is " + name + " and I am " + age + ".");

        String[] splittedName = name1.split(" ");
        System.out.println(splittedName[0]);
        System.out.println(splittedName[1]);

        // Arrays
        int[] arr = new int[5];
        arr[0] = 1;
        arr[2] = 4;
        arr[4] = 10;
        System.out.println(arr[2]);

        String[] fullName = { "Joe", "Q", "Duong" };

        // Both for loops do the same thing.
        for (int i = 0; i < fullName.length; i++) {
            System.out.print(fullName[i] + " ");
        }
        System.out.println();

        for (String i : fullName) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Backwards loop
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i) + " ");
        }
        // Simple function to get only even numbers in an array using modulus (%)
        int[] num = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i : num) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Array list
        List<String> myArrayList = new ArrayList<String>(0);
        myArrayList.add("Joe");
        myArrayList.add("Q");
        myArrayList.add("Duong");

        System.out.println(myArrayList.get(0));
        for (String i : myArrayList) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Converting a normal array to array list
        List<String> nameArrayList = Arrays.asList(fullName);

        System.out.println(nameArrayList);
        nameArrayList.contains("Joe");

        // Calling methods from the GetUserNames class
        GetUserData method = new GetUserData();
        method.printName();
        System.out.println("My age is " + method.getAge());
    }
}