package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Randomly choose 1 or more numbers from array to create sublists
public class LinkedListCombinations {
    /*
    * Generates all combination sublists and output them.
    * selecting n elements from data
    *
    * @param data
    * @param n
    * */
    
    public void combinations(List<Integer> selected,List<Integer> data, int n){

        //if there is only 1 element
        if(n == 0){
            //output all selected elements
            for(Integer i : selected){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
            return;
        }
        //if data is empty list
        if(data.isEmpty()){
            return;
        }
        
        // select element from index 0
        selected.add(data.get(0));
        combinations(selected, data.subList(1, data.size()), n-1);
        
        // if we select element not from index 0
        
        selected.remove(selected.size() - 1);
        combinations(selected, data.subList(1, data.size()),n);
        
    
    }
    
    public static void main(String[] args) {
        LinkedListCombinations comb = new LinkedListCombinations();
        System.out.println("======================");
        comb.combinations(new ArrayList<>(),Arrays.asList(1,2,3,4),2);
        System.out.println("======================");
        comb.combinations(new ArrayList<>(),Arrays.asList(1,2,3,4),1);
        System.out.println("======================");
        comb.combinations(new ArrayList<>(),Arrays.asList(1,2,3,4),0);
        System.out.println("======================");
        comb.combinations(new ArrayList<>(),Arrays.asList(1,2,3,4,5,6,7,8,9,10),4);
        System.out.println("======================");
        comb.combinations(new ArrayList<>(),new ArrayList<>(),2);
        System.out.println("======================");
        comb.combinations(new ArrayList<>(),new ArrayList<>(),0);
        
        
    }
    
}
