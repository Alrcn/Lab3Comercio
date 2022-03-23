package paqComercio;

public class Restaurante {
    private String [] menuDiario;
    private int  numMenu;

    private int numMesas;
    private int capacidad;

    private Restaurante r1 = new Restaurante();

    public Restaurante(){}
    public Restaurante(int numMesas, int numMenu, int capacidad){

        this.numMenu = numMenu;
        this.numMesas = numMesas;
        this.capacidad = capacidad;

        menuDiario = new String[numMenu];
    }

    public void setMenuDiario(String[] menuDiario) {
        this.menuDiario = menuDiario;
    }

    public void setNumMenu(int numMenu) {
        this.numMenu = numMenu;
    }

    public void setNumMesas(int numMesas) {
        this.numMesas = numMesas;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String[] getMenuDiario() {
        return menuDiario;
    }

    public int getNumMenu() {
        return numMenu;
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
        if(this.r1 == o){// comparamos la direccion de memoria
            return true;

        }
        if(o instanceof Restaurante){//comparamos los atributos
            if(this.numMesas == ((Restaurante) o).numMesas &&
                    this.capacidad ==((Restaurante) o).capacidad &&
                    super.equals(o)) {
                return true;
            }return false;

        } return  false;
    }
}
