package com.vikram.collection;

import java.util.ArrayList;
import java.util.List;
public class PracticeArrayList {
	
	public static void main(String[] args) {
		List<Integer> number = new ArrayList<>();
		number.add(10);
		number.add(20);
		number.add(30);
		System.out.println(number.size());
		//This is for loop1
		for(Integer num:number){
			System.out.println(num);

		}
		
	}

}
