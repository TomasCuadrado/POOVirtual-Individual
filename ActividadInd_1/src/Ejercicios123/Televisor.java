package Ejercicios123;

public class Televisor {
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private TipoTV tipo;
    private int tamanio;
    private ResolucionTV resolucion;
    private boolean esSmart;
    private boolean encendido = false;

    public Televisor(String marca, String modelo, int anioFabricacion,
                     TipoTV tipo, int tamanio,
                     ResolucionTV resolucion, boolean esSmart) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.tipo = tipo;
        this.tamanio = tamanio;
        this.resolucion = resolucion;
        this.esSmart = esSmart;
    }

    public String mostrarTelevisor(){
        return (this.marca + " " + this.modelo + " -- " + this.tipo.getValor() + " -- " + this.tamanio + '"' + " -- " + this.resolucion.getValor() + " -- " + (this.esSmart? "Smart" : "No Smart"));
    }

    public void encender(){
        this.encendido = true;
    }
    public void apagar(){
        this.encendido = false;
    }

    // getters y settters


    public boolean isEncendido() {
        return encendido;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public TipoTV getTipo() {
        return tipo;
    }

    public void setTipo(TipoTV tipo) {
        this.tipo = tipo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public ResolucionTV getResolucion() {
        return resolucion;
    }

    public void setResolucion(ResolucionTV resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isEsSmart() {
        return esSmart;
    }

    public void setEsSmart(boolean esSmart) {
        this.esSmart = esSmart;
    }
}
