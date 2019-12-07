package com.array.reverse;

import java.util.Arrays;

public class ReverseArray {
	
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,};
		int temp = 0;
		
		//Correct Approach
		ArrayReverseCorrectApproach(arr);
		Arrays.stream(arr).forEach(ReverseArray::show);
		
		//Brute Force approach
		int newArray[] = ArrayReverseBrutForce(arr);
		Arrays.stream(newArray).forEach(ReverseArray::show);
	}

	public static void show(int data){
		System.out.print(data+" ");
	}
	
	
	public static void ArrayReverseCorrectApproach(int[] arr) {
		int temp;
		for(int i=0;i<arr.length/2;i++){
			temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
	}
	
	public static int[] ArrayReverseBrutForce(int[] arr){
		int[] newArray = new int[arr.length];
		
		for(int i=0;i<arr.length;i++){
			newArray[newArray.length-1-i] = arr[i];
		}
		
		return newArray;
	}

}
