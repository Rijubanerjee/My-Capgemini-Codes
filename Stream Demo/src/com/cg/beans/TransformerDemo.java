package com.cg.beans;

import java.util.Arrays;
import java.util.stream.Stream;

public class TransformerDemo {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println("------------Multiply By 2----------------");
		Arrays.stream(arr).map(e -> e * 2).forEach(System.out::println);

		System.out.println("---------------Power of 2------------------------");
		Arrays.stream(arr).mapToDouble(e -> Math.pow(e, 2)).forEach(System.out::println);

		System.out.println("--------------------transform in to first 3 Charecters----------------");
		Stream<String> st = Stream.of("ram kumar", "sai kumar", "tomgerals", "sambush");
		st.map(e -> e.substring(0, 3)).forEach(System.out::println);

	}

}
