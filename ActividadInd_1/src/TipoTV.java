public enum TipoTV {
    P("Plasma"),
    L("LCD"),
    O("OLED");

    private final String valor;

    TipoTV(String valor){
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
