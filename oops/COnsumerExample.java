import java.util.function.Consumer;

public class COnsumerExample {
    public static void main(String[] args) {
        Consumer<String> pc = s-> System.out.println(s);

        pc.accept("hello preet ");
    }
}
