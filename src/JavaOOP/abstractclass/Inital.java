package JavaOOP.abstractclass;

public class Inital {
    public static void main(String[] args) {
        Telphone cell = new cellphone();
        cell.call();
        cell.message();
        
        Telphone smart = new smartPhone();
        smart.call();
        smart.message();
    }
    
}
