package lampadina;

public class Lampadina {
    Stato stato;
    int clicked;

    enum Stato {
        ACCESA,
        SPENTA,
        ROTTA
    }

    public Lampadina(){
        this.stato = Stato.SPENTA;
    }

    public Stato getStato() {
        return this.stato;
    }

    public Stato click(){
        if (clicked == 10){
            this.stato = Stato.ROTTA;
        } else {
            if (this.stato == Stato.ACCESA){
                this.stato = Stato.SPENTA;
            } else {
                this.stato = Stato.ACCESA;
            }
            clicked++;
        }
        return this.stato;
    }
}

