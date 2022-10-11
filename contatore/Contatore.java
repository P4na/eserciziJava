package contatore;

public class Contatore {
    int conto;

    public Contatore(int x){
        this.conto = x;
    }

    public int incrementa(int x){
        this.conto += x;
        return this.conto;
    }

    public int getConto() {
        return conto;
    }

    public int resetConto(){
        this.conto = 0;
        return this.conto;
    }


}

