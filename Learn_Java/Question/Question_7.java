import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        String name="sumit";
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Enter a name :");
        name = scanner.nextLine();

        for(int i=name.length()-1;i>=0;i--)
        {
            System.out.print(name.charAt(i));
        }
    }
}
