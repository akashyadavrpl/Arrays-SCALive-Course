public class PairSumBatter {
    
    public static int BatterPairsum(int[] arr, int target){
        int count=0, sum=0;
        int start=0, end=arr.length-1;

        for(int i=0; i<arr.length; i++){
            sum = arr[start] + arr[end];
            //1,2,3,4,5,0
            while(start < end){
                if(sum == target){
                    ++count;
                    start++;
                    end--;
                }else if(sum > target){
                    end--;
                }else{
                    start++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,0};
        int target = 5;

        System.out.println(BatterPairsum(arr, target));
    }
}
