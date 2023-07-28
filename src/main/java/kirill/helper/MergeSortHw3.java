package kirill.helper;

import java.util.Arrays;

public class MergeSortHw3 {

    public static int[] mergeSort(int[] array) {

        if (array.length < 2) {
            return array;
        }
        int mid = array.length / 2;
        int[] leftSideArray = new int[mid];
        int[] rightSideArray = new int[array.length - mid];

        for (int i = 0; i < mid; i++) {
            leftSideArray[i] = array[i];
        }
        for (int j = 0; j < array.length - mid; j++) {
            rightSideArray[j] = array[mid + j];
        }
        mergeSort(leftSideArray);
        mergeSort(rightSideArray);

        mergeArrays(array, leftSideArray, rightSideArray, mid, array.length - mid);
        return array;
    }

    public static void mergeArrays(int[] array,int[] leftSideArray,int[] rightSideArray, int endLeftSide, int endRightSide){
        int i = 0,j = 0,k = 0;
        while(i<endLeftSide && j<endRightSide){
            if(leftSideArray[i] <= rightSideArray[j]){
                array[k++] = leftSideArray[i++];
            }else{
                array[k++] = rightSideArray[j++];
            }
        }
        while(i <endLeftSide){
            array[k++] = leftSideArray[i++];
        }
        while(j< endRightSide){
            array[k++] = rightSideArray[j++];
        }
    }
}
