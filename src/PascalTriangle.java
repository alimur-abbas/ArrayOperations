public class PascalTriangle {


    public static void main(String[] args) {
        int n = 11;
        int i, j;

        for(i = 0; i <= n; i++) {
            for(j = 0; j <= n-i; j++){
                System.out.print(" ");
            }
            for(j = 0; j <= i; j++){
                System.out.print(" "+"*");
            }
            System.out.println();
        }
        for(i=1;i<=4;i++)
        {
            for (j=1;j<=10;j++)
            {
                System.out.print(" ");
            }
            for (j=1;j<=5;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
