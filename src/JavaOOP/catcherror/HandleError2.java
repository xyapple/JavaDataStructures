package JavaOOP.catcherror;

public class HandleError2 {
    public int test(){
        int divider = 10;
        int result = 100;
        try{
            while(divider > -1){
                divider--;
                result = result + 100/divider;
            } return result;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Something wrong.");
            return -1;
        }
        
    }
    public int test2(){
        int divider = 10;
        int result = 100;
        try{
            while(divider > -1){
                divider--;
                result = result + 100/divider;
            } return result;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Something wrong.");
            return result = 999;
        }finally {
            System.out.println("This is finally" + result);
        }
        
    }
    
    public int test3(){
        int divider = 10;
        int result = 100;
        try{
            while(divider > -1){
                divider--;
                result = result + 100/divider;
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Something wrong.");
           
        }finally {
            System.out.println("This is finally" + result);
        }
        System.out.println("test3 is done! ");
        return 11111;
    }
    
    public static void main(String[] args) {
        HandleError2 tct = new HandleError2();
  /*      int result = tct.test();
        System.out.println("test() done, the result is: "+ result);
        int result2 = tct.test2();
        System.out.println("test2() done, the result is: "+ result2);*/
    
        int result3 = tct.test3();
        System.out.println("test2() done, the result is: "+ result3);
    }
}
