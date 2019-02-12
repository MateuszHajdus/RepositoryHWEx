package Ex1homework;

public class Usluga {
    private  Klient klient;
    private final Ubranie ubranie;

    public Usluga(Klient klient, Ubranie ubranie) {
        this.klient = klient;
        this.ubranie = ubranie;

    }

    public Klient getKlient() {
        return klient;
    }

    public Klient setKlient(){
        return klient;
    }

    public Ubranie getUbranie() {
        return ubranie;
    }

    @Override
    public String toString() {
        return "\n" + "Usluga{" +
                "klient=" + klient +
                ", ubranie=" + ubranie +
                '}';
    }

    public static final Usluga uslugaJac = new Usluga(Klient.Jacek,Ubranie.spodnie);
    public static final Usluga uslugaAgn = new Usluga(Klient.Agnieszka,Ubranie.koszula);
    public static final Usluga uslugaAga = new Usluga(Klient.Agata,Ubranie.sweter);
    public static final Usluga uslugaAnd = new Usluga(Klient.Andrzej,Ubranie.apaszka);
    public static final Usluga uslugaZen = new Usluga(Klient.Zenon,Ubranie.zasłony);

    public static final Usluga uslugaBar = new Usluga(Klient.Bartek,Ubranie.bielizna);
    public static final Usluga uslugaJak = new Usluga(Klient.Jakub,Ubranie.bluza);
    public static final Usluga uslugaJer = new Usluga(Klient.Jerzy,Ubranie.szal);
    public static final Usluga uslugaUrs = new Usluga(Klient.Urszula,Ubranie.dywan);
    public static final Usluga uslugaKar = new Usluga(Klient.Karolina,Ubranie.pokrowcesamochodowe);
}

