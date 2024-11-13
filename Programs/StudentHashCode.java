public class StudentHashCode {
    static int last_roll_no=100;
    int roll_no;
    StudentHashCode(){
        roll_no=last_roll_no;
        last_roll_no++;
    }
    @Override
    public int hashCode(){

        return roll_no;
    }
    public static void main(String[] args) {
        StudentHashCode s= new StudentHashCode();
        System.out.println(s);
        System.out.println(s.toString());
        System.out.println(s);
        System.out.println(s.toString());
    }
}
