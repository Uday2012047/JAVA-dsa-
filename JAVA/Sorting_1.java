/*.....Bubble Sort..................*/
import java.util.*;
public class Sorting_1 {

  public static void printarr(int arr[]){
      for(int i=0;i<arr.length;i++){
          System.out.println(arr[i]);
      }

  }
public static void main(String args[]){
    int arr[]={7,3,6,9,1,2};
    for(int i=0;i<arr.length-1;i++) {
        for (int j = 0; j < arr.length - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                //swap
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    printarr(arr);
}

}
