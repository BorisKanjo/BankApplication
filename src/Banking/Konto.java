package Banking;

import java.util.ArrayList;

public class Konto {

    private int idKonto;
    private int kontonummer;
    private int geheinzahl;
    private double kontostand;

    public Konto(int idKonto, int kontonummer, int geheinzahl, double kontostand) {
        this.idKonto = idKonto;
        this.kontonummer = kontonummer;
        this.geheinzahl = geheinzahl;
        this.kontostand = kontostand;
    }

    public Konto() {}

    public int getIdKonto() {
        return idKonto;
    }

    public int getKontonummer() {
        return kontonummer;
    }

    public int getGeheinzahl() {
        return geheinzahl;
    }

    //Kontostand sehen
    public double getKontostand() {
        return kontostand;
    }

    //Anzahlung
    public void einzahlen(double betrag) {
        kontostand += betrag;
    }

    //Auszahlung
    public void auszahlen(double betrag) {
        kontostand -= betrag;
    }
}
