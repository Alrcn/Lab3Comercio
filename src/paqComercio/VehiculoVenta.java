package paqComercio;

public class VehiculoVenta extends  Vehiculo{
    private double precio;
    private int descuento;


    public VehiculoVenta(){}
    public VehiculoVenta(double precio, int descuento, String marca, String modelo, String matricula ){
        super (marca, modelo, matricula);
        this.precio= precio;
        this.descuento = descuento;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public double getPrecio() {
        return precio;
    }

    public int getDescuento() {
        return descuento;
    }

    public String toString(){
        String aux = precio + " /" + descuento+" /" + super.toString();
        return  aux;
    }

    public boolean equals(Object o){
        if(this == o){// comparamos la direccion de memoria
            return true;

        }
        if(o instanceof VehiculoVenta){//comparamos los atributos
            if(this.descuento == ((VehiculoVenta) o).descuento && // ((VehiculoVenta) o).descuento downcasting convertimos algo de laclase superior a una inferior
                    this.precio == ((VehiculoVenta) o).precio&&
                    super.equals(o)){
                return true;
            }return false;

        } return  false;
    }

    public VehiculoVenta copiarV(){
        VehiculoVenta aux = new VehiculoVenta(this.precio,this.descuento,this.getMarca(), this.getModelo(), this.getMatricula());
            return aux;

    }
}
