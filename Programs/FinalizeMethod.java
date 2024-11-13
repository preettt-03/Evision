public class FinalizeMethod {
    @Override
    protected void finalize(){
        System.out.println("finalize method call");
    }
    public static void main(String[] args) {
        FinalizeMethod f=new FinalizeMethod();

        System.out.println(f.hashCode());

        f=null;
        System.gc();
        System.out.println("end program");
        // its gives a nullPointException
//        System.out.println(f.hashCode());



    }

}
