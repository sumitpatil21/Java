import java.util.Scanner;

public class Question_16 {
    public static void main(String[] args) {
        String name, rev = "";
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a Word :");
        name = scanner.nextLine();
        boolean ch=true;
        for (int i = name.length() - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println(rev);
        for (int i = 0; i <= name.length(); i--) {

            if (name.charAt(i) == rev.charAt(i)) {
                ch=true;
            } else {
                ch=false;
            }
        }
        if (ch) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
