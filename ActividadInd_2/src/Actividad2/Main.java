package Actividad2;

public class Main {
     static void main() {
        Vehiculo vehiculo = new Vehiculo();
        Coche coche = new Coche();
        Bicicleta bicicleta = new Bicicleta();

        System.out.println("Vehículo: ");
        vehiculo.desplazar();

        System.out.println("Coche: ");
        coche.desplazar();
        coche.desplazar("automatico");
        coche.desplazar("manual");

        System.out.println("Bicicleta: ");
        bicicleta.desplazar();
    }
}
