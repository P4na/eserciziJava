package forme;

public class Quadrato {
    int lato;

    public Quadrato(int lato){
        this.lato = lato;
    }

    public float getPerimetro(){
        return this.lato*4;
    }

    public float getLato() {
        return lato;
    }

    public void stampaQuadrato(){

        for (int i = 0; i < getLato(); i++) {
            System.out.printf("_ ");
        }
        System.out.println();
        for (int i = 0; i < (getLato()/2); i++) {
            String stringaLato = "|";
            for (int j = 0; j < getLato(); j++) {
                stringaLato = stringaLato + " ";
            }
            stringaLato = stringaLato + "|";
            System.out.println(stringaLato);
        }
        for (int i = 0; i < getLato(); i++) {
            System.out.printf("_ ");
        }
    }

}
