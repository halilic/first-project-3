package org.javaturk.oopj.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println("Lütfen pozitif bir sayı giriniz... ");
		Scanner scanner = new Scanner(System.in);
		int sayi = scanner.nextInt();
		
		PrimeNumbers numbers = new PrimeNumbers();
		numbers.isPrime(sayi);
		
	}
	public void isPrime(int num) {
		
		List<Integer> list = new ArrayList<>();
		for (int i = 2; i < num; i++) {
			if (num%i==0) {
				list.add(i);
			}
			
		}
		if (list.isEmpty()) {
			System.out.println(num + " Sayısı Asaldır.");
		} else {
			System.out.println(num +" Sayısı asal değildir.");
			System.out.println(num + " Sayısıın tam bölenleri");
		for (Integer l : list) {
			System.out.println(l);
		}
		
		}
	}
	
}
