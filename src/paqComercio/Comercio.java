package paqComercio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Comercio {

    private String nombre;
    private String direccion;
    private String cif;
    private int totalVentas;
    private double[][] ventasDiarias;
    private int nMes;
    private int nDia;
    private int [] stock;
    private int numStock;
    private Empleado [] empleados;
    private int numEmpleados;


    public Comercio(){}

    public Comercio(String nombre, String direccion, String cif, int totalVentas,int numEmpleados,int numStock){
        this.nombre = nombre;
        this.direccion = direccion;
        this.cif = cif;
        this.totalVentas = totalVentas;
        this.numEmpleados = numEmpleados;
        this.numStock = numStock;

        stock = new int[numStock];
        empleados = new Empleado[numEmpleados];
        ventasDiarias = new double[nMes][nDia];
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public void setTotalVentas(int totalVentas) {
        this.totalVentas = totalVentas;
    }

    public void setVentasDiarias(double[][] ventasDiarias) {
        this.ventasDiarias = ventasDiarias;
    }

    public void setStock(int[] stock) {
        this.stock = stock;
    }

    public void setNumStock(int numStock) {
        this.numStock = numStock;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public void setNumEmpleados(int numEmpleados) {
        this.numEmpleados = numEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCif() {
        return cif;
    }

    public int getTotalVentas() {
        return totalVentas;
    }

    public double[][] getVentasDiarias() {
        return ventasDiarias;
    }

    public int[] getStock() {
        return stock;
    }

    public int getNumStock() {
        return numStock;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public int getNumEmpleados() {
        return numEmpleados;
    }

    public String toString(){
        String aux = nombre + " /" + direccion + " /" + cif + " /" + totalVentas;
        return  aux;
    }

    public boolean equals(Object o) {
        if (this == o) {// comparamos la direccion de memoria
            return true;

        }
        if (o instanceof Comercio) {//comparamos los atributos
            if (this.nombre == ((Comercio) o).nombre &&
                    this.direccion == ((Comercio) o).direccion &&
                    this.cif == ((Comercio) o).cif &&
                    this.totalVentas == ((Comercio) o).totalVentas) {
                return true;
            }
            return false;

        }
        return false;
    }

        public Comercio copiar(){
            Comercio aux = new Comercio();

            aux.nombre = this.nombre;
            aux.direccion = this.direccion;
            aux.cif = this.cif;
            aux.totalVentas = this.totalVentas;
            aux.numEmpleados = this.numEmpleados;
            aux.numStock = this.numStock;

            // cambiar este System.arraycopy(this.ventasDiarias,0,aux.ventasDiarias,0,this.ventasDiarias.length);
            for(int i=0; i<nMes; i++) {
                for (int j = 0; j < nDia; j++) {
                    aux.ventasDiarias[i][j] = ventasDiarias[i][j];
                }
            }
            System.arraycopy(this.stock,0, aux.stock,0,this.stock.length);
            for (int i = 0; i < this.empleados.length; i++){
                aux.empleados[i] = empleados[i].copiar();
            }
            return aux;

        }

        public double calcularTotalVentas(){

        double aux = 0.0;
        for(int i  =0; i<nMes; i++){
                for(int j =0; j<nDia;j++){
                    aux = aux + ventasDiarias[i][j];
                }
            }
        return aux;
        }

        public double calcularVentasMensuales(int nMes){
        double aux = 0.0;
        for(int i = 0; i<nDia; i++){
            aux  = aux + ventasDiarias[nMes - 1][i];
        }
        return aux;
    }
    public int mesConMasVentas(){
        double aux;
        double aux2;
        int resultado = 0;
        aux = calcularVentasMensuales(0);
        for(int i = 1; i< nMes; i ++){
            aux2 = calcularVentasMensuales(i);
            if(aux2 > aux){
                aux2 = aux;
                resultado = i;
            }

            }
            return resultado;
        }

        public void actualizarVentas(int ventas){
            Calendar fechaActual = Calendar.getInstance();
            int mes = fechaActual.get(Calendar.MONTH);
            int dia = fechaActual.get(Calendar.DAY_OF_MONTH);
            DateFormat formatoFecha = new SimpleDateFormat("MM/dd");

            for(int i  =0; i<nMes; i++){
                for(int j =0; j<nDia;j++){

                    if(i == mes && j == dia){
                        totalVentas = totalVentas + ventas;

                    }
                }
            }
        }

        public double mostrarVentasMes(int mes){
            double aux = 0.0;
            for(int i = 0; i<nMes; i++){
                if(i == mes-1){
                aux = calcularVentasMensuales(mes);

                }
            }
            return aux;
            }
        public String mostrarStock(){

        return stock.toString();

    }


    }




