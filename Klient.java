package Ex1homework;

import java.util.Objects;

public class Klient {

    private String imie;
    private String nazwisko;

    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klient klient = (Klient) o;
        return imie.equals(klient.imie) &&
                nazwisko.equals(klient.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko);
    }

    @Override
    public String toString() {
        return "Klient{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
    public static final Klient Jacek = new Klient("Jacek", "Gajewski");
    public static final Klient Agnieszka = new Klient("Agnieszka", "Nowak");
    public static final Klient Agata = new Klient("Agata", "Bziuk");
    public static final Klient Andrzej = new Klient("Andrzej", "Duda");
    public static final Klient Zenon = new Klient("Zenon", "Martyniuk");

    public static final Klient Bartek = new Klient("Bartek", "Małysz");
    public static final Klient Jakub = new Klient("Jakub", "Ciura");
    public static final Klient Jerzy = new Klient("Jerzy", "Brzęczek");
    public static final Klient Urszula = new Klient("Urszula", "Star");
    public static final Klient Karolina = new Klient("Karolina", "Książkiewicz");
}
