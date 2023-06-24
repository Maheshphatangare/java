import java.util.LinkedList;
import java.util.List;

public class LinkedListInsertionDSAExample {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Create a List to be inserted into the LinkedList
        List<Integer> listToInsert = List.of(1, 2, 3, 4, 5);

        // Insert the list into the LinkedList
        insertListIntoLinkedList(linkedList, listToInsert);

        // Print the modified LinkedList
        System.out.println("Modified LinkedList: " + linkedList);
    }

    private static void insertListIntoLinkedList(LinkedList<Integer> linkedList, List<Integer> listToInsert) {
        // Traverse the listToInsert
        for (Integer element : listToInsert) {
            // Add each element at the end of the LinkedList
            linkedList.add(element);
        }
    }
}
