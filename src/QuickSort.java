import java.util.Random;
public class QuickSort {
        public static void main(String[] args) {
            Random rand = new Random();
            int[] numbers = new int[10];

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = rand.nextInt(100);
            }
            System.out.println("Before:");
            printArray(numbers);

            quicksort(numbers);

            System.out.println("\nAfter:");
            printArray(numbers);
        }
        // overloaded method ......just to make the code cleaner..
        private static void quicksort(int[] array) {
            quicksort(array, 0, array.length - 1);
        }
        private static void quicksort(int[] array, int lowIndex, int highIndex) {
            // For length = 1 array..
            if (lowIndex >= highIndex) {
                return;
            }
        //Choosing random pivot....Which can further improve average performance..



            int leftPointer = partition(array, lowIndex, highIndex);

            quicksort(array, lowIndex, leftPointer - 1);
            quicksort(array, leftPointer + 1, highIndex);

        }
    static int partition(int[] arr, int low, int high)
    {
        int pivotIndex = new Random().nextInt(high - low) + low;
        int pivot = arr[pivotIndex];
        swap(arr, pivotIndex, high);

        // pivot
        //int pivot = arr[high];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for(int j = low; j <= high - 1; j++)
        {

            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot)
            {

                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
        private static void swap(int[] array, int index1, int index2) {
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }

        private static void printArray(int[] numbers) {
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        }
    }

