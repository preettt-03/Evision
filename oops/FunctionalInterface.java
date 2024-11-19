
@FunctionalInterface
interface  AB {
public void fly();  
}

public class FunctionalInterface {
    public static void main(String[] args) {
        
    
    AB a=new AB(){
    @Override
    public void fly(){
        System.out.println("flay");
    }
};
a.fly();
    }
}
