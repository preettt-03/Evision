import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsmerE2 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("preet", "rohit", "rahul", "ajay");
        Consumer<String> pc = name -> System.out.println("Name " + name);
        names.forEach(pc);
    }
}
