import java.util.Scanner;

public class AWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int uppercase = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                uppercase++;
            }
        }

        int lowercase = s.length() - uppercase;

        if (uppercase > lowercase) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }

        sc.close();
    }
}
