class OuterClass {
    static class StaticNestedClass {
        void display() {
            System.out.println("Inside static nested class");
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();
        nestedObj.display();  // Output: Inside static nested class
        // StaticInnerClass.display();    // its not work
    }
}

