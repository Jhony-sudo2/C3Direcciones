package com.cdirecciones;

import java.io.Reader;
import java.io.StringReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("INGRESE EL CODIGO: ");
        Scanner n = new Scanner(System.in);
        String Input = n.nextLine();
        Reader reader = new StringReader(Input);
        Lexer l = new Lexer(reader);
        parser p = new parser(l);
        try {
            p.parse();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}