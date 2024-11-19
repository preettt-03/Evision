public class ClonilingObject implements Cloneable{
     String name;
     int id;
      ClonilingObject(String name, int id){
        this.name=name;
        this.id=id;
      }

      void display(){
        System.out.println("id : "+ id);
        System.out.println("name : "+name);
      }


    public static void main(String[] args) throws CloneNotSupportedException {
        ClonilingObject obj1= new ClonilingObject("preet",1);
        obj1.display();

        ClonilingObject obj2 =(ClonilingObject) obj1.clone();
        obj2.name="ashish";
        obj2.display();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

    }
}
