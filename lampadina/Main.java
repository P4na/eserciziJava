package lampadina;

public class Main {
    public static void main(String[] args) {
        Lampadina lampadina = new Lampadina();
        for (int i = 0; i < 11; i++) {
            System.out.println(lampadina.click());
        };
    }
}
