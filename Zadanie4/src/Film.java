public class Film implements Odtwarzalny {

    @Override
    public void play() {
        System.out.println("Wyswietlam obraz...");
    }

    @Override
    public void stop() {
        System.out.println("Zatrzymano film.");
    }
}
