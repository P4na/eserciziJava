package contatore;

public class Main {
    public static void main(String[] args) {

        int num = 1;
        Contatore contatore = new Contatore(num);
        System.out.println(contatore.conto);
        contatore.incrementa(1);
        System.out.println("nuovo conto " + contatore.getConto());


    }
}
