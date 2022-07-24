
public class SecLargEleEfficent {
    
    public static int SecondLargElement(int []arr){

        int max, sec_max;
        max=sec_max= Integer.MIN_VALUE;
// [23,34,45,56];
// [23,2,3,45]
        for(int x: arr){
            
            if(x > max){
                sec_max = max;
                max = x;
            }else{
                if(x > sec_max && x != max){
                    sec_max = x;
                }
            }
        }
        return sec_max; 
    }

    public static void main(String[] args) {
        int arr[] = {89,65,45,34,67,3, 89,2,1,67};
        int arr1[] = {3,3,3,3,3,3};

        System.out.println(SecondLargElement(arr));
        System.out.println(SecondLargElement(arr1));
    }
    
}
 