package com.AP;
import java.util.Scanner;
import static java.lang.System.out;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. skaitlis
        out.println("1. skaitlis:");
        while (!sc.hasNextFloat()) {
            out.println("SKAITLI!!!:");
            sc.next();}
        float x = sc.nextFloat();

        //darbība
        boolean darbiba = true;
        String oper = null; // oper piešķīru 0 vērtību, jo switch met kļūdu. Kodā oper vērtība tiks piešķirta pēc ievades.
        while (darbiba) {
            out.println("Ievadiet '/', '*', '+', '-'  darbību:");
            sc.nextLine();//nepieciešams,jo nextint nolasa string automātiski, bez ievades iespējas.
            oper = sc.nextLine();
            if (oper.equals("+") || oper.equals("-") || oper.equals("/") || oper.equals("*")) {
                darbiba = false;
            }
        }
        //2. skaitlis
        out.println("2. skaitlis:");
        while (!sc.hasNextFloat()) {
            out.println("Veselu skaitli!!!:");
            sc.next();
        }
        float y = sc.nextInt();

        out.println("Rezultāts:");
        switch (oper) {
            case "+" -> out.println(x + y);
            case "-" -> out.println(x - y);
            case "*" -> out.println(x * y);
            case "/" -> out.println(x / y);
        }
    }
}


