public class Main {
    public static void main(String[] args) {
        Odtwarzalny o1 = new Film();
        Odtwarzalny o2 = new Piosenka();

        o1.play();
        o1.stop();

        o2.play();
        o2.stop();
    }
}
