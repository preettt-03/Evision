public class ClassExample2 implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    String name = "Preet Patel";

    public static void main(String[] args) {
        ClassExample2 ex = new ClassExample2();
    try{
        ClassExample2 ex1 = (ClassExample2)ex.clone();
        
        System.out.println(ex1.name);
    }catch(CloneNotSupportedException e){
        e.printStackTrace();
    }
    }
}
