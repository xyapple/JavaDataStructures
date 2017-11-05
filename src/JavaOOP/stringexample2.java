package JavaOOP;

public class stringexample2 {
    public static void main(String[] args) {
        // 定义一个字符串
        String s = "aljlkdsflkjsadjfklhasdkjlflkajdflwoiudsafhaasdasd";
        
        // 出现次数
        int num = 0;
        
        // 循环遍历每个字符，判断是否是字符 a ，如果是，累加次数
        for (int i = 0; i<s.length(); i++)
        {
            // 获取每个字符，判断是否是字符a
            /*
            ==: 判断两个字符串在内存中首地址是否相同，即判断是否是同一个字符串对象
            equals(): 比较存储在两个字符串对象中的内容是否一致
            */
            if (s.charAt(i) == 'a') {
                // 累加统计次数
                num++;
            }
        }
        System.out.println("字符a出现的次数：" + num);
    }
}