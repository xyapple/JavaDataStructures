package JavaOOP.extendclass;
//this class is extended Class of Animal
public class Dog extends Animal {
    //rewrite the Animal class method
    public void hasLegs(){
        System.out.println("name: "+this.name+" age: "+this.age+" Dog has legs." +" (Message from Dog Class)");
    }
    public Dog(){
        //super();
        System.out.println("The Dog class had been loaded.");
    }
    public void method(){
        hasLegs();
        super.hasLegs();
    }
}
