package JavaOOP;

public class InitailTelphone {
    // 定义静态变量phonePrice1
    static int phonePrice1 = 86;
    // 定义静态变量phonePrice2
    static int phonePrice2 = 92;
    
    // 定义静态方法sum，计算成绩总分，并返回总分
    public static int sum() {
        int totalPrice = phonePrice1 + phonePrice2;
        return totalPrice;
        
    }
    //make a static
    static String name ="phone number 1";
    public static void main(String[] args) {
        Telphone phone = new Telphone();
        Telphone phone2 = new Telphone(5.0f,1.4f,2.f);
        System.out.println("phone's name: "+name);
        
        int totalPriceOfphone = sum();
        System.out.println("Total prices for the two phones "+totalPriceOfphone);
    }
    
}
