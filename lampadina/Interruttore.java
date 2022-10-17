package lampadina;

public class Interruttore {
    int clicked;
    Lampadina lampadina;


    public Interruttore(Lampadina lampadina){
        this.lampadina = lampadina;
    }

    public void click() {
        if (clicked >= 10) {
            this.lampadina.stato = lampadina.stato.ROTTA;
        } else {
            if (lampadina.electricity){
                if (this.lampadina.stato == lampadina.stato.ACCESA) {
                    this.lampadina.stato = lampadina.stato.SPENTA;
                } else {
                    this.lampadina.stato = lampadina.stato.ACCESA;
                }
                clicked++;
            }
        }
        System.out.println(lampadina.getStato());
    }
}




