import java.util.*;

public class AThresholdMovement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int maxEven = Integer.MIN_VALUE;
            int minOdd = Integer.MAX_VALUE;

            for (int i = 1; i <= n; i++) {
                int w = sc.nextInt();

                if (i % 2 == 0) {
                    maxEven = Math.max(maxEven, w);
                } else {
                    minOdd = Math.min(minOdd, w);
                }
            }

            if (n % 2 == 0 && maxEven + 1 < minOdd) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}