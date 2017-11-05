package JavaOOP;

public class NestClass1 {
    // variable
    private String name = "Hello";
    private int age = 20;
    
    // Create a Inner class
    public class Inner{
        String name = "World";
        public void show(){
            System.out.println("Outter Class name: " + NestClass1.this.name);
            System.out.println("Inner Class name: "+ name);
            System.out.println("Outter Class age: " + NestClass1.this.age);
        }
    }
    
    public static void main(String[] args) {
        //创建外部类的对象
        NestClass1 outter = new NestClass1();
        //创建内部类的对象
        Inner inner = outter.new Inner();
        //调用内部类对象的show方法
        inner.show();
    }
    
}
