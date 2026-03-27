public class Pracownik {
    String imie;
    double pensja;

    public Pracownik(String imie, double pensja) {
        this.imie = imie;
        this.pensja = pensja;
    }

    public void wyswietlInfo() {
        System.out.println("Imie: " + imie);
        System.out.println("Pensja: " + pensja);
    }
}
