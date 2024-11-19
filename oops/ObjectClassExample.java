public class ObjectClassExample {
    String name;
    String bread;
    int age;
    String color;

    public ObjectClassExample(String name, String bread, int age, String color){
        this.name=name;
        this.bread=bread;
        this.age=age;
        this.color=color;
    }

    public String getName(){
        return name;
    }
    public String getBread(){
        return bread;
    }
    public int getAge(){
        return age;
    }
    public String getColor(){
        return color;
    }
    @Override
    public String toString(){
        return ("Hi my name is " + this.getName() +".\nMy bread, age and color are " + this.getBread() + ", "+ this.getAge() +"," + this.getColor());
    }

    public static void main(String[] args) {
        ObjectClassExample o1 = new ObjectClassExample("rinku","papillon",5,"white_brown");
        System.out.println(o1.toString());
    }
}
