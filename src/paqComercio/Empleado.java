package paqComercio;

public class Empleado {

    private String nombre;
    private String direccion;
    private int tlf;
    private String email;
    private String fechainicio;
    private double salario;
    private String cargo;

    public Empleado(){}
    public Empleado(String nombre, String direccion, int tlf, String email,
                    String fechainicio, double salario, String cargo){

        this.nombre = nombre;
        this.direccion = direccion;
        this.tlf= tlf;
        this.email = email;
        this.fechainicio = fechainicio;
        this.salario = salario;
        this.cargo = cargo;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTlf() {
        return tlf;
    }

    public String getEmail() {
        return email;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public String toString(){
        String aux = nombre + " /" + direccion + " /" + tlf + " /" + email+ " /" + fechainicio
                + " /" + salario + " /" + cargo;
        return  aux;
    }

    public boolean equals(Object o){
        if(this == o){// comparamos la direccion de memoria
            return true;

        }
        if(o instanceof Empleado){//comparamos los atributos
            if(this.nombre == ((Empleado) o).nombre &&
                    this.direccion == ((Empleado) o).direccion &&
                    this.tlf == ((Empleado) o).tlf &&
                    this.email == ((Empleado) o).email &&
                    this.fechainicio == ((Empleado) o).fechainicio &&
                    this.salario == ((Empleado) o).salario &&
                    this.cargo == ((Empleado) o).cargo){
                return true;
            }return false;

        } return  false;
    }

    public Empleado copiar(){
        Empleado aux = new Empleado();
        aux.direccion = this.direccion;
        aux.nombre = this.nombre;
        aux.tlf = this.tlf;
        aux.email = this.email;
        aux.fechainicio = this.fechainicio;
        aux.salario = this.salario;
        aux.cargo = this.cargo;
        return aux;

    }
    

}
