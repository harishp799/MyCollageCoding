import java.util.*;

public class arraydemo {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("enetr how many elements do you want to enter :");
        int n = ip.nextInt();
        int num[] = new int[n];// {3,34,76};
        for (int a = 0; a < n; a++) {
            System.out.println("enter the element ");
            int m = ip.nextInt();
            num[a] = m;
        }
        System.out.println();
        System.out.println("array created :");
        for (int k : num) {
            System.out.print(k + " ");
        }
    }
}