import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        // Create a list with the values
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        // Shuffle the list
        Collections.shuffle(list);

        // Convert the shuffled list back to an array (if needed)
        Integer[] shuffledArray = list.toArray(new Integer[0]);

        // Print the shuffled array
        for (Integer num : shuffledArray) {
            System.out.print(num + " ");
        }
    }
}