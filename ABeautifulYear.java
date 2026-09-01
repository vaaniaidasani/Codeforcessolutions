import java.util.*;

public class ABeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        while (true) {
            y++;

            String year = String.valueOf(y);
            Set<Character> digits = new HashSet<>();

            for (char c : year.toCharArray()) {
                digits.add(c);
            }

            if (digits.size() == 4) {
                System.out.println(y);
                break;
            }
        }

        sc.close();
    }
}