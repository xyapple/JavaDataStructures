package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
/*        Scanner in = new Scanner(System.in);
        System.out.println("please enter a array: ");
        ArrayList user = new ArrayList();*/
      int[] list ={1,2,3,4,5,7,8,9,10,11,12};
     

      int t = 11;
      int low = 0;
      int high = 11;
        System.out.println(binarySearch(list,t,low,high));
      
    }
    public static boolean binarySearch(int[] data, int target, int low, int high){
        if(low > high){
            return false;
        }
        else {
            int mid = (low + high)/2;
            if(target == data[mid]){
                return true;
            }else if(target < data[mid]){
                return binarySearch(data, target, low, mid-1);
            } else {
                return binarySearch(data, target, mid+ 1, high);
            }
        }
    }
}
