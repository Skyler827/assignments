package com.smoothstack.assignments.week01;

import java.util.HashMap;
import java.util.ArrayList;
public class RecursionSelectToSum {
	boolean groupClumpSum(int start, Integer[] options, int target) {
		options = combineIdentical(options);
		if (start == target) return true;
		if (start > target) return false;
		for (int i=0; i< options.length; i++) {
			if (start + options[i] == target) return true;
			if (start + options[i] > target) continue;
			if (groupClumpSum(start+options[i], removeOne(options, i), target)) return true;
		}
		return false;
	}
	private static Integer[] removeOne(Integer[] arr, int idx) {
		Integer[] result = new Integer[arr.length-1];
		boolean passed = false;
		for (int i=0; i< arr.length; i++) {
			if (i==idx) {
				passed = true;
				continue;
			}
			if (passed) result[i-1] = arr[i];
			else result[i] = arr[i];
		}
		return result;
	}
	private static Integer[] combineIdentical(Integer[] arr) {
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		for (int i=0; i< arr.length; i++) {
			if (m.containsKey(arr[i])) {
				m.put(arr[i], m.get(arr[i]+1));
			} else {
				m.put(arr[i], 1);
			}
		}
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i: m.keySet()) {
			ans.add(i * m.get(i));
		}
		return (Integer[])ans.toArray();
	}
}
