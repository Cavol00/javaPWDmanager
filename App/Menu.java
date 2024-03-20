package Applicazione;

import java.util.Scanner;

public class Menu {
    static boolean continua = false;

    public static void men() {
        Scanner sc = new Scanner(System.in);
        while (!continua) {

            if (Credenziali.accesso(true)) {
                System.out.println("Benvenuto cosa vuole fare?");
                System.out.println("Scrivere il numero per accedere al menu");
                System.out.println("1: Vedere le password");
                System.out.println("2: Aggiungere nuova password");
                System.out.println("3: Esci");
                int scelta = sc.nextInt();
                switch (scelta) {
                    case 1:
                        Lettore.ts();
                        break;
                    case 2:
                        Scrittore.ag();
                        break;
                    case 3:
                        System.out.println("Grazie spero di essere stato utile. Addio frocio.");
                        break;
                    default:
                        System.out.println("Input non valido mettere 1, 2, 3 per favore.");
                        break;
                }
                System.out.println("Si desidera continuare?");
                System.out.println("1: Si");
                System.out.println("2: No");

                int sceltaDue = sc.nextInt();

                switch (sceltaDue) {
                    case 1:
                    continua = false;
                    break;
                    case 2:
                    continua = true;
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
