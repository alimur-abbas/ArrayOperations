import java.util.Arrays;
import java.util.Scanner;
public class InsertElement {
    public static void main(String[] args) {
        int[] arr = new int[30];
        int size, item, pos, index;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        size = sc.nextInt();
        for (int i=0; i<size; i++)
        {
            System.out.println("Enter value for Array");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value to be inserted");
        item = sc.nextInt();
        System.out.println("ENTER THE INDEX");
        pos = sc.nextInt();
        if (pos >= size) {
            System.out.printf("Insertion is not allowed");

        }
        else
        {
            size++;
            index = size -2;
            while (index >= pos)
            {
                arr[index+1]= arr[index];
                index--;

            }
            arr[pos] = item;
            System.out.println(Arrays.toString(arr));
        }
    }
}
