package d2_static_until;

public class ArraysUtils {
    private ArraysUtils(){

    }
    public static String toString(int[] arr){
        String toString="";
        if(arr==null){
            return  null;
        }else {
       toString="[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                toString += (char) arr[i] + '0' ;
            } else {
                toString += (char) arr[i] + '0' + ",";
            }
        }
        toString+="]";
        }
        return toString;
    }
    public static Double getAverage(double []arr2){
        double getAverage=0.0;
        double sum=0,max=0,min=100;
        for (int i = 0; i < arr2.length; i++) {
            sum+=arr2[i];
            if (arr2[i]>=max){
                max=arr2[i];
            }
            if (arr2[i]<=min){
                min=arr2[i];
            }
        }
        getAverage=(sum-max-min)/(arr2.length-2);
        return getAverage;
    }
}
