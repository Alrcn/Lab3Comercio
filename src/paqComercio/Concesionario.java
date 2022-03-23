package paqComercio;

public class Concesionario extends Comercio {
    private VehiculoVenta [] v;
    private int numV;
    private VehiculoParaReparar [] r;
    private int numR;
    private Concesionario cn1 = new Concesionario();

    public Concesionario(){}
    public Concesionario(int numV,int numR ){
        this.numV = numV;
        this.numR = numR;

        v = new  VehiculoVenta[numV];
        r = new VehiculoParaReparar[numR];

    }

    public void setV(VehiculoVenta[] v) {
        this.v = v;
    }

    public void setNumV(int numV) {
        this.numV = numV;
    }

    public void setR(VehiculoParaReparar[] r) {
        this.r = r;
    }

    public void setNumR(int numR) {
        this.numR = numR;
    }

    public VehiculoVenta[] getV() {
        return v;
    }

    public int getNumV() {
        return numV;
    }

    public VehiculoParaReparar[] getR() {
        return r;
    }

    public int getNumR() {
        return numR;
    }

    public String vervehiculosVenta(){
        String aux = "";
        for(int i = 0; i < numV; i++){
            aux = aux + v[i].toString();

        }
        return aux;
    }



}
