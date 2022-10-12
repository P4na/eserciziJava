package lampadina;

public class Main {
    public static void main(String[] args) {
        Interruttore interruttore1 = new Interruttore();
        Interruttore interruttore2 = new Interruttore();
        Lampadina lampadina = new Lampadina();
        for (int i = 0; i < 11; i++) {
            System.out.println(lampadina.interruttore.click());
        };
    }
}
