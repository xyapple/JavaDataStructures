package JavaOOP.humanlanguage;

public class Test {
    public static void main(String[] args) {
       /* This is class refactor
       Chinese c = new Chinese();
        US a = new US();
        c.speak();
        a.speak();*/
       
       //This is polymorphism
        Human h = new Chinese();
        Human u = new US();
        h.speak();
        u.speak();
    }
}
