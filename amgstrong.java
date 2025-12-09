import java.util.Scanner;

public class amgstrong {
    public static void main(String args[]) {
        int p = 0, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the positive number : ");
        int a = sc.nextInt();
        int b = a, c = a;
        while (a > 0) {
            a = a / 10;
            p += 1;
        }
        while (b > 0) {
            sum += Math.pow(b % 10, p);
            b = b / 10;
        }
        if (sum == c)
            System.out.println("it is an amstrong number");
        else
            System.out.println("not  a amstrong number");
    }
}