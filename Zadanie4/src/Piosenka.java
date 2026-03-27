public class Piosenka implements Odtwarzalny {

    @Override
    public void play() {
        System.out.println("Gram muzyke...");
    }

    @Override
    public void stop() {
        System.out.println("Zatrzymano piosenke.");
    }
}
