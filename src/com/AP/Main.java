package com.AP;
import java.util.Scanner;
import static java.lang.System.out;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. skaitlis
        out.println("1.skaitlis:");
        int x = scanner.nextInt();

        //darbība
        out.println("Darbība:");
        String oper;
        scanner.nextLine();//nepieciešams,jo nextint nolasa string automātiski, bez ievades iespējas.
        oper = scanner.nextLine();

        //2. skaitlis
        out.println("2.skaitlis:");
        int y = scanner.nextInt();

        //rezultats
        out.println("Rezultāts:");
        if(oper.equals("+")) out.println(x + y);
        if(oper.equals("-")) out.println(x - y);
        if(oper.equals("*")) out.println(x * y);
        if(oper.equals("/")) out.println(x / y);
    }
}


