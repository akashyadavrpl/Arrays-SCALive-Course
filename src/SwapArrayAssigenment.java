
public class SwapArrayAssigenment {
    
    public static int[] SwapCaseInArr(int []arr){
        int temp = 0;

        for(int i=0; i < arr.length-1; i+=2){

            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp; 
        }
        return arr;
    }

    public static void main(String[] args) {
        int []arr = {23,3,34,12,89,0,78};
        int []arr1 = {23,34,45,56,78,78,89,90};

        
        System.out.println("\nOriginal arr");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        arr = SwapCaseInArr(arr);
        System.out.println("\nSwaped arr");
        for (int i : arr) {
            System.out.print(i+" ");
        }

        System.out.println("\n\nOriginal new arr");
        for (int i : arr1) {
            System.out.print(i+" ");
        }
        arr1 = SwapCaseInArr(arr1);

        System.out.println("\nSwapped new arr");
        for (int i : arr1) {
            System.out.print(i+" ");
        }
    }
}
