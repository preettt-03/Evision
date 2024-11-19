class Parent{
   protected Parent(){
        System.out.println("Hello I am Parent Class Constructor");
    }
    Parent(String name){
        System.out.println("parent constructor "+ name);

    }
}

public class ConstructorChaning extends Parent {
    private ConstructorChaning(){
        super();
    System.out.println("Hello I am Child class Constructor");
   }
   ConstructorChaning(String name){
    super(name);
    System.out.println(name);
   }
   void Parent(){
    System.out.println("i am parent method");
   }

   public static void main(String[] args) {
    // ConstructorChaning ob = new ConstructorChaning();
    ConstructorChaning obj = new ConstructorChaning("preet");
    obj.Parent();
   }
}
