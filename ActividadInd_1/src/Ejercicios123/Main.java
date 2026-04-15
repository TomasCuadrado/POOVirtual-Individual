package Ejercicios123;

public class Main {
    public static void main(String[] args) {
        Televisor tele1 = new Televisor(
                "Samsung",
                "QN70F",
                2025,
                TipoTV.O,
                70,
                ResolucionTV.UHD_4K,
                true);

        Televisor tele2 = new Televisor(
                "LG",
                "QNED80A",
                2024,
                TipoTV.L,
                80,
                ResolucionTV.UHD_4K,
                false
        );

        // Ejercicio 2
        System.out.println(tele1.mostrarTelevisor());
        System.out.println(tele2.mostrarTelevisor());

        tele2.setTamanio(70);
        tele1.setTamanio(88);

        System.out.println(tele1.mostrarTelevisor());
        System.out.println(tele2.mostrarTelevisor());

        // Ejercicio 3
        tele1.encender();
        tele2.apagar();

        System.out.println(tele1.isEncendido()? "Tele1: Está encendido" : "Tele1: No está encendido");
        System.out.println(tele2.isEncendido()? "Tele2: Está encendido" : "Tele2: No está encendido");
    }
}