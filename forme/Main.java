package forme;

public class Main {
    public static void main(String[] args) {
        Quadrato quadrato = new Quadrato(10);
        quadrato.stampaQuadrato();

        Cerchio cerchio = new Cerchio(5);
        System.out.println("area cerchio:"+ cerchio.getArea());
        System.out.println("circonferenza cerchio:"+ cerchio.getCirconferenza());

    }
}
