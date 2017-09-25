package JavaOOP.catcherror;

// create a exception by myself
public class HandleError3 {
    public static void main(String[] args){
        HandleError3 he = new HandleError3();
        try{
            he.test2();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void test1()throws DrunkException{
        throw new DrunkException("This is test one exception!");
    }
    public void test2(){
        try{
            test1();
        }catch (DrunkException e){
            RuntimeException newExc = new RuntimeException("Test 1 has an problem.");
            newExc.initCause(e);
            throw newExc;
        }
    }
}
