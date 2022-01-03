
import java .util.Scanner;
class DateAddition {
    int hr,min,sec;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hours");
        hr = sc.nextInt();
        System.out.println("Enter minutes");
        min = sc.nextInt();
        System.out.println("Enter seconds");
        sec = sc.nextInt();
    }
        void show () {
            System.out.println(hr + " HOURS " + min + " MINUTES " + sec + " SECONDS");

        }
        void add (DateAddition d1, DateAddition d2)
        {
            sec = d1.sec + d2.sec;
            if (sec >= 60) {
//            System.out.println("");
                min = sec / 60;
                sec = sec % 60;
            }
            min = (d1.min + d2.min) + min;
            if (min >= 60) {
                hr = min / 60;
                min = min % 60;
            }
            hr = (d1.hr + d2.hr) + hr;

        }

}
class  DemoDateAddition{
    public static void main(String[] args) {
DateAddition d1 = new DateAddition();
DateAddition d2 = new DateAddition();
DateAddition d3 = new DateAddition();
d1.input();
d2.input();
d3.add(d1 , d2);
d3.show();
}
}
