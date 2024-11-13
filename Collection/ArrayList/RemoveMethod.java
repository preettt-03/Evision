import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class RemoveMethod {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(2);
        al.add(4);
        al.add(1);
        al.add(5);
        // al.add("1");
        // al.add("2");
        al.add(7);
        System.out.println(al);
        al.remove(1);
        System.out.println(al);

    } 
}
