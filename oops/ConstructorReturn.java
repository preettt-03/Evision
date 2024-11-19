public class ConstructorReturn {
     private String name;
      
    public ConstructorReturn(String name){
        this.name=name;  
     }
     void display(){
        System.out.println(name);
     }

    public static void main(String[] args) {
        ConstructorReturn obj1 = new ConstructorReturn("Preet");
        obj1.display();
    }
}
