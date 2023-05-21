package cz.itnetwork.evidencepojisteni;

import java.util.ArrayList;

/**
 * Třída se stará o uložení, vypis a vyhledání pojištěnců.
 * @author Joseph
 */
public class Databaze {
    
    private ArrayList<PojistenaOsoba> pojisteneOsoby;
    
    /**
     * Konstruktor
     */
    public Databaze(){
        pojisteneOsoby = new ArrayList<>();
    }
    
    /**
     * Metoda přidává nového pojištěnce do seznamu.
     * @param jmeno Jméno pojištěnce
     * @param prijmeni Přijmení pojištěnce
     * @param telefonniCislo Telefonní číslo pojištěnce
     * @param vek Věk pojištěnce
     */
    public void pridejNovehoPojisteneho(String jmeno, String prijmeni, String telefonniCislo, String vek){
        pojisteneOsoby.add(new PojistenaOsoba(jmeno, prijmeni, telefonniCislo, vek));
    }
    
    /**
     * Metoda vyhledá požadovaného pojištěnce podle jména a přijmení.
     * @param jmeno Jméno pojištěnce
     * @param prijmeni Přijmení pojištěnce
     * @return Nalezený pojištěnec
     */
    public PojistenaOsoba najdiPojisteneho(String jmeno, String prijmeni){
        PojistenaOsoba nalezenec = null;
        //cyklus projde všechny záznamy a porovná u každé položky jméno a přijmení pojištěnce
        for (PojistenaOsoba jednaOsoba : pojisteneOsoby){
            if (jednaOsoba.getJmeno().equalsIgnoreCase(jmeno) && jednaOsoba.getPrijmeni().equalsIgnoreCase(prijmeni)){
                nalezenec = jednaOsoba;
            }  
        }
        return nalezenec;
    }
    
    /**
     * Metoda pro výpis pojištěnce.
     * @param index Položka ze seznamu
     * @return Zformátovaný výstup o pojištěnci
     */
    public String vypisPojistence(int index){
            return pojisteneOsoby.get(index).toString();
    }
    
    /**
     * Metoda vrací seznam všech uložených pojištěnců.
     * @return Seznam pojištěnců
     */
    public ArrayList<PojistenaOsoba> getPojisteneOsoby(){
        return pojisteneOsoby;
    }
}
