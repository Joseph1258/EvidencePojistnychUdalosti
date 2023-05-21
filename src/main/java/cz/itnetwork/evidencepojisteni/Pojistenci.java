package cz.itnetwork.evidencepojisteni;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Třída slouží k přidávání, hledání a výpisu pojištěnců do konzole.
 * @author Joseph
 */
public class Pojistenci {
    
    private Databaze databaze;
    private Scanner sc = new Scanner(System.in);
    
    /**
     * Konstruktor pro vytvoření nového pojištěnce.
     */
    public Pojistenci(){
        databaze = new Databaze();
    }
    
    /**
     * Přidání nového pojištěnce se základními údaji: jméno, přijmení, telefonní číslo, věk.
     * Metoda provádí kontrolu vstupu.
     */
    public void pridejNovehoPojistence(){
        boolean kontrolaVstupu = false;
        String jmeno = "";
        String prijmeni = "";
        String telefonniCislo = "";
        String vek = "";
        
        while(!kontrolaVstupu){
            System.out.println("Zadejte jméno pojištěného:");
            jmeno = sc.nextLine();
            System.out.println("Zadejte přijmení:");
            prijmeni = sc.nextLine();
            System.out.println("Zadejte telefoní číslo (bez mezer):");
            telefonniCislo = sc.nextLine();
            System.out.println("Zadejte věk:");
            vek = sc.nextLine();
            
            if (jeText(jmeno) && jeText(prijmeni) && jeCislo(telefonniCislo) && jeCislo(vek)){
                if (telefonniCislo.length() == 9){
                    kontrolaVstupu = true;
                }else{
                    System.out.println("Telefonní číslo musí obsahovat 9 číslic bez mezer. Prosím akci opakujte...");
                    System.out.println();
                }
            }else{
                System.out.println("Alespoň jedna vstupní hodnota byla špatně zadána. Prosím akci opakujte...");
                System.out.println();
            }
        }
        databaze.pridejNovehoPojisteneho(jmeno, prijmeni, telefonniCislo, vek);
        System.out.println();
        System.out.println("Data byla uložena. Pokračujte libovolnou klávesou...");
        sc.nextLine();
        System.out.println();
    }
    
    /**
     * Metoda vypisuje všehcny uložené pojištěnce.
     */
    public void vypisVsechnyPojistence(){
        for (int i = 0; i < databaze.getPojisteneOsoby().size(); i++){
            System.out.println(databaze.vypisPojistence(i));  
        }
        System.out.println();
        System.out.println("Pokračujte libovolnou klávesou...");
        sc.nextLine();
    }
    
    /**
     * Metoda vyhledá a vypíše hledaného pojištěnce podle jména a přijmení.
     */
    public void vyhledejPojisteneho(){
        System.out.println("Zadejte jméno pojištěného:");
        String jmeno = sc.nextLine();
        System.out.println("Zadejte přijmení:");
        String prijmeni = sc.nextLine();
        PojistenaOsoba vyhledanyPojistenec = databaze.najdiPojisteneho(jmeno, prijmeni);
        if (!vyhledanyPojistenec.equals(null)){
            System.out.println(vyhledanyPojistenec.toString());
        }else {
            System.out.println("Nebyly nalezeny žádné záznamy.");
        }
        System.out.println();
        System.out.println("Pokračujte libovolnou klávesou...");
        sc.nextLine();
        System.out.println();
    }
    
    /**
     * Metoda kontroluje, zda na vstupu bylo zadané číslo.
     * @param polozkaVstupu Telefonní číslo nebo věk pojištěnce
     * @return Rozhodnutí, zda se jedná o číslo
     */
    private boolean jeCislo(String polozkaVstupu){
        boolean jeCislo = true;
        for (int i = 0; i < polozkaVstupu.length(); i++){
            if (!Character.isDigit(polozkaVstupu.charAt(i))){
                jeCislo = false;
            }
        }
        return jeCislo;
    }
    
    /**
     * Metoda kontroluje, zda na vstupu byl zadaný text.
     * @param polozkaVstupu Jméno nebo přijmení pojištěnce
     * @return Rozhodnutí, zda se jedná o text
     */
    private boolean jeText(String polozkaVstupu){
        boolean jeText = true;
        for (int i = 0; i < polozkaVstupu.length(); i++){
            if (!Character.isLetter(polozkaVstupu.charAt(i))){
                jeText = false;
            }
        }
        return jeText;
    }
}
