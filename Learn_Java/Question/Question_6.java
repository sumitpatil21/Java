import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         List<Integer> numbers = new ArrayList<>();
        int x=0;
        int user=0;
        int n;
        System.out.printf("Enter a Array of Length :");
        n=scanner.nextInt();
        for (int i=0;i<n;i++) {
            System.out.printf("Enter a Value :");
            user=scanner.nextInt();
            numbers.add(user);
           
        }
        for (int i=0;i<n;i++) {
             if(numbers.get(i)>x)
            {
                
                x=numbers.get(i);
            }
        }
        System.out.println(x);
    }
}
