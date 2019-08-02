package com.smoothstack.assignments.week01;

import java.util.ArrayList;
import java.util.List;

public class RightMost {
	public static List<Integer> rightMost(List<Integer> args) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i : args) {
			result.add(i%10);
		}
		return result;
	}
}
