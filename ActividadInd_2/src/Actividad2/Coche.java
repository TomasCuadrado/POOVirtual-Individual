package Actividad2;

public class Coche extends Vehiculo{

    @Override
    public void desplazar(){
        System.out.println("Vehiculo desplazándose");
    }

    public void desplazar(String modoDesplazamiento){
        switch (modoDesplazamiento) {
            case "automatico":
                System.out.println("Coche desplazándose en automático");
                break;
            case "manual":
                System.out.println("Coche desplazándose en manual");
                break;
        }

    }
}
