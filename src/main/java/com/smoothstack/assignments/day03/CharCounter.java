package com.smoothstack.assignments.day03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharCounter {
	public static void main(String[] args) {
		char targetChar = 'e';
		int count = 0;
		File file = new File("src/main/java/com/smoothstack/assignments/day03/test.txt");
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			String st;
			while ((st = br.readLine()) != null) {
				for (int i=0; i<st.length(); i++) {
					if (st.charAt(i) == targetChar) count ++;
				}
			}
			System.out.println("In the file: "+file.getAbsolutePath());
			System.out.print("There are "+count);
			System.out.print(" occurences of the character '"+targetChar+"'");
			System.out.println("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}