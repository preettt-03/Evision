import java.util.*;

class Practice{
    public static void main(String[] arr){
      List<Integer> list = new ArrayList<>();
      list.add(1);
      list.add(5);
      list.add(6);
      list.add(7);
      list.add(9);
      list.add(10);
      list.add(3,13);
      System.out.println(list);
      list.remove(4);  
      System.out.println(list.size());
      Integer arr1[] =list.toArray(new Integer[0]);
      for(Integer i:arr1){
        System.out.print(i+" ");
      }

      Iterator itr =list.iterator();
      while(itr.hasNext()){
        System.out.print(itr.next()+ " ");
      }

    }
}