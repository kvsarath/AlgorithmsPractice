/*Time complexity is O(nlogn) where n is size of array
 * Space complexity is Theta(n)
 */

package com.algorithms.practice;

import java.util.Arrays;

//import java.util.Arrays;

public class MergeSort {
public static int[] sort(int[] input, int startI, int endI){
	//System.out.println(startI+","+endI);
	if(startI<endI){
		int mid=(startI+endI)/2;
		sort(input, startI,mid);
		sort(input, mid+1,endI);
		//System.out.println("Values are:"+startI+","+mid+","+endI);
		//Left source half is A[ startI:mid].
		// Right source half is A[mid+1:endI].
		// Result is B[ startI:endI].
		mergeHalves(input,startI,mid,endI);
		//System.out.println(output);
	}
	return input;
}
public static int[] mergeHalves(int[] input, int startI, int mid, int endI){
	int[] tempArray=new int[endI+1];
		for(int k=0;k<=endI;k++){
		tempArray[k]=input[k];
	}
		int i=startI;
		int j=mid+1;
		int k =startI;

	while(i<=mid&& j<=endI){
		if(tempArray[i]<=tempArray[j]){
			input[k]=tempArray[i];
			i++;
		}else{
			input[k]=tempArray[j];
			j++;
		}
		k++;
	}
	while(i<=mid){
		input[k]=tempArray[i];
		i++;
		k++;
	}
	while(j<=endI){
		input[k]=tempArray[j];
		j++;
		k++;
	}
	
	//System.out.println(Arrays.toString(input));
	return null;
}
public static void main(String[] args){
	int[] inputArray={12,22,5,7,9,19,1};
	int len=inputArray.length;
	int[] sortedArray=sort(inputArray, 0,len-1);
	System.out.println("Sorted Array :"+Arrays.toString(sortedArray));
}
}
