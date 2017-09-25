package JavaOOP.extendclass;

public class Inital {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.age = 2;
        dog.name = "Hello";
        System.out.println("name: "+dog.name+" age: "+dog.age );
        //dog.hasLegs();
        dog.method();
        
    }
}
