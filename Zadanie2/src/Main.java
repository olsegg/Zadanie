public class Main {
    public static void main(String[] args) {
        KontoBankowe konto = new KontoBankowe(1000);

        konto.wplac(500);
        konto.wyplac(300);
        konto.wyplac(1500); // powinno pokazać komunikat

        System.out.println("Saldo: " + konto.getSaldo());
    }
}
