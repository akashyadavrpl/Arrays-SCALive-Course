
import java.util.Scanner;

public class LengthArr {
    
public static void main(String[] args) {

    /*
    String com[] = new String[12];
    
    System.out.println("Size of arrys: "+com.length);

    //arr.length =90; -> ERROR
    // value is read only

    com = new String[23];
    // by doing this we loss our old arrys

    System.out.println("Now Size of arrys: "+com.length);

    // Travercing an array by ENHANCE LOOP -> ARRAYS , COLLECTION

    // using normal loop;

    int new_arr[] = new int[]{10,32,34,45,12};

    for(int i=0; i<new_arr.length; i++){
        System.out.print(new_arr[i]+" ");
    }

    // USING for each loop / enhance loop
    System.out.println();

    for(int x: new_arr){
        System.out.print(x+" ");
    }
    // this loop add values of arr in the variable x
    // loop itteraction of fix length
    // always forword traverce
    // lossy conversion is not applicable for x data type

    // EXAMPLE BY SIR
    
    // taking input from user
    // SACIN SIR ANS
     */

    System.out.println("\n\nExirsize\n");
     Scanner kb = new Scanner(System.in);

     int sir_arr[]= new int[5];

     System.out.println("Enter "+sir_arr.length+" no : ");

     //input in arrys
     for (int i = 0; i < sir_arr.length; i++) {
        sir_arr[i] = kb.nextInt();
     }

     // Displaying the no
     System.out.println("Values are: ");
     for(int x: sir_arr){
        System.out.print(x+" ");
     }


    // for (int y : sir_arr) {
    //     // System.out.println("\nvalue of sir-arr "+sir_arr);
    //     // System.out.println("\nValue of y "+ y);
    //     System.out.println("\nEnter a no: ");
    //     kb.nextLine();
    //     sir_arr[y] = kb.nextInt();
    // }

    // for (int laptop : sir_arr) {
    //     System.out.println("Value of laptop var "+laptop);
    // }

    System.out.println("\nEnter a value: ");

    for (int z : sir_arr) {
        sir_arr[z] = kb.nextInt();

    }

    /* Enter 5 no : 
    0 1 2 3 4
    Values are:    
    0 1 2 3 4      
    
     */

    System.out.println("Values present in an array: ");

    for (int val : sir_arr) {
        System.out.print(val+" ");
    }
    /*
     * Enter a value: 
    23 34 45 56 67
    Values present in an array: 
    23 34 45 56 67 
     */
}
    
}

