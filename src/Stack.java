    import java.util.Scanner;  
    class Stack   
    {  
        int top;   
        int maxsize;  
        Scanner se = new Scanner(System.in);
        System.out.println("Enter Stack Size");
        maxsize = se.nextInt();
        int[] arr = new int[maxsize];  
          
          
        boolean isEmpty()  
        {  
            return (top < 0);  
        }  
        Stack()  
        {  
            top = -1;  
        }  
        boolean push (Scanner sc)  
        {  
            if(top == maxsize-1)  
            {  
                System.out.println("Overflow !!");  
                return false;  
            }  
            else   
            {  
                System.out.println("Enter Value");  
                int val = sc.nextInt();  
                top++;  
                arr[top]=val;  
                System.out.println("Item pushed");  
                return true;  
            }  
        }  
        boolean pop ()  
        {  
            if (top == -1)  
            {  
                System.out.println("Underflow !!");  
                return false;  
            }  
            else   
            {  
                top --;   
                System.out.println("Item popped");  
                return true;  
            }  
        }  
        void display ()  
        {  
            System.out.println("Printing stack elements .....");  
            for(int i = top; i>=0;i--)  
            {  
                System.out.println(arr[i]);  
            }  
        }  
    }  
   