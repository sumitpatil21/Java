import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
public class Question_8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Set<Integer> set1=Set.of(1, 2, 3, 4, 5);
        Set<Integer> set2=Set.of(1, 7, 9, 3);
        Set<Integer> in=new HashSet<>(set1);
        in.retainAll(set2);

        System.out.println(in);

    }
}
