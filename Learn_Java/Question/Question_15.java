import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question_15 {
    public static void main(String[] args) {
        List<Integer> array1 = new ArrayList<>();
        List<Integer> array2 = new ArrayList<>();
        List<Integer> array3 = new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        int n,user;
        System.out.println("Enter A first List :");
        System.out.printf("Enter a List Length :");
        n=scanner.nextInt();
        
        for(int i=0;i<n;i++)
        {
            System.out.printf("Enter Data :");
            user=scanner.nextInt();
            array1.add(user);
        }
        System.out.println("Enter A Sec List :");
        for(int i=0;i<n;i++)
        {
            System.out.printf("Enter Data :");
            user=scanner.nextInt();
            array2.add(user);
        }

        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(array1.get(i)==array2.get(j))
                {
                    array3.add(array1.get(i));
                }
            }
        }
        System.out.println(array3);
    }
}
