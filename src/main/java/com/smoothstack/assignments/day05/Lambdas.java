package com.smoothstack.assignments.day05;

import java.util.Arrays;

public class Lambdas {
	public static void main(String[] args) {
		String[] sentences = new String[] {
			"The quick brown fox jumps over the lazy dog.",
			"The slow hippopotomous eats a bush",
			"The Java Virtual Machine is multithreaded",
			"You can find lots of fun things in a box of chocolates",
			"Everything is a file",
			"either this string starts orth e,",
			"or it doesn't.",
			"early in the morning is the best time to find E in your strings",
			"each string is encoded in UTF-16",
			"ee idk jk lol",
			"what do you want from me?"
		};
		Arrays.sort(sentences, (s1, s2) -> Utils.shortestToLongest(s1, s2));
		String[] shortestToLongestCopy = sentences.clone();
		Arrays.sort(sentences, (s1, s2) -> Utils.longestToShortest(s1, s2));
		String[] longestToShortestCopy = sentences.clone();
		Arrays.sort(sentences, (s1, s2) -> Utils.alphabeticallyByFirstOnly(s1, s2));
		String[] alphabeticallyByFirstOnlyCopy = sentences.clone();
		Arrays.sort(sentences, (s1, s2) -> Utils.stringsThatContainEFirst(s1, s2));
		String[] stringsThatContainEFirstCopy = sentences.clone();
		
		Utils.printArray(shortestToLongestCopy);
		Utils.printArray(longestToShortestCopy);
		Utils.printArray(alphabeticallyByFirstOnlyCopy);
		Utils.printArray(stringsThatContainEFirstCopy);
	}
}
