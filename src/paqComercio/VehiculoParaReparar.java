package paqComercio;

public class VehiculoParaReparar extends Vehiculo {
     private String averia;
     private boolean reparado;
     private int prioridad;


     public VehiculoParaReparar(){}
     public VehiculoParaReparar ( String averia, boolean reparado, int prioridad, String marca, String modelo, String matricula){
         super (marca, modelo, matricula);
         this.averia = averia;
         this.prioridad = prioridad;
         this.reparado = reparado;

     }
    public void setAveria(String averia) {
        this.averia = averia;
    }

    public void setReparado(boolean reparado) {
        this.reparado = reparado;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getAveria() {
        return averia;
    }

    public boolean getReparado() {
        return reparado;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public String toString(){
        String aux = averia + " /" + reparado +" /" + prioridad + "/" + super.toString();
        return  aux;
    }
    public boolean equals(Object o){
        if(this == o){// comparamos la direccion de memoria
            return true;

        }
        if(o instanceof VehiculoParaReparar){//comparamos los atributos
            if(this.averia == ((VehiculoParaReparar) o).averia
                && this.reparado ==((VehiculoParaReparar) o).reparado &&
                    this.prioridad ==((VehiculoParaReparar) o).prioridad &&
                    super.equals(o)) {
                return true;
            }return false;

        } return  false;
    }
    public  VehiculoParaReparar copiarR(){
         VehiculoParaReparar aux = new VehiculoParaReparar(this.averia, this.reparado, this.prioridad,this.getMarca(), this.getModelo(), this.getMatricula());

         return  aux;
    }

}
