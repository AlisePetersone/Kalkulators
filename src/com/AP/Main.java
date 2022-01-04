package com.AP;

import java.util.Scanner;
import static java.lang.System.out;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1. skaitlis

        out.println("Ievadiet 1. skaitli:");
        out.println("");
        int num1 = scanner.nextInt();

        //darbība
        out.println("Ievadiet darbību:");
        out.println("");
        String oper;
        scanner.nextLine();//nepieciešams,jo nextint nolasa string automātiski, bez ievades iespējas.
        oper = scanner.nextLine();


        //2. skaitlis
        out.println("Ievadiet 2. skaitli:");

//        System.out.println("");
        int num2 = scanner.nextInt();



        out.println("Rezultāts:");
        if(oper.equals("+")) out.println(num1 + num2);
        if(oper.equals("-")) out.println(num1 - num2);
        if(oper.equals("*")) out.println(num1 * num2);
        if(oper.equals("/")) out.println(num1 / num2);

    }
}


