public class PrivateConstructor {
    
    String name;
    int empId;
    private PrivateConstructor(){  
        this.name="preet";
        this.empId =10;
    }
    void display(){
        System.out.println(name+ " "+ empId);
    }

    public static PrivateConstructor getInstance(){
        return new PrivateConstructor();
    }
    public static void main(String[] args) {
        PrivateConstructor obj1 = new PrivateConstructor();
        obj1.display();
        obj1.getInstance();
        obj1.display();
    }
}
