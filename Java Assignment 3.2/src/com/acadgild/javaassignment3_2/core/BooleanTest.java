package com.acadgild.javaassignment3_2.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BooleanTest {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		String Str1;
		String Str2;
		boolean same;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Input  First String :");
		Str1 = br.readLine();
		
		System.out.println("Input Second String :");
		Str2 = br.readLine();
		
		same = Str1.equals(Str2) ? true : false;
		
		System.out.println("Are The Entered strings are same?  " + same);
		
	}

}
