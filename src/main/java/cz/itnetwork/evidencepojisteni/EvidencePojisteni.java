package cz.itnetwork.evidencepojisteni;

import java.util.Scanner;

/**
 * Hlavní spouštěcí třída.
 * @author Joseph
 */
public class EvidencePojisteni {

    /**
     * Hlavní spouštěcí metoda.
     * @param args 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pojistenci pojistenec = new Pojistenci();
        String volba = "";
        
        //hlavní cyklus
        while (!volba.equals("4")){
            System.out.println("--------------------------");
            System.out.println("Evidence pojištěných");
            System.out.println("--------------------------");
            System.out.println("Vyberte si akci:");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Konec");
            volba = sc.nextLine();
            System.out.println();
            //reakce na volbu
            switch (volba){
                case "1":
                    pojistenec.pridejNovehoPojistence();
                    break;
                case "2":
                    pojistenec.vypisVsechnyPojistence();
                    break;
                case "3":
                    pojistenec.vyhledejPojisteneho();
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Neplatná volba, stiskněte libovolnou klávesu a opakujte volbu.");
                    sc.nextLine();
                    break;
            }
        }
    }
}
