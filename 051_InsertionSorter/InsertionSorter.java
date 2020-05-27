import java.util.*;
public class InsertionSorter{
    public static void main(String[]args){
        InsertionSorter a = new InsertionSorter();
        UnsortedArray b = new UnsortedArray();
        int[] array= b.getArrOne();

        System.out.print(Arrays.toString(a.sort(array)));
    }

    public int[] sort(int[] array){
        for (int j = 1; j < array.length; j++)
      {
        //placeholder for the value at tempdex
         int temp = array[j];
         int tempdex = j;
         //compare temp to the element to its left
         while (tempdex > 0 && temp < array[tempdex - 1])
         {
            //swap elements to keep them in order: line 20 and line 25. reduce tempdex so the code at line 25 set the element on the left side to temp.
            array[tempdex] = array[tempdex - 1];
            tempdex--;
         }
         
         array[tempdex] = temp;
      }
      return array;
    }
}