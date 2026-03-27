public class KontoBankowe {
    private double saldo;

    public KontoBankowe(double saldoPoczatkowe) {
        this.saldo = saldoPoczatkowe;
    }

    public void wplac(double kwota) {
        saldo += kwota;
    }

    public void wyplac(double kwota) {
        if (kwota <= saldo) {
            saldo -= kwota;
        } else {
            System.out.println("Brak wystarczajacych srodkow!");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
