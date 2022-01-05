package com.AP;

import java.util.Scanner;
import static java.lang.System.out;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1. skaitlis

        out.println("Ievadiet 1. skaitli:");
//        out.println("");
        int x = scanner.nextInt();

        //darbība
        out.println("Ievadiet darbību:");
//        out.println("");
        String oper;
        scanner.nextLine();//nepieciešams,jo nextint nolasa string automātiski, bez ievades iespējas.
        oper = scanner.nextLine();


        //2. skaitlis
        out.println("Ievadiet 2. skaitli:");

//        System.out.println("");
        int y = scanner.nextInt();



        out.println("Rezultāts:");
        if(oper.equals("+")) out.println(x + y);
        if(oper.equals("-")) out.println(x - y);
        if(oper.equals("*")) out.println(x * y);
        if(oper.equals("/")) out.println(x / y);

    }
}


