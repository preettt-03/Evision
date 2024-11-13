

class Dog{
    private String color;
    String getColor(){
        return this.color;
    }
    void setColor(String color){
        this.color = color;
    }
}

class Encapsulation{
    public static void main(String[] args) {
       Dog d = new Dog();
       d.setColor("red");
       System.out.println(d.getColor());

    }
}