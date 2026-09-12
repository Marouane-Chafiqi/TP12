package TP12;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
 
public class LogManager {
 
    String logPath;
 
    public LogManager(String logPath) {
        this.logPath = logPath;
    }
 
    public void log(String level, String message) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(logPath, true))) {
            pw.println(LocalDateTime.now() + " [" + level + "] " + message);
        } catch (Exception e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
 
}
 