package forme;

public class Cerchio {
    int raggio;

    public Cerchio(int raggio){
        this.raggio = raggio;
    }

    public int getRaggio() {
        return raggio;
    }

    public float getCirconferenza(){
        float circonfernza = (float)((2*Math.PI)*getRaggio());
        return circonfernza;
    }

    public float getArea(){
        float area = (float) (2*Math.PI);
        return area;
    }
}
