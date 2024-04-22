abstract class Top1{
    Top1(){
        System.out.println("Iam a constructor of Top1! ");
    }

    public void laugh(){
        System.out.println("I am laughing! ");
    }

    abstract public void play();
}

class Top2 extends Top1{
    Top2(){
        System.out.println("I am a constructor of Top2! ");
    }

    public void play(){
        System.out.println("I am playing Cricket as I am Top2! ");
    }
}

abstract class Top3 extends Top1{
    Top3(){
        System.out.println("I am a constructor of Top3! ");
    }
}


public class AbstractClass02 {
    public static void main(String[] args) {
        Top2 t2=new Top2();
        t2.laugh();
        t2.play();
    }
    
}
