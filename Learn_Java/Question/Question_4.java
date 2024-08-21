
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question_4 {
    public static void main(String[] args) {
        List<String> names= new ArrayList<>();
        names.add("Sumit");
        names.add("Harsh");
        names.add("Naresh");
        names.add("Rohan");
        names.add("Div");
        names.add("Raj");

        Collections.sort(names);

        for(String name:names)
        {
            System.out.println(name);
        }

    }
}
