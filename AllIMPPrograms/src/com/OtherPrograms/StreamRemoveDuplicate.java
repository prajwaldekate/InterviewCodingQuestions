package com.OtherPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamRemoveDuplicate {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,40,50,10,60,20,70);
		
		Set set = list.stream().collect(Collectors.toSet());
		
		System.out.println(set);
	}
}
