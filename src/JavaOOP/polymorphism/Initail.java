package JavaOOP.polymorphism;

public class Initail {
    public static void main(String[] args) {
/*        Animal obj1 = new Animal();
        Animal obj2 = new Dog();
        Animal obj3 = new Cat();
        obj1.eat();
        obj2.eat();
        obj3.eat();
        //obj2.watchDoor(); this is not ok, becuase Animal class do not have this
    
        */
        //Dog obj3 = new Animal(); This is not ok.
        Dog dog = new Dog();
        Animal animal = dog; //This is not ok
        if(animal instanceof Dog){
            Dog dog2 = (Dog)animal;
        } else{
            System.out.println("Cannot do change the class");
        }
       
       
    }
}
