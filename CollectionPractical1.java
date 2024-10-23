import java.util.Collection;
import java.util.LinkedList;

class CollectionPractical1 {
    public static void main(String[] args) {
        // Declare a Collection and initialize it as a LinkedList
        Collection<Integer> c = new LinkedList<>();

        // Add five integer elements to the Collection
        c.add(5);
        c.add(15);
        c.add(25);
        c.add(35);
        c.add(45);

        // Check if the Collection is empty and print the result
        System.out.println("Is the collection empty? " + c.isEmpty());

        // Print the size of the Collection
        System.out.println("Size of the collection: " + c.size());

        // Check if the Collection contains a specific element (e.g., 25) and print the result
        int elementToCheck = 25;
        System.out.println("Does the collection contain " + elementToCheck + "? " + c.contains(elementToCheck));

        // Remove a specific element from the Collection (e.g., 15)
        int elementToRemove = 15;
        c.remove(elementToRemove);
        System.out.println("Removed " + elementToRemove + " from the collection.");

        // Display the remaining elements in the Collection
        System.out.println("Remaining elements in the collection: " + c);
    }
}
