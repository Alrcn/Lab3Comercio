package paqComercio;

import java.util.Objects;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String matricula;


    public Vehiculo (){
    }

    public Vehiculo (String marca, String modelo, String matricula){
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String toString(){
        String aux = modelo + " /" + marca + " /" + matricula;
        return  aux;
    }
    public boolean equals(Object o){
        if(this == o){// comparamos la direccion de memoria
            return true;

        }
        if(o instanceof Vehiculo){//comparamos los atributos
            if(this.matricula == ((Vehiculo) o).matricula &&
                    this.marca == ((Vehiculo) o).marca &&
                    this.modelo == ((Vehiculo) o).modelo){
                return true;
            }return false;

        } return  false;
    }

    public Vehiculo copiar(){
        Vehiculo aux = new Vehiculo();
        aux.modelo = this.modelo;
        aux.marca = this.marca;
        aux.matricula = this.matricula;
        return aux;

    }

}
