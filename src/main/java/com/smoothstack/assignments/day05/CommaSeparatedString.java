package com.smoothstack.assignments.day05;

import java.util.List;
import java.util.ArrayList;
public class CommaSeparatedString {
	public static String commaSeparatedString(List<Integer> input) {
		return input.stream().reduce("",
			(String s, Integer n) -> (s.equals("")? "":s + ",") + (n %2==0?"e":"o")+n.toString(),
			(String s1, String s2) -> s1+s2
		);
	}
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(200);
		l.add(3);
		l.add(47);
		System.out.println(commaSeparatedString(l));
	}
}
