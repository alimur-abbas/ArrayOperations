import java.util.*;


    class base
    {
        int a;
        void disp()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter num");
            a=sc.nextInt();
        }
    }
    class subc extends base
    {
        int b;
        void get()
        {
            Scanner x=new Scanner(System.in);
            System.out.println("enter another num");
            b=x.nextInt();
        }
        void cal()
        {
            if(a>b)
                System.out.println(b+"is smallest");
            else
                System.out.println(a+"is smallest");

        }

    }
    class anosubc extends subc
    {

        int c;
        void get1()
        {
//            System.out.println(a);
            Scanner s=new Scanner(System.in);
            System.out.println("enter another num");
            c=s.nextInt();
        }
        void calcu()
        {
//            System.out.println(a);

            if(a>c)
                System.out.println(c+"is smallest");
            else
                System.out.println(a+"is smallest");

        }
    }

class Run {
    public static void main(String[] args) {
        subc obj = new subc();
        obj.disp();
        obj.get();
        obj.cal();
        anosubc ob = new anosubc();
         ob.disp();
        ob.get1();
        ob.calcu();
//        System.out.println(obj.a);
//        System.out.println(ob.a);
    }
}


