package Ex1homework;

import java.util.*;

public class Pralnia {
    private static final Comparator<Usluga> WG_MATERIAŁU = new Comparator<Usluga>() {
        @Override
        public int compare(Usluga o1, Usluga o2) {
            return o1.getUbranie().getMaterial().compareTo(o2.getUbranie().getMaterial());
        }
    };


    public List<Usluga> listaUslug = new ArrayList<>();
    private final Queue<Usluga> kolejkaUslugPriorytetowych = new PriorityQueue<>(WG_MATERIAŁU);

    public void dodajUsluge(Usluga usluga) {
        listaUslug.add(usluga);
        kolejkaUslugPriorytetowych.offer(usluga);

    }

    public void wykonanoUsluge(Usluga usluga) {
        listaUslug.remove(usluga);
        kolejkaUslugPriorytetowych.remove(usluga);
    }

    public void wykonajWszystkieUslugi() {
        while (kolejkaUslugPriorytetowych.peek() != null) {
            System.out.println("Zostało wyprane: " + kolejkaUslugPriorytetowych.poll());

        }
    }

    public List<Usluga> znajdzUslugiDlaKonkretnegoKlienta(String nazwisko) {
        List<Usluga> znajdzUslugiDlaKonkretnegoKlienta = new ArrayList<>();

        for (Usluga usluga : listaUslug) {
            if (usluga.getKlient().getNazwisko().equals(nazwisko)) {
                znajdzUslugiDlaKonkretnegoKlienta.add(usluga);
            }
        }
        if (znajdzUslugiDlaKonkretnegoKlienta.isEmpty()) {
            System.out.println("Nie ma takiego Klienta");
        }
        return znajdzUslugiDlaKonkretnegoKlienta;
    }
    public List<Usluga> UslugiZKonkretnymMaterialem(Material material) {
        List<Usluga> UslugiZKonkretnymMaterialem = new ArrayList<>();

        for (Usluga usluga : listaUslug) {
            if (usluga.getUbranie().getMaterial().equals(material)) {
                UslugiZKonkretnymMaterialem.add(usluga);
            }
        }
        if (UslugiZKonkretnymMaterialem.isEmpty()) {
            System.out.println("Nie ma usługi przydzielonej do danego materiału");
        }
        return UslugiZKonkretnymMaterialem;
    }



    public static void main(String[] args) {
        Pralnia pralnia = new Pralnia();

        pralnia.dodajUsluge(Usluga.uslugaJac);
        pralnia.dodajUsluge(Usluga.uslugaAgn);
        pralnia.dodajUsluge(Usluga.uslugaAga);
        pralnia.dodajUsluge(Usluga.uslugaAnd);
        pralnia.dodajUsluge(Usluga.uslugaZen);

        pralnia.dodajUsluge(Usluga.uslugaBar);
        pralnia.dodajUsluge(Usluga.uslugaJer);
        pralnia.dodajUsluge(Usluga.uslugaUrs);
        pralnia.dodajUsluge(Usluga.uslugaKar);
        pralnia.dodajUsluge(Usluga.uslugaJak);

        System.out.println("Lista usług: " + pralnia.listaUslug);

        System.out.println("");
        System.out.println("Dla konkretnego Klienta: " + pralnia.znajdzUslugiDlaKonkretnegoKlienta("Duda"));
        System.out.println("Dla konkretnego Klienta: " + pralnia.znajdzUslugiDlaKonkretnegoKlienta("Star"));
        System.out.println("Dla konkretnego Klienta: " + pralnia.znajdzUslugiDlaKonkretnegoKlienta("Brzęczek"));

        System.out.println("");
        System.out.println("Dla konkretnego materiału: " + pralnia.UslugiZKonkretnymMaterialem(Material.JEDWAB));
        System.out.println("Dla konkretnego materiału: " + pralnia.UslugiZKonkretnymMaterialem(Material.BAWEŁNA));

        System.out.println("");
        pralnia.wykonajWszystkieUslugi();

        pralnia.wykonanoUsluge(Usluga.uslugaJac);
        pralnia.wykonanoUsluge(Usluga.uslugaAgn);
        pralnia.wykonanoUsluge(Usluga.uslugaAga);
        pralnia.wykonanoUsluge(Usluga.uslugaAnd);
        pralnia.wykonanoUsluge(Usluga.uslugaZen);

        pralnia.wykonanoUsluge(Usluga.uslugaBar);
        pralnia.wykonanoUsluge(Usluga.uslugaJer);
        pralnia.wykonanoUsluge(Usluga.uslugaUrs);
        pralnia.wykonanoUsluge(Usluga.uslugaKar);
        pralnia.wykonanoUsluge(Usluga.uslugaJak);

        System.out.println("");
        System.out.println("Lista usług " + pralnia.listaUslug);
        System.out.println("Kolejka usług " + pralnia.kolejkaUslugPriorytetowych);



    }
}
