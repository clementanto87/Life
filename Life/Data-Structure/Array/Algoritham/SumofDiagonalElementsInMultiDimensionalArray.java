package com.array.diagonalSum;

public class SumofDiagonalElementsInMultiDimensionalArray {
	
	public static void main(String[] args){
		int [] [] multiArray ={{1,2,3},
				{4,5,6},{7,8,9}
		};
		
		int rows = multiArray.length;
		int cols = multiArray[0].length;
		
		if(rows != cols){
			System.out.println("Row and Colum must be same");
			return;
		}

		int sum1 = 0;
		for( int i=0,j=0;i<rows && j<cols;i++,j++){
			//System.out.println( multiArray[i][j]);
			sum1 = sum1 + multiArray[i][j];
		}
		System.out.println(sum1);
		
		int sum2 = 0; 
		for(int i =0,j=cols-1;i<rows && j>=0;i++,j--){
			System.out.println(multiArray[i][j]);
			sum2 = sum2 + multiArray[i][j];
		}
		
		System.out.println(sum2);
	}

}
