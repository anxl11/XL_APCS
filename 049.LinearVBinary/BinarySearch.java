public class BinarySearch{
    public static void main(String[]args){
        OneThousandSortedRandomNumbers b = new OneThousandSortedRandomNumbers();
        // class objects for using methods
        BinarySearch a = new BinarySearch();
        int[] arr = b.getSortedArray();
        //prints out index + iterations taken
        System.out.println(a.searchIndex(arr,7250));
        System.out.println("it took this many times to find the number or that it is not present: "+a.freq(arr,7250));
        System.out.println(a.searchIndex(arr,9463));
        System.out.println("it took this many times to find the number or that it is not present: "+a.freq(arr,9463));
        System.out.println(a.searchIndex(arr,1137));
        System.out.println("it took this many times to find the number or that it is not present: "+a.freq(arr,1137));
        System.out.println(a.searchIndex(arr,4837));
        System.out.println("it took this many times to find the number or that it is not present: "+a.freq(arr,4837));
    }
    public int searchIndex(int[] array, int number){
        //setting left and right indexes
        int left =0;
        int right = array.length -1;
        while(left<=right){
            int middle = (left+right)/2;
             //if number belongs to the smaller half of the array, use this half 
            if(number<array[middle]){
                right = middle -1;
            }
          //if number belongs to the larger half of the array, use this hald
            else if(number>array[middle]){
                left=middle+1;
            }
            //when the number is found
            else{
                return middle;
            }
        }
        //when the number is not found
        return -1;
    }
     public int freq(int[] array, int number){
        //setting left and right indexes
        int left =0;
        int counter=0;
        //set counter
        int right = array.length -1;
        while(left<=right){
            int middle = (left+right)/2;
             //if number belongs to the smaller half of the array, use this half 
            if(number<array[middle]){
                right = middle -1;
                counter++;
            }
          //if number belongs to the larger half of the array, use this hald
            else if(number>array[middle]){
                left=middle+1;
                counter++;
            }
            //when the number is found
            else{
                return counter;
            }
        }
        //when the number is not found
        return counter;
    }
}