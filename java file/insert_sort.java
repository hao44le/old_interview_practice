import java.util.*;
public class insert_sort {
    public static void main(String[] args){
        int[] A = {3,4,1,2,5,0,10};
        int[] b = insertSort(A);
        for(int j : b){
            System.out.println(j);
        }
    }
    public static int[] insertSort(int[] A){
        int[] result = A;
        for(int j = A.length - 2 ; j >= 0 ; j -- ){
            int key = A[j];
            int i = j + 1;
            while(i <= A.length - 1 && key < A[i]){
                A[i-1] = A[i];
                i++;
            }
            A[i-1] = key;
//            System.out.println(i);
        }
        return result;
    }
}