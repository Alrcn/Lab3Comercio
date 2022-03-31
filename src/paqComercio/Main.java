package paqComercio;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Vehiculo v1 = new Vehiculo("audi","R8","4980 XLC");
    VehiculoVenta venta1 = new VehiculoVenta(200.0, 20,"audi","R8","4980 XLC");
    VehiculoVenta venta2 = new VehiculoVenta(300.0, 20,"seat","ateca","3980 XLC");
    VehiculoVenta venta3 = new VehiculoVenta(250.0, 20,"mercedes","glc","1980 XLC");
    VehiculoVenta venta4 = new VehiculoVenta(150.0, 20,"renault","clip","2980 XLC");
    VehiculoVenta venta5 = new VehiculoVenta(120.0, 20,"opel","astra","5980 XLC");
    VehiculoParaReparar reparar1 = new VehiculoParaReparar("motor", false, 1,"audi","R8","4980 XLC");
    VehiculoParaReparar reparar2 = new VehiculoParaReparar("motor", false, 2,"kia","1","4980 XLC");
    VehiculoParaReparar reparar3 = new VehiculoParaReparar("motor", false, 4,"suzuki","2","4980 XLC");
    VehiculoParaReparar reparar4 = new VehiculoParaReparar("motor", false, 3,"honda","3","4980 XLC");
    VehiculoParaReparar reparar5 = new VehiculoParaReparar("motor", false, 5,"peugeot","308","4980 XLC");
    Restaurante r1= new Restaurante("pepe","calle 1","45833",30,4,7,10,30);
    Concesionario c = new Concesionario("taller","calle2","1234",10,2,8,5,5);


        /*Vehiculo v = v1.copiar();
        System.out.println(v);

        VehiculoVenta venta = venta1.copiarV();
        System.out.println(venta);

        VehiculoParaReparar repara = reparar1.copiarR();
        System.out.println(repara);*/
        r1.fijarMenuDelDia(1,"Patatas");
        r1.fijarMenuDelDia(2,"Sopa");
        r1.fijarMenuDelDia(3,"Menestra de verduras");
        r1.fijarMenuDelDia(4,"Marisco");
        r1.fijarMenuDelDia(5,"Salchichas");
        r1.fijarMenuDelDia(6,"Paella");
        r1.fijarMenuDelDia(7,"Espagueti");
        System.out.println(r1.verMenuDelDia(4));


        c.anadirVenta(venta1);
        c.anadirVenta(venta2);
        c.anadirVenta(venta3);
        c.anadirVenta(venta4);
        c.anadirVenta(venta5);

        c.anadirReparar(reparar1);
        c.anadirReparar(reparar2);
        c.anadirReparar(reparar3);
        c.anadirReparar(reparar4);
        c.anadirReparar(reparar5);

        c.ordenar(c.getR());

        System.out.println(c.toStringVehiculosReparar());

        System.out.println(c.toStringVehiculosVenta());
        c.repararVehiculo(1);
        System.out.println(c.toStringVehiculosReparar());

        System.out.println(c.toStringVehiculosReparar());
        c.recogerVehiculo();
        System.out.println(c.toStringVehiculosReparar());
        System.out.println(c.venderVehiculo(1).toString());
        System.out.println(c.toStringVehiculosVenta());


    }
}
