package paqComercio;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Vehiculo v1 = new Vehiculo("audi","R8","4980 XLC");
    VehiculoVenta venta1 = new VehiculoVenta(200.0, 20,"audi","R8","4980 XLC");
    VehiculoParaReparar reparar1 = new VehiculoParaReparar("motor", false, 1,"audi","R8","4980 XLC");



        Vehiculo v = v1.copiar();
        System.out.println(v);

        VehiculoVenta venta = venta1.copiarV();
        System.out.println(venta);

        VehiculoParaReparar repara = reparar1.copiarR();
        System.out.println(repara);

    }
}
