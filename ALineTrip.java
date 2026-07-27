import java.util.*;

public class ALineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int prev = 0;
            int maxGap = 0;
            int last = 0;

            for (int i = 0; i < n; i++) {
                int curr = sc.nextInt();
                maxGap = Math.max(maxGap, curr - prev);
                prev = curr;
                last = curr;
            }

            maxGap = Math.max(maxGap, 2 * (x - last));

            System.out.println(maxGap);
        }

        sc.close();
    }
}