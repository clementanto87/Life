package com.array.maxOccurenceOfElement;

import java.util.HashMap;
import java.util.Map;

public class ArrayMaxOccerence {
	
	public static void main(String[] args){
		int[] arrInput = {1,2,3,4,5};
		Map<Integer, Integer> map = new HashMap<>();
		int occurences = 1;
		int maxOccurences = arrInput[0];
		boolean status = false;
		
		for(int i : arrInput){
			if(map.get(i) == null){
				map.put(i, 1);
			}else{
				map.put(i, map.get(i)+1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			if(entry.getValue() > occurences){
				occurences = entry.getValue();
				maxOccurences = entry.getKey();
				status=true;
			}
		}
		
		if(status){
			System.out.println(maxOccurences+" has repeted "+occurences+" times");
		}else{
			System.out.println("No duplicate");
		}
	}

}
