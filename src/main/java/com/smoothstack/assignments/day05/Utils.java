package com.smoothstack.assignments.day05;

import java.util.ArrayList;

public class Utils {
	public static int shortestToLongest(String s1, String s2) {
		return s1.length()-s2.length();
	}

	public static int longestToShortest(String s1, String s2) {
		return s2.length()-s1.length();
	}

	public static int alphabeticallyByFirstOnly(String s1, String s2) {
		return s1.charAt(0) - s2.charAt(0);
	}
	public static int stringsThatContainEFirst(String s1, String s2) {
		return s1.indexOf('e') - s2.indexOf('e');
	}
	static ArrayList<String> fromArray(String[] strings) {
		ArrayList<String> result = new ArrayList<String>();
		for (int i=0; i< strings.length; i++) {
			result.add(strings[i]);
		}
		return result;
	}
	static void printArray(Object[] arr) {
		for (int i=0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
