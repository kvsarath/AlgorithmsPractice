/*
 * Problem Statement : To Sort the array in ascending order using quick sort
 * Approach : 
 * 	1.Take the last element of array array[n-1] where n is length of array as pivot
 * 	2.Partition the array such that the pivot element is placed at its correct position in sorted
    array, and places all smaller (smaller than pivot) to left of pivot and all greater elements to right of pivot
 *  3.Call the sorting function recursively to sort the the values using the aforementioned approach
 */
package com.algorithms.practice;

import java.util.Arrays;

public class QuickSort {
public static int[] sort(int[] inputArray, int startI, int endI){
	if(startI<endI){
		int partitionIndex=partition(inputArray,startI, endI);
		sort(inputArray, startI,partitionIndex-1);
		sort(inputArray,partitionIndex+1,endI);
	}
	return inputArray;
}
public static int partition(int[] inputArray,int low, int high){
	//take last element of array as pivotIndex
	int pi=high;
	//assign first element of array as smaller index or index of smallest element in array
	int si=low;
	int i=low;
	for(i=low;i<high;i++){
		if(inputArray[i]<inputArray[pi]){
			/*condition to avoid unnecessary swapping
			 swap only if smallerIndex is not equal to i(loop variable)s*/
			if(si!=i){
			   swap(inputArray,i,si);
			}
			si++;
		}
	}
	/*condition to avoid unnecessary swapping
	  swap the pivot element only if pivotIndex is not equal to smaller Index*/
	if(pi!=si){
	swap(inputArray,pi,si);}
	return si;
}
public static void swap(int[] inputArray, int fromIndex, int toIndex){
	int temp=inputArray[toIndex];
	inputArray[toIndex]=inputArray[fromIndex];
	inputArray[fromIndex]=temp;
	
}
	public static void main(String[] args){
		int[] inputArray={10,30,80,90,40,50,70};
		int[] sortedArray=sort(inputArray,0,inputArray.length-1);
		System.out.println("Sorted Array :"+Arrays.toString(sortedArray));
	
	}
}