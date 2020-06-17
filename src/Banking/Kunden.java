package Banking;

import java.util.Date;

public class Kunden {

    private int idKunden;
    private String name;
    private String benutzername;
    private int age;
    private String Staatsangehoerigkeit;
    private Konto meinKonto;

    public Kunden(int idKunden, String name, String benutzername, int age, String staatsangehoerigkeit, Konto meinKonto) {
        this.idKunden = idKunden;
        this.name = name;
        this.benutzername = benutzername;
        this.age = age;
        this.Staatsangehoerigkeit = staatsangehoerigkeit;
        this.meinKonto = meinKonto;
    }

    public Kunden() {}

    public int getIdKunden() {
        return idKunden;
    }

    public String getName() {
        return name;
    }

    public String getBenutzername() {
        return benutzername;
    }

    public int getAge() {
        return age;
    }

    public String getStaatsangehoerigkeit() {
        return Staatsangehoerigkeit;
    }

    public Konto getMeinKonto() {
        return meinKonto;
    }
}
