import java.util.ArrayList;
import java.util.List;

public class Solution {
  public static List<Integer> fiveSort(List<Integer> array) {
    // Initialize two variables i for the current element, j for the last elements
    int i = 0;
    int j = array.size() - 1;

    // Loop until i and j cross each other
    while (i <= j)
    {
      // If loop that if current element is 5 then swap it with the last elements
      if (array.get(i) == 5)
      {
        // Store the element in a temp variable number.
        int number = array.get(i);  

        // Set the element at j to 5
        array.set(i, array.get(j));

        //Set the element i to number
        array.set(j, number);

        // decrementing j to the new non-five element
        j--;
      }
      else
      {
        // else increment i to the next element
        i++;
      }
    }
    // return the sorted arraylist
    return array;
  }

  public static void main(String[] args) 
  {
    // this function behaves as `main()` for the 'run' command
    ArrayList<Integer> array = new ArrayList<Integer>(List.of(12,5,1,5,12,7));
    System.out.println("Array after sorted: " + Solution.fiveSort(array));
  }
}