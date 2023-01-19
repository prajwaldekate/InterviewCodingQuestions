package com.OtherPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIterateAllEle {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,1,2,6,7,8,9);
	
		Set<Integer> set = list.stream().collect(Collectors.toSet());
		
		System.out.println(set);
		
	}
}

