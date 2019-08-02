package com.smoothstack.assignments.week01;

import java.util.List;
import java.util.ArrayList;
public class RemoveX {
	public static List<String> removeX(List<String> args) {
		ArrayList<String> result = new ArrayList<String>();
		for (String s : args) {
			s.replace("x", "");
		}
		return result;
	}
}
