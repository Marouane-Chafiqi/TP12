package TP12;

import java.util.Arrays;
import java.util.List;
 
public class Mainwrite {
 
    public static void main(String[] args) {
 
        LogManager logger = new LogManager("application.log");
        logger.log("INFO", "Demarrage");
        logger.log("ERROR", "Connexion echouee");
 
        List<String> header = Arrays.asList("id", "nom", "score");
        List<String[]> rows = Arrays.asList(
                new String[] { "1", "Marwan", "85" },
                new String[] { "2", "Amine", "92" }
        );
        Writer.write("report.csv", header, rows);
 
        HtmlGenerator.write("index.html", "Ma page", "Bienvenue !");
 
        System.out.println("Fichiers generes.");
    }
 
}
 