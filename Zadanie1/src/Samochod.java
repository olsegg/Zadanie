public class Samochod {
    String marka;
    String model;
    int rokProdukcji;

    public Samochod(String marka, String model, int rokProdukcji) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
    }

    public void wyswietlInfo() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji: " + rokProdukcji);
        System.out.println("-------------------");
    }
}
