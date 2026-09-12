package TP12;

import java.io.PrintWriter;

public class HtmlGenerator {
 
    public static void write(String path, String title, String body) {
        try (PrintWriter pw = new PrintWriter(path)) {
            pw.println("<html><head><title>" + title + "</title></head>");
            pw.println("<body><h1>" + title + "</h1><p>" + body + "</p></body></html>");
        } catch (Exception e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
 
}