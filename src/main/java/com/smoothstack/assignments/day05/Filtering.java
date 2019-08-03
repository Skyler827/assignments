package com.smoothstack.assignments.day05;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Filtering {
	public static List<String> filter(List<String> strings) {
		return strings.stream().filter((String s) -> {
			return (s.length() == 3) && (s.charAt(0) == 'a');
		}).collect(Collectors.toList());
	}
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("abc");
		strings.add("abcd");
		strings.add("ab");
		strings.add("a4c");
		strings.add("ab7");
		strings.add("6bc");
		strings.add("abcabcabcabcabcabcabcabcabcabc");
		strings.add("ábc");
		strings.add("OwO");
		strings.add("abc Oh god my eyes");
		List<String> results = filter(strings);
		for (String s: results) {
			System.out.println(s);
		}
	}
}
