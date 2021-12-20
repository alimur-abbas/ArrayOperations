
import java.util.*;

public class Aoperations {
    void clockWiseRotation(int arr[],int n)
    {
        System.out.println("Array before Rotation"+Arrays.toString(arr));
        for(int i = 0; i < n; i++)
        {
            int j, last;
            last = arr[arr.length-1];

            for(j = arr.length-1; j > 0; j--)
            {
                arr[j] = arr[j-1];
            }
            arr[0] = last;
            System.out.println("Array after Rotation"+Arrays.toString(arr));
        }
    }
    void antiClockwiseRotation(int arr[], int n)
    {
        System.out.println("Array before Rotation"+Arrays.toString(arr));
        for(int i = 0; i < n; i++)
        {
            int j, first;
            first = arr[0];
            for(j = 0; j < arr.length-1; j++)
            {
                arr[j] = arr[j+1];
            }
            arr[j] = first;
            System.out.println("Array after Rotation"+Arrays.toString(arr));
        }

    }
    void revereWithoutAnotherArray(int arr[])
    {
        System.out.println("Array before Reverse"+Arrays.toString(arr));
        int middle = arr.length / 2;

        int temp;
        int j = arr.length -1;

        for (int i = 0 ; i < middle; i++) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        System.out.println("Array After Reverse"+Arrays.toString(arr));
    }
    int[] reverseWithAnotherArray(int arr[],int n )
    {
        System.out.println("Array before Reverse"+Arrays.toString(arr));
        int j = n-1;
        int revArray[] = new int[n];
        for(int i =0; i<n;i++){
            revArray[i] = arr[j];
            j--;
        }
        System.out.println("Array after Reverse"+Arrays.toString(revArray));
        return (revArray);
    }
    void bubbleSort(int arr[] , int n)
    {
        System.out.println("Array before Sorting"+Arrays.toString(arr));
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        System.out.println("Array after sorting"+Arrays.toString(arr));
    }

    void selectionSort(int arr[], int n)
    {
        System.out.println("Array before Sorting"+Arrays.toString(arr));
        for (int i = 0; i < n- 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < n; j++){
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        System.out.println("Array after sorting"+Arrays.toString(arr));
    }

    void insertionSort(int arr[] , int n){
        System.out.println("Array before sorting"+Arrays.toString(arr));

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println("Array after sorting"+Arrays.toString(arr));
    }
    void getLargestElement(int arr[]){
        System.out.println("Given Array is:"+Arrays.toString(arr));
        int i;

        int max = arr[0];

        for (i = 1; i < arr.length; i++)
        {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element in the given array is:"+max);
    }
    void arrayPalindrone(int arr[] ,int size)
    {
        int revArray[] = new int [size];
        revArray = reverseWithAnotherArray(arr,size);
        if (arr==revArray)
        {
            System.out.println("Array is palindrone");
        }
        else
        {
            System.out.println("Array is not palindrone");
        }
    }
    void getSecondLargestElement(int arr[],int size){
        System.out.println("Given Array is:"+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Second largest Element is:"+arr[size-2]);

    }
    
    void deleteElementAtGivenPos(int arr[],int size ,int index){
        System.out.println("Given Array is:"+Arrays.toString(arr));
        if(index<=size)
        {
            size = arr.length-1;
            int i;
            int arr1[] = new int [size];
            for ( i = 0 ;i < size ; i++)
            {
                if (i == index)
                    break;
                arr1[i] = arr[i];

            }
            for (int k= i; k< size ; k++)
            {
                arr1[k]=arr[k+1];
            }
            System.out.println("After deletion Array is:"+Arrays.toString(arr1));
        }
        else
        {
            System.out.println("Entered position is out of Bound");
        }
    }

    void insertElementAtGivenPos(int arr[],int size,int index , int key)
    {
        if(index<=size)
        {
            size = arr.length + 1;
            System.out.println("Given Array is:"+Arrays.toString(arr));
            int result[] = new int[size];
            for (int i = 0; i < index; i++) {
                result[i] = arr[i];
            }

            result[index] = key;

            for (int i = index + 1; i < size; i++) {
                result[i] = arr[i - 1];
            }
            System.out.println("After insertion Array is:"+Arrays.toString(result));
        }
        else
        {
            System.out.println("Entered position is out of Bound");
        }

    }
    void insertElementBeforeThePos(int arr[] , int size , int  index ,int key){
        index= index-1;
        if(index<=size)
            insertElementAtGivenPos( arr, size, index,key);
        else
            System.out.println("Previous index of Given index is  also out of Bound");
    }

    void insertElementAfterThePos(int arr[] , int size , int  index ,int key){
        index= index+1;
        if(index<=size)
            insertElementAtGivenPos( arr, size, index,key);
        else
            System.out.println(" Next index of Given index is  also out of Bound");
    }
    void deleteElementBeforeThePos(int arr[],int size ,int index){
        index= index-1;
        if(index<=size)
            deleteElementAtGivenPos(arr,size,index);
        else
            System.out.println("Previous index of Given index is also out of Bound");

    }
    void deleteElementAfterThePos(int arr[],int size ,int index){
        index= index+1;
        if(index<=size)
            deleteElementAtGivenPos(arr,size,index);
        else
            System.out.println(" Next index of Given index is also out of Bound");

    }
    void getPrimeNumbersFromArraay(int arr[],int size)
    {
        System.out.println("Given Array is:"+Arrays.toString(arr));
        System.out.print("All prime numbers are:");

        for ( int i = 0; i < size; i++) {
            int j = 2;
            int p = 1;
            while (j < arr[i]) {
                if (arr[i] % j == 0) {
                    p = 0;
                    break;
                }
                j++;
            }
            if (p == 1) {
                System.out.print(" " + arr[i]);
            }
        }
    }

}
