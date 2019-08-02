package com.smoothstack.assignments.week01;

import java.util.ArrayList;

public class Lambdas {
	public static NumberInterface isOdd() {
		return (int x) -> x%2==1;
	}
	public static NumberInterface isPrime() {
		return (int x) -> {
			for (int i=2; i<x; i++) {
				if (x%i == 0) return false;
			}
			return true;
		};
	}
	public static NumberInterface isPalindrome() {
		return (int x) -> {
			char[] s = Integer.toString(x).toCharArray();
			for (int i=0; i< s.length/2; i++) {
				if (s[i] != s[s.length-1-i]) return false;
			}
			return true;
		};
	}
	public static ArrayList<String> _main(String[] args) {
		ArrayList<String> result = new ArrayList<String>();
		try {
			int numberOfTests = Integer.parseInt(args[0]);
			for (int i=1; i<args.length; i++) {
				String[] split = args[i].split(" ");
				int n1 = Integer.parseInt(split[0]);
				int n2 = Integer.parseInt(split[1]);
				switch (n1) {
				case 1:
					if (isOdd().call(n2)) {
						result.add("ODD");
					} else {
						result.add("EVEN");
					}
					break;
				case 2:
					if (isPrime().call(n2)) {
						result.add("PRIME");
					} else {
						result.add("COMPOSITE");
					}
					break;
				case 3:
					if (isPalindrome().call(n2)) {
						result.add("PALINDROME");
					} else {
						result.add("ASYMMETRICAL");
					}
					break;
				default:
					throw new IllegalArgumentException();
				}
			}
			if (numberOfTests == args.length - 1) {
				result.add("correct number of arguments given.");
			} else {
				result.add("incorrect number of arguments given.");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			result.add(e.toString());
		} catch (NumberFormatException e) {
			result.add(e.toString());
		} catch (IllegalArgumentException e) {
			result.add(e.toString());
		}
		return result;
	}
	public static void main(String[] args) {
		for (String s : _main(args)) {
			System.out.println(s);
		}
	}
}
