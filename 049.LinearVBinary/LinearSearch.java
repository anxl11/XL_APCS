public class LinearSearch{
    public static void main(String[]args){
        LinearSearch a = new LinearSearch();
        //two class objects for accessing custom methods
        OneThousandSortedRandomNumbers b = new OneThousandSortedRandomNumbers();
        int[] arr = b.getSortedArray();
       
        //gets the array
        //gets index of each asked number
        System.out.println(a.searchIndex(arr,7250));
        System.out.println("it took this many times to find the number or that it is not present: "+a.freq(arr,7250));
        System.out.println(a.searchIndex(arr,9463));
        System.out.println("it took this many times to find the number or that it is not present: "+a.freq(arr,9463));
        System.out.println(a.searchIndex(arr,1137));
        System.out.println("it took this many times to find the number or that it is not present: "+a.freq(arr,1137));
        System.out.println(a.searchIndex(arr,4837));
        System.out.println("it took this many times to find the number or that it is not present: "+a.freq(arr,4837));

    }
    public int searchIndex(int[] array, int number)
    {
         for(int i=0;i<array.length;i++){
            if(array[i]==number){
                return i;
                //return the index if found
            }
           
            
        } 
        return -1;
        //if the number is not inside the array, return -1. at this point the loop has already "given up"
    }
    public int freq(int[] array, int number){
        int counter=0;
         for(int i=0;i<array.length;i++){
            if(array[i]!=number){
                counter++;
        
            }
            
    }
        return counter;
}
}
//9463
//1137
//4837
