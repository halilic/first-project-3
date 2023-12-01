package org.javaturk.oopj.algorithms;
import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        SieveOfEratosthenes soe = new SieveOfEratosthenes();
        System.out.println("Lütfen pozitif değerli bir sayı giriniz: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        soe.countNumberOfPrimesUpTo(n);


    }
    void countNumberOfPrimesUpTo(int n){
        long start = System.currentTimeMillis();
        boolean[] list = new boolean[n+1];
        Arrays.fill(list,true);

        int upperBound = (int) (Math.sqrt(n)+1);
        for (int i = 2; i<=n; i++){
            for (int j  = 2; i*j <= n ; j++) {
                if (list[i] == true) {
                    list[i*j]=false;
                }
            }
        }
        int numberOfPrimes = 0;
        for (boolean b: list) {
            if(b) {
                numberOfPrimes++;
            }
        }
        long end = System.currentTimeMillis();
        long workTime = end-start;
        System.out.println(n + " sayısına kadar  " + (numberOfPrimes - 2) + " tane asal sayı vardır.");
        System.out.println("Time: " + workTime);



    }


}