import java.util.Scanner;

public class ABlackSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[4];

        for (int i = 0; i < 4; i++) {
            a[i] = sc.nextInt();
        }

        String s = sc.next();

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';   // Converts '1' to 1, etc.
            total += a[digit - 1];
        }

        System.out.println(total);

        sc.close();
    }
}