
import  java .util.Scanner;
public class StringManipulation {

    static String findString(String str)
    {
        str = str.toUpperCase();
        StringBuilder build = new StringBuilder(str);
        String res="";
//        System.out.println("abc");
        if(build.length() < 50 && !str.contains(" ") )
        {


//            build = build.toUpperCase();
           int runningSize = build.length()-3;
        for (int i = 0; i<runningSize;i++)
        {
//            System.out.println("rer");
            if (build.charAt(i)=='S'&& build.charAt(i+2)=='R')
            {

                 build.deleteCharAt(i+1);
//                System.out.println(build.toString());
                res = build.toString();
                runningSize=build.length();
//                System.out.println(res.length());

//                System.out.println(build);
            }
        }

        }

        return res;

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        findString(str);
       System.out.println(findString(str));
    }
}
