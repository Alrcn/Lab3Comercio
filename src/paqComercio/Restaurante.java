package paqComercio;

public class Restaurante extends Comercio{
    private String [] menuDiario;

    String cif;
    private int numMesas;
    private int capacidad;



    public Restaurante(){}
    public Restaurante(String nombre, String direccion,  String cif, int totalVentas,int numEmpleados,int numStockint, int numMesas, int capacidad){

        super(nombre,direccion,cif,totalVentas,numEmpleados,numStockint);
        this.numMesas = numMesas;
        this.capacidad = capacidad;

        menuDiario = new String[7];
    }



    public void setNumMesas(int numMesas) {
        this.numMesas = numMesas;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }


    public int getNumMesas() {
        return numMesas;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String toString(){
        String aux = numMesas + " /" + capacidad +" /"+ super.toString();
        return  aux;
    }
    public boolean equals(Object o){
        if(this == o){// comparamos la direccion de memoria
            return true;

        }
        if(o instanceof Restaurante){//comparamos los atributos
            if(this.cif == ((Restaurante) o).cif &&
                    super.equals(o)) {
                return true;
            }return false;

        } return  false;
    }

    public void fijarMenuDelDia(int dia, String menu) {

        menuDiario[dia-1] = menu;

    }

    public String verMenuDelDia(int dia){

        return menuDiario[dia-1].toString();
    }

    }
