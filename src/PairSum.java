import javax.swing.text.html.HTML.Tag;

public class PairSum {
    
    public static int countOfPairSum(int []arr, int target){
        int count=0, sum=0;

        for(int i=0; i < arr.length; i++){
            for(int j=i+1; j < arr.length; j++){

                sum = arr[i] + arr[j];
                if(sum == target){
                    ++count;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,1,5,6,7,0};
        int target = 5;

        System.out.println(countOfPairSum(arr, target));
    }
}
