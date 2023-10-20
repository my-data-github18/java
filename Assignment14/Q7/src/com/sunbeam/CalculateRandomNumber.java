package com.sunbeam;

import java.util.Random;
import java.util.stream.Stream;

public class CalculateRandomNumber {

	public static void main(String[] args) {
		Random r = new Random();
		Stream<Integer> s = Stream.generate(()->r.nextInt(10)).limit(10);
		int result = s.reduce(0, (a,e)->a+e);
		System.out.println(result);
		
	}

}
