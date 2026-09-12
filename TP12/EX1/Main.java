package TP12;

import java.io.IOException;

public class Main {
 
    public static void main(String[] args) {
        try {
            System.out.println("=== Lecture input.txt ===");
            Text.readLines("input.txt");
 
        } catch (IOException e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
 
}
 