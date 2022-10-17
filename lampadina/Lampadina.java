package lampadina;

public class Lampadina {
    Stato stato;
    boolean electricity = true;
    public boolean getElectricity() {
        return electricity;
    }

    public void setElectricity(boolean electricity) {
        this.electricity = electricity;
    }



    enum Stato {
        ACCESA,
        SPENTA,
        ROTTA
    }
    public Lampadina(){
    }


    public Stato getStato() {

        return this.stato;
    }
}



