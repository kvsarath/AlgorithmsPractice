/*
 Problem Statement : Find "A" peak in 1D Array {2,4,1,6,2,7,9}
 Definition of Peak : In a array of numbers any number is called "A" peak if it is greater or equal to the 
  					  value present in its left and right neighbor elements.
  Approach : We are using divide&conquer in our approach to achieve this
 */
package com.algorithms.practice;

public class PeakElementIn1DUsingRecursion {
	//Function to find "A" peak in the given input array using binary search.

		public static void findPeak(int[] input, int length, int startI, int endI){
		//int middleI=startI+(endI-startI)/2;
			int middleI=(startI+endI)/2;
			//if((endI-startI==1)||(endI-startI==0)||(middleI==0))
			//To handle edge cases.e.g if the binary search returns array with 2{3,5} or 1{3} elements
		if((endI-startI==1)||(endI-startI==0)){
			if(input[endI]>=input[startI]){
				System.out.println(input[endI]+ " is A peak of input Array");
			}else{System.out.println(input[startI]+ " is A peak of input Array");}
		}
		//check if the middle element of array is "A" Peak
		else if(input[middleI]>=input[middleI-1]&&input[middleI]>=input[middleI+1]){
			System.out.println(input[middleI]+ " is A peak of input Array");
		}
		//Look on left side of the middle element for "A" peak
		else if(input[middleI-1]>input[middleI]){
			endI=middleI-1;
			findPeak(input,length,startI,endI);
		}
		//Look on right side of the middle column for "A" peak
		else if(input[middleI+1]>input[middleI]){
			startI=middleI+1; 
			findPeak(input,length,startI,endI);
		}
		
	}

		public static void main(String[] args){
		//int[] inputArray={16, 17, 25, 2,21,25, 28, 67,188,99};
			int[] inputArray={29, 38, 25};
		int arrayLength=inputArray.length;
		findPeak(inputArray,arrayLength,0,arrayLength-1);	
	
	}
}
