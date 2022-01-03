import java.util.Scanner;

public class ComplexAddition {

    int real,img;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real number");
        real = sc.nextInt();
        System.out.println("Enter imaginary value");
        img = sc.nextInt();
    }
    void add(ComplexAddition  ob1 , ComplexAddition ob2){
        real = ob1.real+ob2.real;
        img  = ob1.img+ ob2.img;

    }
    void show(){
        System.out.println("Complex Number is "+real+" i "+img);
    }

    public static void main(String[] args) {
        ComplexAddition obj1 = new ComplexAddition();
        obj1.input();
        ComplexAddition obj2 = new ComplexAddition();
        obj2.input();
        obj2.add(obj1,obj2);
        obj2.show();
    }
}
