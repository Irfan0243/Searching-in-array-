 

import java.util.Scanner;

public class searching {
    public static void main(String[] args) {
        int  i, item , size ,count=0;
        Scanner r = new Scanner(System.in);
       System.out.print(" Enter your array size :");
       size = r.nextInt();
        int arr[] = new int[size+1];
        System.out.print("Enter your array element :");
       for (i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }
        System.out.print("Enter your searching  item :");
        item=r.nextInt();
        for( i=0;i< arr.length;i++){
        if (arr[i]==item) {
        count++;
 
        }
    }
   if(count>0)
        System.out.println(" item  found in array for "+count+" times ");
    else
        System.out.println("item not found");
    
    
}
}
