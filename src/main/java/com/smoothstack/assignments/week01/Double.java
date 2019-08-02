package com.smoothstack.assignments.week01;
import java.util.List;
import java.util.ArrayList;

public class Double {
	public static List<Integer> doubleInteger(List<Integer> args) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i : args) {
			result.add(2*i);
		}
		return result;
	}
}
