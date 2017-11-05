package JavaOOP.humanlanguage;

public class Test {
    public static void main(String[] args) {
        // Use class refactor
       /* Chinese c = new Chinese();
        US a = new US();
        c.speak();
        a.speak();*/
       
       // Use polymorphism
       /* Human h = new Chinese();
        Human u = new US();
        h.speak();
        u.speak();*/
       
       //Use abstract Class
        AbstractHuman h = new Chinese();
        AbstractHuman u = new US();
        h.speak();
        u.speak();
    }
}
