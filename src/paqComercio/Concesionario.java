package paqComercio;

public class Concesionario extends Comercio {
    private VehiculoVenta [] v;
    private int numV;
    private int dondeColocarV = 0;
    private int dondeColocarR = 0;
    private VehiculoParaReparar [] r;
    private int numR;


    public Concesionario(){}
    public Concesionario(String nombre, String direccion, String cif, int totalVentas,int numEmpleados,int numStock,int num1, int num2){
        super(nombre,direccion,cif,totalVentas,numEmpleados,numStock);
        this.numV = 0;
        this.numR = 0;

        v = new  VehiculoVenta[num1];
        r = new VehiculoParaReparar[num2];


    }
    public void ordenar(VehiculoParaReparar[] r){
        for (int i = 0; i < r.length; i++)
        {
            for (int j = i + 1; j < r.length; j++)
            {
                VehiculoParaReparar aux;
                if (r[i].getPrioridad() < r[j].getPrioridad())
                {
                    aux = r[i];
                    r[i] = r[j];
                    r[j] = aux;
                }
            }
        }
    }

    public void setV(VehiculoVenta[] v) {
        this.v = v;
    }


    public void setR(VehiculoParaReparar[] r) {
        this.r = r;
    }



    public VehiculoVenta[] getV() {
        return v;
    }



    public VehiculoParaReparar[] getR() {
        return r;
    }



    public String toStringVehiculosVenta(){
        String aux = "";
        for(int i = 0; i < v.length; i++){
            aux = aux + v[i].toString();

        }
        return aux;
    }

    public String toStringVehiculosReparar(){
        String aux = "";
        for(int i = 0; i < r.length; i++){
            aux = aux + r[i].toString() +"\n";

        }
        return aux;
    }

    public VehiculoParaReparar recogerVehiculo(){
        VehiculoParaReparar aux = r[0];


        if(aux.getReparado()==true){
            r[0] = null;

            for(int i =0; i < r.length ; i++){
                r[i] = r[i+1];
            }
        }
        return aux ;
    }

    public void repararVehiculo(int pos){
        r[pos-1].setReparado(true);
    }


}
