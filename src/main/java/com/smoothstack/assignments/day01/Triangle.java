package com.smoothstack.assignments.day01;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Arrays;

public class Triangle
{
    public static void main(String[] args ) {
        System.out.println("Welcome to the triangle generator!");
        while (true) {
            startingMessage();
            try {
                int triangleNumber = handleTriangleSelection();
                int numberOfLines = handleLinesSelection();
                String[] lines = triangle(triangleNumber, numberOfLines);
                for (int i=0; i<lines.length; i++) {
                    System.out.println(lines[i]);
                }
            } catch (IOException e) {
                System.out.println("IO Exception");
            } catch (IllegalArgumentException e) {
                System.out.println("goodbye");
                break;
            }

        }

    }
    static void startingMessage() {
        System.out.println("Enter a number to select a triangle pattern (or enter 0 or Q to quit):\n");
        System.out.println("1: Upper left triangle");
        System.out.println("2: Upper center triangle");
        System.out.println("3: Upper right triangle");
        System.out.println("4: Lower left triangle");
        System.out.println("5: Lower center triangle");
        System.out.println("6: Lower right triangle");
        System.out.println("0 or Q: quit");
    }
    static int handleTriangleSelection() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        String triangleNumberStr = reader.readLine();
        if (triangleNumberStr.equals("Q")) {
            throw new IllegalArgumentException("quit");
        }
        int triangleNumber = Integer.parseInt(triangleNumberStr, 10);
        if (triangleNumber < 1 || triangleNumber > 6) throw new IllegalArgumentException("quit");
        return triangleNumber;
    }
    public static int handleLinesSelection() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.print("Enter the number of lines: ");
        String numberOfLinesStr = reader.readLine();
        int numberOfLines = Integer.parseInt(numberOfLinesStr);
        return numberOfLines;
    }
    public static String[] triangle(int triangle, int lines) throws IllegalArgumentException {
        switch (triangle) {
            case 1: return upperLeft(lines);
            case 2: return upperCenter(lines);
            case 3: return upperRight(lines);
            case 4: return lowerLeft(lines);
            case 5: return lowerCenter(lines);
            case 6: return lowerRight(lines);
            default: throw new IllegalArgumentException("exit");
        }
    }
    public static String[] upperLeft(int lines) {
        String[] ans = new String[lines];
        for (int i=0; i<lines; i++) {
            char[] chars = new char[lines-i];
            Arrays.fill(chars, '*');
            ans[i] = String.valueOf(chars);
        }
        return ans;
    }
    public static String[] upperCenter(int lines) {
        String[] ans = new String[lines];
        for (int i=0; i< lines; i++) {
            char[] chars = new char[2*lines-i];
            Arrays.fill(chars, ' ');
            for (int j=i; j<2*lines-i-1; j++) {
                chars[j] = '*';
            }
            ans[i] = String.valueOf(chars);
        }
        return ans;
    }
    public static String[] upperRight(int lines) {
        String[] ans = new String[lines];
        for (int i=0; i< lines; i++) {
            char[] chars = new char[lines];
            Arrays.fill(chars, ' ');
            Arrays.fill(chars, i, lines, '*');
            ans[i] = String.valueOf(chars);
        }
        return ans;
    }
    public static String[] lowerLeft(int lines) {
        String[] ans = new String[lines];
        for (int i=0; i< lines; i++) {
            char[] chars = new char[lines];
            Arrays.fill(chars, ' ');
            Arrays.fill(chars, 0,i+1, '*');
            ans[i] = String.valueOf(chars);
        }
        return ans;
    }
    public static String[] lowerCenter(int lines) {
        String[] ans = new String[lines];
        for (int i=0; i< lines; i++) {
            char[] chars = new char[2*lines-1];
            Arrays.fill(chars, ' ');
            Arrays.fill(chars, lines-i-1,lines+i,'*');
            ans[i] = String.valueOf(chars);
        }
        return ans;
    }
    public static String[] lowerRight(int lines) {
        String[] ans = new String[lines];
        for (int i=0; i< lines; i++) {
            char[] chars = new char[lines];
            Arrays.fill(chars, ' ');
            Arrays.fill(chars, lines-i-1,lines,'*');
            ans[i] = String.valueOf(chars);
        }
        return ans;
    }
}
