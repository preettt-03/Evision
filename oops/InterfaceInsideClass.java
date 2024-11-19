class OuterClass1 {
    // Nested Interface
    public void display1(){
        System.out.println("display of outer class");
    }
    public interface InnerInterface {
    
        void display();

        default void hello(){
            System.out.println("hello hello");
        }
        static void hello2(){
            System.out.println("this is static class");
        }
    }
    
    }
    
    class ImplementingClass implements OuterClass1.InnerInterface {
        @Override
        public void display() {
            System.out.println("Nested interface method implementation");
        }
    }
    
    public class InterfaceInsideClass {
        public static void main(String[] args) {
            OuterClass1.InnerInterface obj = new ImplementingClass();
            obj.display();
            OuterClass1 obj1 = new OuterClass1();
            obj1.display1();
            obj.hello();
            OuterClass1.InnerInterface.hello2();
            
        }
    }
    