package JavaOOP;

public class Telphone {
    private float screenSize;
    private float cpu;
    private float made;
    
    public float getScreenSize(){
        return screenSize;
    }
    public void setScreenSize(float newScreen){
        newScreen = screenSize;
    }
    
    public float getCpu() {
        return cpu;
    }
    
    public float getMade() {
        return made;
    }
    
    public void setCpu(float newCpu) {
        newCpu = cpu;
    }
    
    public void setMade(float newMade) {
        newMade = made;
    }
    
    public Telphone(){
        System.out.println("Print what Telphone Class has");
    }
    public Telphone(float newScreen, float newCpu, float newMade){
        if(newScreen < 3.5f){
            System.out.println("Problem with input, screen cannot be smaller than 3.5'");
            screenSize = 3.5f;
        }else {
            screenSize = newScreen;
        }
       
        cpu = newCpu;
        made = newMade;
        System.out.println("parameter class");
    }
}
