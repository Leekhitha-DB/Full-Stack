package com.collection;
//can only use wrapper classes in collections

import java.util.ArrayList;
import java.util.List;

//fun- duplicate copy allowed,order of input given is maintained
//adv's- diff data types, dynamic in nature
//disadv's- no type safety,have to type cast manually
public class ListInterface {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(12);
		list.add(12.0);
		list.add("Hello");
		list.add(12);
		list.add(12);
		System.out.println(list);
		Object object = list.get(0);
		Integer firstValue=(Integer)object;
		System.out.println(firstValue);
		
		String name=(String)list.get(2);
		System.out.println(name);
		
		//generic
		System.out.println();
		List<Integer> integers=new ArrayList<>();
		integers.add(120);
		integers.add(130);
		System.out.println(integers);
		
		Integer integer=integers.get(1);
		System.out.println(integer);
	}
}
