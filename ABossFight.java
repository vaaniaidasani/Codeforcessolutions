import java.util.*;

public class ABossFight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];
            Map<Integer, Integer> freq = new HashMap<>();

            long total = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                total += a[i];

                freq.put(a[i], freq.getOrDefault(a[i], 0) + 1);
            }

            int maxCount = 0;
            int maxValue = 0;

            for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    maxValue = entry.getKey();
                }
            }

            int other = n - maxCount;

            long answer;

            if (maxCount <= other + 1) {
                // All cards can be played.
                answer = total;
            } else {
                // Only other + 2 copies of the dominant value can deal damage.
                int usefulCopies = other + 2;

                answer = (long) other * 0; // placeholder
                answer = total - (long) maxCount * maxValue
                        + (long) usefulCopies * maxValue;
            }

            System.out.println(answer);
        }

        sc.close();
    }
}