import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] arg){
        ArrayList al =new ArrayList();
        al.add("preet");
        al.add("patel");
        al.add("ashish");
        al.add("yash");
        al.add("dherru");
        System.out.println(al);
        ListIterator lt = al.listIterator();
        while(lt.hasNext()){
            String s = (String)lt.next();

            if(s.equals("patel")){
                lt.remove();
            }else if(s.equals("dherru")){
                lt.add("rahul");
            }else if(s.equals("dherru")){
                lt.set("vinay");
            }
        }
        System.out.println(al);
    }
}
