import java.util.Scanner;

public class AMishkaAndGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int mishkaWins = 0;
        int chrisWins = 0;

        for (int i = 0; i < n; i++) {
            int mi = sc.nextInt();
            int ci = sc.nextInt();

            if (mi > ci) {
                mishkaWins++;
            } else if (ci > mi) {
                chrisWins++;
            }
        }

        if (mishkaWins > chrisWins) {
            System.out.println("Mishka");
        } else if (chrisWins > mishkaWins) {
            System.out.println("Chris");
        } else {
            System.out.println("Friendship is magic!^^");
        }

        sc.close();
    }
}