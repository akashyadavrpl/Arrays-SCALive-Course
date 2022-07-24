import java.util.Arrays;

public class SecondLargestSecondApproach {
    
    public static int LargestElement(int []arr){
        // Time complexity of this code is 
    // n log n

        Arrays.sort(arr);
        
        for(int i=arr.length-1; i>0; i--){

            if(arr[i] != arr[i-1]){
                return arr[i-1];
            }
        }
        
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {

        int arr[] = {9,9,9,9,9,9,9};
        int arrnew[] = {12,23,34,45,2,3,4,5,0};

        System.out.println(LargestElement(arr));
        System.out.println(LargestElement(arrnew));
    }
}

