import java.util.Scanner;
public class Question_5 {
    static long Factorial(int n)
    {
       if(n==0)
        {
            return 1;
        }
        else
        {
            return n*Factorial(n-1);
        }
    } 
    public static void main(String[] args) {
        int x;
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Enter a Number :");
        x=scanner.nextInt();
        System.out.println(Factorial(x));

    }
}
