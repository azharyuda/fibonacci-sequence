package com.azhar.latihan.fibonacci;

import java.util.*;
public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int panjang;
        int fib1 = 1;
        int fib2 = 0;
        int fibn;
        System.out.print("Input panjang baris Fibonacci: ");
        panjang = input.nextInt();

        int i = 0;
        while(i <= panjang){
            fibn = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibn;
            i++;
            System.out.println("Urutan ke- " + i + ": " + fib2);
        }
    }
}
