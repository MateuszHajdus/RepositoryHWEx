package Ex1homework;

public class Ubranie {
    private final Material material;
    private String ubrania;
    private String kolor;

    public Ubranie(Material material, String ubrania, String koloro) {
        this.material = material;
        this.ubrania = ubrania;
        this.kolor = koloro;
    }

    public Material getMaterial() {
        return material;
    }

    public String getRodzajUbrania() {
        return ubrania;
    }

    public String getKoloro() {
        return kolor;
    }

    @Override
    public String toString() {
        return "Ubranie{" +
                "material=" + material +
                ", rodzajUbrania='" + ubrania + '\'' +
                ", koloro='" + kolor + '\'' +
                '}';
    }

    public static final Ubranie spodnie = new Ubranie(Material.BAWEŁNA, "Spodnie","Niebieski");
    public static final Ubranie koszula = new Ubranie(Material.POLIESTER, "Koszula","Biała");
    public static final Ubranie sweter = new Ubranie(Material.WEŁNA, "Sweter","Różowy");
    public static final Ubranie apaszka = new Ubranie(Material.JEDWAB, "Apaszka","Biało-Czarna");
    public static final Ubranie zasłony = new Ubranie(Material.LEN, "Zasłony","Beż");

    public static final Ubranie bielizna = new Ubranie(Material.BAWEŁNA, "Bielizna","Róż");
    public static final Ubranie bluza = new Ubranie(Material.POLIESTER, "Bluza","Czerń");
    public static final Ubranie szal = new Ubranie(Material.WEŁNA, "Szal","Żółty");
    public static final Ubranie dywan = new Ubranie(Material.JEDWAB, "Dywan","Czerwony");
    public static final Ubranie pokrowcesamochodowe = new Ubranie(Material.LEN, "Pokrowce Samochodowe","Zielone");
}
