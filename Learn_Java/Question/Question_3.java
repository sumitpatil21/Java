import java.util.Scanner;

public class Question_3 {
    static void Prime(int x)
    {
        if(x>0)
        {
            if(x%1==0 && x%x==0)
            {   
                System.out.println("Number is Prime.....");
            }
            else
            {
                System.out.println("Number is Not Prime.....");
            }
        }
    }
    public static void main(String[] args) {
     int n=0;
     Scanner user=new Scanner(System.in);
     System.out.printf("Enter a Number :");
     n=user.nextInt();
     Prime(n);

    }
}
