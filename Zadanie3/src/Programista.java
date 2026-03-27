public class Programista extends Pracownik {
    String jezykProgramowania;

    public Programista(String imie, double pensja, String jezykProgramowania) {
        super(imie, pensja);
        this.jezykProgramowania = jezykProgramowania;
    }

    @Override
    public void wyswietlInfo() {
        super.wyswietlInfo();
        System.out.println("Jezyk programowania: " + jezykProgramowania);
    }
}
