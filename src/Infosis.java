import java.util.ArrayList;
import java.util.List;

public class Infosis {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(3);
        list1.add(2);

        list2.add(1);
        list2.add(3);
        list2.add(4);

        solution.printSubArrays(list1,0,list1.size());
    }



}

// Java code to print all possible subarrays
// for given array using recursion

class solution
{

    // Recursive function to print all possible subarrays
// for given array
    static void printSubArrays(List<Integer> arr, int start, int end)
    {
        // Stop if we have reached the end of the array
        if (end == arr.size())
            return;

            // Increment the end point and start from 0
        else if (start > end)
            printSubArrays(arr, 0, end + 1);

            // Print the subarray and increment the starting point
        else
        {
            System.out.print("[");
            for (int i = start; i < end; i++){
                System.out.print(arr.get(i)+", ");
            }

            System.out.println(arr.get(end)+"]");
            printSubArrays(arr, start + 1, end);
        }
    }
}

