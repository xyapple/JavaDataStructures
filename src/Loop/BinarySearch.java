package Loop;
/*Divide and Conquer*/

public class BinarySearch {
    /*Search element k in a Sorted array.
    * @param arr a sorted array
    * @param k the element to search
    * @return index in arr where k is -1 if not found*/
    
    public int binarySearch(int[] arr, int k){
    int a = 0;
    // b point to the last element of the sorted array
    int b = arr.length;
    
    //loop invariant: [a,b) is a valid range. (a<=b)
        //{a,b) + [b,c) = [a,c)
        //b-a = len([a,b])
        // k maybe within rang [a,b)
        
        while(a < b){
            // middle point of the array
            //int m = (a + b)/2; stalk overflow
            int m = a + (b-a)/2;
            // a == b ==> m = a and m = b
            /*if(a == b ) return -1
            * */
            // b == a+ 1 ==> m =a
            //b == a + 2 ==> m = a + 1
            if(k < arr[m]){ // a...(m-1)
                b = m;
            }else if(k > arr[m]){
                a = m + 1;
            } else{
                return m;
            }
       
        }
        return -1;
    }
    
    public static void main(String[] args) {
        BinarySearch searchArray = new BinarySearch();
        System.out.println(searchArray.binarySearch(new int[]{1,2,10,15,100},15));
        System.out.println(searchArray.binarySearch(new int[]{1,2,10,15,100},-2));
        System.out.println(searchArray.binarySearch(new int[]{1,2,10,15,100},101));
        System.out.println(searchArray.binarySearch(new int[]{1,2,10,15,100},13));
        System.out.println("===========");
        System.out.println(searchArray.binarySearch(new int[]{},15));
        System.out.println(searchArray.binarySearch(new int[]{12},15));
        System.out.println(searchArray.binarySearch(new int[]{15},15));
        System.out.println("===========");
        System.out.println(searchArray.binarySearch(new int[]{12, 15},15));
        System.out.println(searchArray.binarySearch(new int[]{12, 15},12));
    }
}
