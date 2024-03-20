package Applicazione;
import java.util.Scanner;

public class Credenziali {
    public static boolean accesso(boolean a) {
        a = false;

        String utente = "cavol00";
        String pwd = "dario";
        String y = " ";
        String x = " ";

        Scanner sc = new Scanner(System.in);

        while (!utente.equals(y) || !pwd.equals(x)) {
            System.out.print("Scrivere il nome utente: ");
            y = sc.nextLine();
            System.out.print("Scrivere la password: ");
            x = sc.nextLine();

            if (pwd.equals(x) && utente.equals(y)) {
                a = true;
            }else {
                System.out.println("Riprovare nome utente o password non validi");
            }
        }
        return a;
    }
}
