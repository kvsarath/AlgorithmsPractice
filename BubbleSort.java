/*Problem statement: sort the array in ascending order using bubble sort algo.
 Approach : 1
 * */
package com.algorithms.practice;

import java.util.Arrays;

public class BubbleSort {
	public static int[] bubblesort(int[] inputArray){
		int length=inputArray.length;
		boolean swapped;
		for(int i=0;i<length-1;i++){
			 swapped=false;			
			for(int j=0;j<length-1-i;j++){
				if(inputArray[j]>inputArray[j+1]){
					int temp=inputArray[j];
					inputArray[j]=inputArray[j+1];
					inputArray[j+1]=temp;
					swapped=true;
				}			
		}
			System.out.println(i);
			if(swapped!=true){
				break;
			}
		}
		return inputArray;
	}
public static void main(String[] args){
	int[] inputArray={5,3,4,1,7};
	int[] sortedArray=bubblesort(inputArray);
	System.out.println(Arrays.toString(sortedArray));

}
}
