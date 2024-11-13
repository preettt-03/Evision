import java.util.IdentityHashMap;
import java.util.Map;

public class IHM {
    public static void main(String[] args) {
        Map<String, String> map = new IdentityHashMap<>();
        map.put("100","preet");
        map.put("101","yash");
        map.put("103","ashish");
        map.put("102","rohan");
        System.out.println(map);

        map.put(new String("101"),"patel");
        System.out.println(map);


        map.remove("101");
        System.out.println(map);

        System.out.println(map.get(new String("101")));
        map.remove(new String("101"));
        System.out.println(map);
        
    }
}
