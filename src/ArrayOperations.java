import java.util.*;
public class ArrayOperations {

    public static void main(String args[]){
        int size , index , key;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        size = sc.nextInt();
        int arr[] = new int[size];
        for (int i =0; i< size; i++){
            System.out.println("Enter the Array value");
            arr[i] = sc.nextInt();
        }
        Aoperations obj = new Aoperations();
        System.out.println("Click 1 for Array Rotation");
        System.out.println("Click 2 for Array Sorting");
        System.out.println("Click 3 for Array insertion");
        System.out.println("Click 4 for Array Deletion");
        System.out.println("Click 5 for Array Manipulation");
        System.out.println("Plz Enter your preference....");
        int preference = sc.nextInt();


        switch(preference) {
            case 1:
                System.out.println("Click 1 for Clockwise Rotation");
                System.out.println("Click 2 for AntiClockwise Rotation");
                System.out.println("Plz Enter your preference....");
                int Rpreference = sc.nextInt();
                switch (Rpreference) {
                    case 1:
                        System.out.println("Enter number of times u want to rotate");
                        int numberOfRotationC = sc.nextInt();
                        obj.clockWiseRotation(arr, numberOfRotationC);
                        break;

                    case 2:
                        System.out.println("Enter number of times u want to rotate");
                        int numberOfRotationA = sc.nextInt();
                        obj.antiClockwiseRotation(arr, numberOfRotationA);
                        break;

                    default:
                        System.out.println("Enter a valid preference... ");
                        break;
                }
                break;
            case 2:
                System.out.println("Click 1 for Bubble Sort");
                System.out.println("Click 2 for Insertion Sort");
                System.out.println("Click 3 for Selection Sort");
                System.out.println("Plz Enter your preference....");
                int Spreference = sc.nextInt();
                switch (Spreference) {

                    case 1:
                        obj.bubbleSort(arr, size);
                        break;
                    case 2:
                        obj.insertionSort(arr, size);
                        break;
                    case 3:
                        obj.selectionSort(arr, size);
                        break;
                    default:
                        System.out.println("Enter a valid preference... ");
                        break;
                }
                break;

            case 3:
                System.out.println("Click 1 for Insertion at given position");
                System.out.println("Click 2 for Insertion before given position");
                System.out.println("Click 3 for insertion after given position");
                System.out.println("Plz Enter your preference....");
                int ipreference = sc.nextInt();
                System.out.println("Enter position");
                index = sc.nextInt();
                System.out.println("Enter Key value to be entered");
                key = sc.nextInt();

                switch (ipreference) {

                    case 1:
                        obj.insertElementAtGivenPos(arr, size, index, key);
                        break;
                    case 2:
                        obj.insertElementBeforeThePos(arr, size, index, key);
                        break;
                    case 3:
                        obj.insertElementAfterThePos(arr, size, index, key);
                        break;

                    default:
                        System.out.println("Enter a valid preference... ");
                        break;
                }
                break;
            case 4:
                System.out.println("Click 1 for Insertion at given position");
                System.out.println("Click 2 for Insertion before given position");
                System.out.println("Click 3 for insertion after given position");
                System.out.println("Plz Enter your preference....");
                int Dpreference = sc.nextInt();
                System.out.println("Enter position");
                index = sc.nextInt();

                switch (Dpreference) {

                    case 1:
                        obj.deleteElementAtGivenPos(arr, size, index);
                        break;
                    case 2:
                        obj.deleteElementBeforeThePos(arr, size, index);
                        break;
                    case 3:
                        obj.deleteElementAfterThePos(arr, size, index);
                        break;

                    default:
                        System.out.println("Enter a valid preference... ");
                        break;
                }
                break;
            case 5:
                System.out.println("Click 1 for Reversing of Array Using Another Array");
                System.out.println("Click 2 for Reversing of Array  Without Using Another Array");
                System.out.println("Click 3 for largest Number");
                System.out.println("Click 4 for Second largest Number");
                System.out.println("Click 5 for  Check Array is Palindrone ");
                System.out.println("Click 6 for Prime Number Present in a Array");
                System.out.println("Plz Enter your preference....");
                int Mpreference = sc.nextInt();
                switch (Mpreference) {

                    case 1:
                        obj.reverseWithAnotherArray(arr, size);
                        break;
                    case 2:
                        obj.revereWithoutAnotherArray(arr);
                        break;
                    case 3:
                        obj.getLargestElement(arr);
                        break;
                    case 4:
                        obj.getSecondLargestElement(arr, size);
                        break;
                    case 5:
                        obj.arrayPalindrone(arr, size);
                        break;
                    case 6:
                        obj.getPrimeNumbersFromArraay(arr, size);
                        break;
                    default:
                        System.out.println("Enter a valid preference... ");
                        break;
                }
                break;
            default:
                System.out.println("Enter a valid preference... ");
                break;
        }

        }
}
