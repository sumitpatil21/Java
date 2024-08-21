import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Question_14 {
    public static void main(String[] args) {
        ArrayList<Integer> number =new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        int n,user;
        System.out.printf("Enter a List Length :");
        n=scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.printf("Enter Data :");
            user=scanner.nextInt();
            number.add(user);
        }
        System.out.println(number);
        Collections.shuffle(number);
        System.out.println(number.get(0));
    }
}
