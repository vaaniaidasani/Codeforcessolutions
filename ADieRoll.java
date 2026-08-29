import java.util.*;

public class ADieRoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt();
        int W = sc.nextInt();

        int max = Math.max(Y, W);
        int numerator = 7 - max;
        int denominator = 6;

        int gcd = findGCD(numerator, denominator);

        System.out.println((numerator / gcd) + "/" + (denominator / gcd));
        sc.close();
    }

    static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
         return a;
         
     
    }
}