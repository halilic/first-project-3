package org.javaturk.oopj.algorithms;

import java.util.Iterator;
import java.util.Scanner;

public class MonteCarloSimulation {
	public static void main(String[] args) {
		System.out.println("Nokta sayısı giriniz:");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int numberInCricle =0;
		
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < n; i++) {
			double x = Math.random();
			double y = Math.random();
			double distance = x*x+y*y;
			if (distance<=1) {
				numberInCricle++;
			}
		}
		
		long end = System.currentTimeMillis();
		long time = end-start;
		
		Double myPI = 4.0*numberInCricle/n;
		System.out.println("My PI: "+numberInCricle/n);
		System.out.println("Java's PI: " + Math.PI);
		System.out.println("Time: " + time + "ms.");
		
		
	}
	
}
