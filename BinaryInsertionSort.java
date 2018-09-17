/* Using binary search to reduce the number of comparisons in normal insertion sort. 
  Binary Insertion Sort use binary search to find the proper location to insert the selected item at each iteration.
 */
package com.algorithms.practice;

import java.util.Arrays;

public class BinaryInsertionSort {
	public static int[] sortArrayUsingBinaryInsertionSort(int[] input, int len){
		for(int i=1;i<len;i++){
			int key=i;
			if(input[key]<input[key-1]){				
			int returnI=binarySearch(input,0,i-1,key );
			int temp=input[key];
			for(int j=key;j>returnI;j--){
				input[j]=input[j-1];
			}
			input[returnI]=temp;
		}
			}
		return input;
	}
	public static Integer binarySearch(int[] input, int startI, int endI,int key){
		while(startI<=endI){
			int middle=(startI+endI)/2;
			//handle array with single element case
			if((endI-startI==0)||(endI-startI==1)){
				if(input[key]<input[middle]){
					return middle;
				}else{
					return middle+1;
				}
				
			}else if(input[key]<input[middle]){
				endI=middle-1;
			}else if(input[key]>input[middle]){
				startI=middle+1;
			}
		}
		return null;
	}
public static void main(String[] args){
	int[] array={9,4,1,3,8,0};
		//int[] array={12, 11, 13, 5, 6};
		int len=array.length;
		int[] sortedArray=sortArrayUsingBinaryInsertionSort(array,len);
		System.out.println("Sorted Array of input array : "+Arrays.toString(sortedArray));
}
}
