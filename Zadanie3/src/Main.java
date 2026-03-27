public class Main {
    public static void main(String[] args) {
        Pracownik p1 = new Programista("Jan", 8000, "Java");
        Pracownik p2 = new Menadzer("Anna", 10000, 2000);

        Pracownik[] pracownicy = {p1, p2};

        for (Pracownik p : pracownicy) {
            p.wyswietlInfo();
            System.out.println("-------------------");
        }
    }
}
