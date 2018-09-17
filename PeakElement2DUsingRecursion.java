/*
 Problem Statement : Find "A" peak in 2D Array {2,4,1},
 											   {3,6,2},
 											   {0,5,7};
 Definition of Peak : In a 2D array of numbers any number is called "A" peak if 
 					  it is greater than or equal to its four neighbors, left, right, top and bottom. 
 
  Approach : We are using divide&conquer in our approach to achieve this
 */
package com.algorithms.practice;
public class PeakElement2DUsingRecursion {
	//function to get the row-index of global max of specific column
	public static int globalMax(int[][] input, int column, int length){
		int globalmax=0;
		int index=0;
		for(int i=0;i<length;i++){
			if(globalmax<input[i][column]){
				globalmax=input[i][column];
				index=i;
			}
		}
			return index;
	}
	
	public static void peakFinding2D(int[][] input, int startI, int endI,int rows){
		int middleColumn=(startI+endI)/2;
		int index=globalMax(input,middleColumn,rows );
		//if ((middleColumn==0)||(endI-startI==1)){
		//Below if condition is to handle edge cases i.e to handle the scnearios where we are left with single column 
		if ((endI-startI==0)||(endI-startI==1)){
			System.out.println("Found A 2d peak ::" +input[index][middleColumn]);
		}
		//check if globalmax of middle-column of 2-D array is "A" peak
		else if((input[index][middleColumn]>=input[index][middleColumn-1])&&(input[index][middleColumn]>=input[index][middleColumn+1])){
			System.out.println("Found A 2d peak ::" +input[index][middleColumn]);
		} 
		//Look on left side of the middle column for "A" peak
		else if(input[index][middleColumn-1]>input[index][middleColumn]){
			peakFinding2D(input,startI,middleColumn-1,rows);
		}
		//Look on right side of the middle column for "A" peak
		else if(input[index][middleColumn+1]>input[index][middleColumn]){
			peakFinding2D(input,middleColumn+1,endI,rows);
		}
	}
public static void main(String[] args){
	/*int[][] inputArray=new int[][]{
		{0,  0,  9,  1,  0,  0,  0, 1},
		{0,  0,  0,  4,  0,  0,  0, 2},
		{0,  1,  0,  1,  5,  6,  1,22},
		{0,  2,  0,  5,  0,  0,  0, 4},
		{0,  3,  0,  4,  0,  0,  0, 5},
		{10,  5,  0,  1,  0,  0,  0,6},
		{0,  4,  7,  1,  0,  0,  0, 7}
	};*/
	int[][] inputArray=new int[][]{
		{10, 8, 10, 10},
		{14, 13, 12, 11},
		{15, 9, 31, 21},
		{16, 17, 49, 20}
	};
	int rows=inputArray.length;
	int columns=inputArray[0].length;
//System.out.println(columns+","+rows);
		peakFinding2D(inputArray,0,columns,rows);
	
}
}
