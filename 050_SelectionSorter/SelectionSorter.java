import java.util.*;
public class SelectionSorter{
    public static void main(String[]args){
        SelectionSorter a = new SelectionSorter();
        UnsortedArray b = new UnsortedArray();
        int[] array= b.getArrOne();
        System.out.print(Arrays.toString(a.sort(array)));
    }

  //  public int[] give(){
  //     return a;
 //   }
    public int[] sort(int[]array){ 
  
        // loop through array for sorting
        for (int i = 0; i < array.length-1; i++) 
        { 
            // index of minimum element 
            int min = i; 
            //placeholder, used later
            int temp;
            for (int j = i+1; j < array.length; j++) 
                if (array[j] < array[min]) {
                    min = j; 
                }
            //swapping elements for new minimum 
            temp = array[min]; 
            array[min] = array[i]; 
            array[i] = temp; 
        } 
            return array;

  }
    }
