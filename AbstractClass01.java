abstract class Parent3{
    Parent3(){
        System.out.println("i am a constructor of Parent3! ");
    }

    public void sayHello(){
        System.out.println("I am saying Hello to all of you! ");
    }

    abstract public void greet();
}

class Child2 extends Parent3{
    public void greet(){
        System.out.println("Good Morning! ");
    }

}

abstract class Child3 extends Parent3{
    public void th(){
        System.out.println("I am Good! ");
    }
}

public class AbstractClass01{
    public static void main(String[] args) {
        Child2 c= new Child2();
        c.greet();
    }
}