package Applicazione;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Scrittore extends FileWriter {
    static int vuoto = 0;

    public Scrittore(String file) throws IOException {
        super(file);

    }

    static Scanner sc = new Scanner(System.in);

    public static void ag() {
    String username = "cazzo";
    String password = "palle";
    String as = "sinergo efesto madonna iddio";

    try (FileWriter writer = new FileWriter("Applicazione/passwordManager.txt", true)) { // Cambiato il parametro a 'true'
        int nLinea = Lettore.leggiRigaVuota(0);
        System.out.println("Scrivi la il sito o applicazione");
        as = sc.nextLine();

        System.out.println("Scrivi l'username");
        username = sc.nextLine();

        System.out.println("Scrivi la password");
        password = sc.nextLine();
        


        boolean finito = false;
        while(!finito){
            if(vuoto>nLinea){
                writer.write( "Applicazione: "+ as +" Username: " + username + " Password: " + password);
                writer.flush();
                finito = true;
            }
            vuoto++;
            writer.write('\n');
        }
    } catch (IOException e) {
        System.out.println("Errore durante la scrittura delle credenziali.");
        e.printStackTrace();
    }
    System.out.println("Credenziali aggiunte con successo.");
}
}