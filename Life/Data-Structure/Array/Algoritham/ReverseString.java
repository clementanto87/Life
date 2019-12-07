package com.array.reverse;

public class ReverseString {
	
	public static void main(String[] args){
		String dataR ="ABCDEF";
		StringBuffer data = new StringBuffer(dataR);
		char temp;
		char[] dataCharArray = dataR.toCharArray();
		
		
		/*for(int i=data.length()-1;i>=0;i--){
				System.out.print(data.charAt(i)); 
		}*/
		
	/*	for(int i = 0;i<data.length()/2;i++){
			temp = data.charAt(i);
			data.setCharAt(i, data.charAt(data.length()-1-i));
			data.setCharAt(data.length()-1-i, temp);
		}
		System.out.println("Reversed: "+data);*/
		
		for(int i = 0; i<dataCharArray.length/2;i++){
			temp = dataCharArray[i];
			dataCharArray[i] = dataCharArray[dataCharArray.length-1-i];
			dataCharArray[dataCharArray.length-1-i] = temp;
		}
		
		System.out.println(dataCharArray);
	}

}
