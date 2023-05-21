package cz.itnetwork.evidencepojisteni;

/**
 * Třída definuje vlastnosti pojištěnce.
 * @author Joseph
 */
public class PojistenaOsoba {
    private String jmeno;
    private String prijmeni;
    private String vek;
    private String telefonniCislo;
    
    /**
     * Konstruktor pro vytvoření objektu pojištěnce.
     * @param jmeno Jméno pojištěnce
     * @param prijmeni Přijmení pojištěnce
     * @param telefonniCislo Telefonní číslo pojištěnce
     * @param vek Věk pojištěnce
     */
    public PojistenaOsoba(String jmeno, String prijmeni, String telefonniCislo, String vek){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.telefonniCislo = telefonniCislo;
        this.vek = vek;
    }
    
    /**
     * Metoda vrací jméno pojištěnce.
     * @return Jméno pojištěnce
     */
    public String getJmeno(){
        return jmeno;
    }
    
    /**
     * Metoda nastavuje jméno pojištěnce.
     * @param jmeno Jméno pojištěnce
     */
    public void setJmeno(String jmeno){
        this.jmeno = jmeno;
    }
    
    /**
     * Metoda vrací přijmení pojištěnce.
     * @return Přijmení pojištěnce
     */
    public String getPrijmeni(){
        return prijmeni;
    }
    
    /**
     * Metoda nastavuje přijmení pojištěnce.
     * @param prijmeni Přijmení pojištěnce
     */
    public void setPrijmeni(String prijmeni){
        this.prijmeni = prijmeni;
    }
    
    /**
     * Metoda vrací telefonní číslo pojištěnce.
     * @return Telefonní číslo pojištěnce
     */
    public String getTelefonniCislo(){
        return telefonniCislo;
    }
    
    /**
     * Metoda nastavuje telefonní číslo pojištěnce.
     * @param telefonniCislo Telefonní číslo pojištěnce
     */
    public void setTelefoniCislo(String telefonniCislo){
        this.telefonniCislo = telefonniCislo;
    }
    
    /**
     * Metoda vrací věk pojištěnce.
     * @return Věk pojištěnce
     */
    public String getVek(){
        return vek;
    }
    
    /**
     * Metoda nastavuje věk pojištěnce.
     * @param vek Věk pojištěnce
     */
    public void setVek(String vek){
        this.vek = vek;
    }
    
    /**
     * Metoda formátuje výpis pojištěnce.
     * @return Ŕetězec
     */
    @Override
    public String toString(){
        return jmeno + " " + prijmeni + " " + vek + " " + telefonniCislo;
    }
}
