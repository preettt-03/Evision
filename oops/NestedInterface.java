 interface  Parent {
    public void run();

    public static void xyz(){
        System.out.println("interface static method");
    }
    public interface Child {
           public void runFast();
    }
}

class Runner implements Parent,Parent.Child{
    public void run(){
        System.out.println("runner run ");
    }
    public void runFast(){
        System.out.println("runner run faster child interface");
    }
    public void intro(){
        System.out.println("Class intro ");
    }
    public static void abc(){
        System.out.println("class static");
    }
}

public class NestedInterface {
    public static void main(String[] args) {
        Runner r=new Runner();
        Parent p=new Runner();
        r.run();
        r.intro();
        r.runFast();
        // Parent p=new Runner();
        p.run();
    
        Parent.Child c= new Runner();
        c.runFast();

        Runner.abc();
        r.abc();
    }
}
