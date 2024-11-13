public class ExampleOfCloning implements Cloneable {
    private String title;
    private String auther;
    private int year;

    public ExampleOfCloning(String title, String auther, int year){
        this.title=title;
        this.auther=auther;
        this.year=year;
    }

    @Override
    public String toString(){
        return title + " by " + auther + " ( " + year + " ) ";
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null || !(obj instanceof ExampleOfCloning)){
            return false;
        }
        ExampleOfCloning other = (ExampleOfCloning)obj;
        return this.title.equals((other.getTitle()))
                && this.auther.equals(other.getAuther())
                && this.year == other.getYear();
    }
    @Override public int hashCode(){
        int result = 17;
        result = 31 * result + title.hashCode();
        result = 31 * result + auther.hashCode();
        result = 31 * result+year;
        return result;
    }

    @Override
    public ExampleOfCloning clone(){
        try{
            return (ExampleOfCloning)super.clone();
        }catch (CloneNotSupportedException e){
            throw  new AssertionError();
        }
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("Finalizing "+ this);
    }

    public String getTitle(){ return title; }
    public String getAuther(){ return auther; }
    public  int getYear(){ return year; }

    public static void main(String[] args) {

        ExampleOfCloning emp = new ExampleOfCloning("The AntMan", "Parbhu", 1779);
        System.out.println(emp);

        ExampleOfCloning emp2 = emp.clone();
        System.out.println(emp2);
        System.out.println("check emp equals empp2 " + emp.equals(emp2));

        System.out.println("hashcode of emp"+ emp.hashCode());
        System.out.println("hashcode of emp2" + emp2.hashCode());

        emp=null;
        System.gc();
        System.out.println(emp2);
    }
}
