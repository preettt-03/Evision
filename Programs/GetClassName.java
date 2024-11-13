public class GetClassName {
    public static void main(String[] args) {
        Object obj = new Object();
//        Class c=obj.getClass();
//        System.out.println(c.getName());

        System.out.println(obj.getClass().getName());
    }
}
