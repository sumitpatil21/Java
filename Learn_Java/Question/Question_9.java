import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Enter a Digit :");
        int n=scanner.nextInt();
        int l=0;
        System.out.println(n);
        while (n>0) {
            l+=n%10;
            n/=10;
        }
        System.out.println(l);
    }
}
