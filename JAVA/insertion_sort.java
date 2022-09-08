/*.......insertion Sort(n^2).......*/
import java.util.*;
public class insertion_sort {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={0,-4,2,-3,1,11,-2,9,7,-1,0,1,5};
        for(int i=1;i< arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while (j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        printarr(arr);
    }
}
