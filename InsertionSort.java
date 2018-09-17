/*
 * Problem Statement : To Sort the array in ascending order
 * Approach : 
 * 1. Using nested for loops
 * 		a. Take 1st position of array as key
 * 		b. compare value present in this postion with the values present in left side of array till we hit 0th position
 * 		c. If value[key] is greater than value[key-1], swap the values
 * 		d. Repeat this step for all elements present in array
 */
package com.algorithms.practice;

import java.util.Arrays;

public class InsertionSort {
	public static int[] sortArrayUsingForLoop(int[] input, int len){
		for(int i=1;i<=len-1;i++){
			for(int j=i;j>=0;j--){
				if((j>0)&&(input[j]<input[j-1])){
					int temp=input[j-1];
					input[j-1]=input[j];
					input[j]=temp;
				}
			}
		}
		return input;
	}
public static void main(String[] args){
	//int[] array={9,4,1,3,8,0};
	int[] array={12, 11, 13, 5, 6};
	int len=array.length;
	int[] sortedArray=sortArrayUsingForLoop(array,len);
	System.out.println("Sorted Array of input array : "+Arrays.toString(sortedArray));
}
}
