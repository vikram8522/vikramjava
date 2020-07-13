package com.vikram.collection;

import java.util.ArrayList;
import java.util.List;
//Default size of arraylist is 10 and increase by with capacity 50% or old size*1.5
public class PracticeArrayList {
	
	public static void main(String[] args) {
		List<Integer> number = new ArrayList<>();
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(30);
		System.out.println(number.size());
		
		for(Integer num:number){
			System.out.println(num);
		}
		
	}

}
