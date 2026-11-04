package MergeSortPractica;

import java.util.Arrays;

public class Main {
    public static int[] mergeSort(int[] A, int[] B){

        int i = 0, j = 0, k = 0;
        int[] C = new int[A.length + B.length];

        while(i < A.length && j < B.length){
            if (A[i] <= B[j]){
                C[k] = A[i];
                i++;
            }
            else {
                C[k] = B[j];
                j++;
            }
            k++;
        }

        while(i < A.length){ C[k] = A[i]; i++; k++;}
        while(j < B.length){ C[k] = B[j]; j++; k++;}

        return C;
    }

    public static void main(String[] args) {
        int[] A = {2,4,5};
        int[] B = {1,3,6,7};

        int[] C = mergeSort(A,B);

        System.out.println(Arrays.toString(C));
    }
}