package Applicazione;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Lettore {
    
    static Scanner sc = new Scanner(System.in);

    public static int  leggiRigaVuota(int nLinea) {
        nLinea = 0;
        try (FileReader reader = new FileReader("Applicazione/passwordManager.txt");
            BufferedReader bufferedReader = new BufferedReader(reader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    return nLinea;
                }
                nLinea++;
            }
                
        } catch (IOException e) {
            System.out.println("Errore durante la lettura della linea: " + e.getMessage());
        }
        return nLinea;
    }
    

    public static void ts() {
        String input;
        System.out.println("Scrivere che password devo cercare.");
        input = sc.next();

        try (FileReader reader = new FileReader("Applicazione/passwordManager.txt");
                BufferedReader bufferedReader = new BufferedReader(reader)) {

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(input)) {
                    System.out.println("Credenziali trovate: ");
                    System.out.println(line);

                }
            }
        } catch (IOException e) {
            System.out.println("Errore durante la lettura del file: " + e.getMessage());
        }
    }
}
