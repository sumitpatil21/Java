import java.util.Scanner;
import java.util.ArrayList;

public class Question_11 {
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

        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(number.get(i)==number.get(j))
                {
                    number.remove(i);
                }
            }
        }

        System.out.println(number);
        
    }
}
