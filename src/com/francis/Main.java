package com.francis;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        printOut("Enter sentence to tokenize\n");
        Scanner scanner = new Scanner(System.in);

        Iterator<String> iterator = tokenizestr(scanner.nextLine()).iterator();
        printOut("{ ");
        while (iterator.hasNext()){
            printOut(iterator.next() + " , ");
        }

        printOut(" }");

    }

    static Vector<String> tokenizestr(String string){
        Vector vector = new Vector(Arrays.asList(string.split("\\s+")));

        return vector;
    }

    static void printOut(String string){
        System.out.print(string);
    }
}
