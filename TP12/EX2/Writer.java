package TP12;

import java.io.PrintWriter;
import java.util.List;
 
public class Writer {
 
    public static void write(String path, List<String> header, List<String[]> rows) {
        try (PrintWriter pw = new PrintWriter(path)) {
            pw.println(String.join(",", header));
            for (String[] row : rows) {
                pw.println(String.join(",", row));
            }
        } catch (Exception e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
 
}
 