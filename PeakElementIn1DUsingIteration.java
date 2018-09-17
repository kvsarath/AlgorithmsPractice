/*
 Problem Statement : Find "A" peak in 1D Array {2,4,1,6,2,7,9}
 Definition of Peak : In a array of numbers any number is called "A" peak if it is greater or equal to the 
  					  value present in its left and right neighbor elements.
  Approach : We are using divide&conquer in our approach to achieve this
 */
package com.algorithms.practice;

public class PeakElementIn1DUsingIteration {

	 public static Integer getPeakElement(int[] array) {
		 
	        if (array == null || array.length == 0) {
	            return null;
	        }
	 
	        int n = array.length;
	 
	        int start = 0;
	        int end = n - 1;
	 
	        while (start <= end) {
	            int mid = (start + end) / 2;
	 
	            if ((mid == 0 || array[mid - 1] <= array[mid]) && (mid == n - 1 || array[mid] >= array[mid + 1])) {
	                return array[mid]; // array[mid] is peak element
	            } else if (mid > 0 && array[mid - 1] > array[mid]) {
	                end = mid - 1;
	            } else {
	                start = mid + 1;
	            }
	        }
	        return null;
	    }
	 
	    public static void main(String[] args) {
	        int[] array = {16, 17, 25};
	        Integer peak = getPeakElement(array);
	        System.out.println(peak != null ? "Peak Element is " + peak : "No peak element!");
	    }
}
