
import java.util.Arrays;

public class SecondLargest {
    
    public static int SecondLargestElement(int []arr){

        Arrays.sort(arr);
        return arr[arr.length-2];

    }

    public static void main(String[] args) {
        //first case
        int []givenarr = new int[]{12,2,34,451,3,4,9,987};

        int ans = SecondLargestElement(givenarr);

        System.out.println("Second Largest element is: "+ans);
    }
}
