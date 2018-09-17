package com.algorithms.practice;

import java.util.Arrays;

public class SelectionSort {
	public static int[] selectionSort(int[] inputArray, int length){
		for(int i=0;i<length-1;i++){
			int minIndex=i;
			for(int j=i+1;j<length;j++){
				if(inputArray[j]<inputArray[minIndex])
					minIndex=j;
			}
			int temp=inputArray[i];
			inputArray[i]=inputArray[minIndex];
			inputArray[minIndex]=temp;
			
		}
		return inputArray;
	}
public static void main(String[] args){
	int[] inputArray={5,3,4,1,7};
	int length=inputArray.length;
	int[] sortedArray=selectionSort(inputArray,length);
	System.out.println(Arrays.toString(sortedArray));
}
}
