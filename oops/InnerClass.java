public class InnerClass {
    private int x =10;
    int y=20;
    public class InnerInnerClass {
     public void show(){
        System.out.println(" this is inner class");
        System.out.println(x);
        System.out.println(y);
     }
        
    }

    public static void main(String[] args) {
        InnerClass.InnerInnerClass x = new InnerClass().new InnerInnerClass();
        x.show();
        InnerClass i = new InnerClass();
        InnerClass.InnerInnerClass ii= i.new InnerInnerClass();
        ii.show();
    }
}
