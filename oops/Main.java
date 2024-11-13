
class Outer {
     class Inner{
       static void display(){
            System.out.println("inner class");
        }
    }

    
}

class Main {
    public static void main(String[] aar){
        Outer outer = new Outer();
        Outer.Inner.display(); 
   
    }
    
}
