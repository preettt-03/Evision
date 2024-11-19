class OuterClass {
    static class StaticNestedClass {
        void display() {
            System.out.println("Inside static nested class");
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        OuterClass1.StaticNestedClass nestedObj = new OuterClass1.StaticNestedClass();
        nestedObj.display();  // Output: Inside static nested class
        // StaticInnerClass.display();    // its not work
    }
}

