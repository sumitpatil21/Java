public class Question_2 {
    public static void main(String[] args) {
        int f=0,l=1;
        for(int i=0;i<10;i++)
        {
            System.out.println(f);
            int n=f+l;
            f=l;
            l=n;

        }
    }
}
