import java.util.*;

public class CollectionMethods {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println("size : "+ al.size());
        System.out.println("isEmpty : " + al.isEmpty());
        System.out.println("contains : "+ al.contains(5));
        al.add(5);
        System.out.println("contains : "+ al.contains(5));
        al.remove(3);
        System.out.println("contains : "+ al.contains(3));
        al.remove(Integer.valueOf(3));
        System.out.println("remove value using objects : "+ al.contains(3));


        Stack<Integer> sk = new Stack<>();
        sk.add(6);
        sk.add(7);
        sk.add(8);

        al.addAll(sk);

        System.out.println("addall test using containsAll : "+ al.containsAll(sk));

        al.remove(Integer.valueOf(7));
        System.out.println("containsAll after removing 1 element : " + al.containsAll(sk));
        al.removeAll(sk);
        System.out.println("remove " + al.contains(8));
        al.clear();
        System.out.println("clear : "+ al.isEmpty());
    }
}
