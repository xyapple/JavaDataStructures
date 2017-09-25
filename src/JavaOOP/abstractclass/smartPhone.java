package JavaOOP.abstractclass;

public class smartPhone extends Telphone implements IPlayGame{
    public void call(){
        System.out.println("Call anyone anywhere. Through smartphone");
    }
    public void message(){
        System.out.println("Message anyone anywhere. Through smartphone");
    }
    public void playGame(){
        System.out.println("Smartphone can play video game.");
    }
}
