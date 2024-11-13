class MyClass {
    static int staticVar = 10;
    int instanceVar = 20;

    static void staticMethod() {
        System.out.println("Static method called");
        System.out.println(staticVar);
        // System.out.println(instanceVar);   // Allowed
        // System.out.println(instanceVar); // Error: Cannot access instance variable
    }

    void instanceMethod() {
        System.out.println("Instance method called");
    }
}

public class Static_can_use_instance_methods {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Calling static method through the class
        // MyClass.staticMethod();  // Output: Static method called

        // Calling static method through an object (not recommended, but allowed)
        obj.staticMethod();  // Output: Static method called
    }
}


