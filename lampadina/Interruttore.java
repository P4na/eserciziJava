package lampadina;

public class Interruttore {
    int clicked;
    Lampadina lampadina;



    public Interruttore(Lampadina lampadina){
        this.lampadina = lampadina;
    }

    public void click() {
        if (clicked == 10) {
            this.lampadina.stato = Lampadina.Stato.ROTTA;
        } else {
            if (this.lampadina.stato == lampadina.stato.ACCESA) {
                this.lampadina.stato = Stato.SPENTA;
            } else {
                this.lampadina.stato = Stato.ACCESA;
            }
            clicked++;
        }
        return this.stato;
        }


    public Stato getStato() {
        return this.lampadina.stato;
    }
    }
