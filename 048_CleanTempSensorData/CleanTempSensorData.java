import java.util.*;
public class CleanTempSensorData{
    public static void main(String[]args){
        int sum=0;
        SensorData a = new SensorData();
        ArrayList<Integer> array = new ArrayList<>();
        for(int i=0;i<a.getTempSensorData().length;i++){
            int val=a.getTempSensorData()[i];
            array.add(val);
        }
       
        System.out.println(array.size());
        for(int ii=array.size()-1;ii>0;ii--){
            if(array.get(ii)>20){
                array.remove(ii);
            }
        }  
        System.out.println(array); 
    }
}