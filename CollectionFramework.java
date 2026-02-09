import java.util.*;

public class CollectionFramework {
    public static void main(String[] args) {
        // Use List instead of Collection for ordered elements
        List<String> list = new LinkedList<>();
        
        // Add initial elements
        list.add("one");
        list.add("two");
        list.add("three");
        
        // Display the initial list
        System.out.println("The list is: " + list);
        
        // Add more elements
        list.add("Last");
        list.add("Element");
        
        // Display the updated list
        System.out.println("The new List is: " + list);
    }
}