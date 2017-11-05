package JavaOOP;

public class NestClass3 {
    private String name = "Hello";
    
    // 外部类中的show方法
    public void show() {
        // 定义方法内部类
        class MInner {
            int score = 83;
            public int getScore() {
                return score + 10;
            }
        }
        
        // 创建方法内部类的对象
        MInner mi = new MInner();
        
        // 调用内部类的方法
        int newScore = mi.getScore();
        
        System.out.println("Name：" + name + "\nAfter Added Score：" + newScore);
    }
    
    public static void main(String[] args) {
        NestClass3 nc = new NestClass3();
        nc.show();
    }
}
