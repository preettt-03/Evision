public class StaticNestedClass {
    public int x=10;
    private int y=20;
    static class InnerClass{
        public void show(){
            System.out.println("Inner class");
        }
    }
    public static void main(String[] args) {
        StaticNestedClass.InnerClass ii= new StaticNestedClass.InnerClass();
        ii.show();
    }
}
